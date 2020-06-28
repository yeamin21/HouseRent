package Payment;

import Services.PaymentService;
import Tenant.TenantInfo;

import java.util.UUID;

public class PaymentAccount {


    private UUID paymentAccountID;
    private TenantInfo tenantInfo;
    private double totalAmountToPay,totalPaid, totalDuePayment;
    PaymentService paymentService;

    public PaymentAccount()
    {
        paymentAccountID=UUID.randomUUID();
    }
    public UUID getPaymentAccountID()
    {
        return this.paymentAccountID;
    }
    public void  setPaymentService(PaymentService paymentService)
    {
       this.paymentService=paymentService;
    }


    public double getTotalAmountToPay() {
        return totalAmountToPay=paymentService.getAmountToPay()+totalAmountToPay;
    }

    public void setTotalAmountToPay(double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }

    public double getTotalPaid() {
        return totalPaid=paymentService.getPaidAmount()+totalPaid;
    }

    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    public double getTotalDuePayment() {
        return totalDuePayment=paymentService.getDueAmount()+totalDuePayment;
    }

    public void setTotalDuePayment(double totalDuePayment) {
        this.totalDuePayment = totalDuePayment;
    }
}
