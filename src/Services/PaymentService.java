package Services;

import java.util.Date;
import java.util.UUID;

public interface PaymentService {

    default UUID paymentID()
    {
       return UUID.randomUUID();
    }
    void setAmountToPay(double amountToPay);
    double getAmountToPay();
    void setPaidAmount(double paidAmount);
    double getPaidAmount();
    double getDueAmount();
    void setPaymentDate(Date date);
    Date getPaymentDate();
}
