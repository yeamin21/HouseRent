package Payment;

import Services.PaymentService;

import java.util.Date;
import java.util.UUID;

public class Rent extends PaymentAccount implements PaymentService {

    private UUID paymentID;
    private Date paymentDate;
    private double paymentAmount;
    private double amountToPay;



    @Override
    public void setAmountToPay(double amountToPay) {
        this.amountToPay=amountToPay;
    }

    @Override
    public double getAmountToPay() {
        return this.amountToPay;
    }

    @Override
    public void setPaidAmount(double paidAmount) {
        this.paymentAmount= paidAmount;
    }

    @Override
    public double getPaidAmount() {
        return this.paymentAmount;
    }

    @Override
    public double getDueAmount() {
        return this.getAmountToPay()-this.getPaidAmount();
    }

    @Override
    public void setPaymentDate(Date date) {
        this.paymentDate=date;
    }

    @Override
    public Date getPaymentDate() {
        return this.paymentDate;
    }
}
