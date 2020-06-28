package Payment;

public class ElectricityBillGenerator extends CurrentBill{
   private double currentUnit, previousUnit;
   public double costPerUnit;

    public double getCurrentUnit() {
        return currentUnit;
    }

    public void setCurrentUnit(double currentUnit) {
        this.currentUnit = currentUnit;
    }

    public double getPreviousUnit() {
        return previousUnit;
    }

    public void setPreviousUnit(double previousUnit) {
        this.previousUnit = previousUnit;
    }

    public void setAmountToPay() {
        super.setAmountToPay((this.currentUnit-this.previousUnit)*this.costPerUnit);
    }
}
