package HW.Bank.Entity;

public class Deposit {
    private Bill bill;

    public Deposit(Bill snyatie) {
        this.bill = snyatie;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
