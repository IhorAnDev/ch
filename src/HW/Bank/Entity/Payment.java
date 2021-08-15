package HW.Bank.Entity;

public class Payment {
    private Bill platezh;

    public Payment(Bill platezh) {
        this.platezh = platezh;
    }

    public Bill getPlatezh() {
        return platezh;
    }

    public void setPlatezh(Bill platezh) {
        this.platezh = platezh;
    }
}
