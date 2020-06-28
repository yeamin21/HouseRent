import Payment.*;
import Room.Room;
import Services.PaymentService;
import Services.TenantService;
import Tenant.ArrivalTenant;
import Tenant.TenantInfo;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Room room=new Room();
        room.setRoomNo("100");
        room.setNoOfRoom(2);




        TenantService tenantService=new ArrivalTenant();
        tenantService.setDate(new Date());

        TenantInfo tenantInfo=new TenantInfo();
        tenantInfo.setNID("5s5ds5dse");
        tenantInfo.setRoom(room);
        tenantInfo.setTenantStatus(tenantService);


        System.out.println(tenantInfo.getNID());
        System.out.println(tenantInfo.getRoom().getRoomNo());
        System.out.println(tenantInfo.getTenantStatus().getTenantType());
        System.out.println(tenantInfo.getTenantStatus().getDate());



       PaymentAccount paymentAccount=new PaymentAccount();

       PaymentService advanced=new AdvancedPayment();
       advanced.setAmountToPay(5000);
       advanced.setPaidAmount(4000);

       paymentAccount.setPaymentService(advanced);
        System.out.println("ID for Advanced: "+advanced.paymentID());
        System.out.println("To Pay: "+paymentAccount.getTotalAmountToPay());
        System.out.println("Total Paid: "+paymentAccount.getTotalPaid());
        System.out.println("Due: "+paymentAccount.getTotalDuePayment());
        System.out.println(advanced.getDueAmount());


        PaymentService gas=new GasBill();

        gas.setAmountToPay(500);
        gas.setPaidAmount(350);
        System.out.println("ID for GAS: "+gas.paymentID());

        paymentAccount.setPaymentService(gas);
        System.out.println("To Pay: "+paymentAccount.getTotalAmountToPay());
        System.out.println("Total Paid: "+paymentAccount.getTotalPaid());
        System.out.println("Due: "+paymentAccount.getTotalDuePayment());










    }
}
