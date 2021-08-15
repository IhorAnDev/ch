package HW.Bank.Entity;

public class Account {
    private Bill schetVladelca;
    private Person vladelecScheta;

    public Account(Bill schetVladelca, Person vladelecScheta) {
        this.schetVladelca = schetVladelca;
        this.vladelecScheta = vladelecScheta;
    }

    public Bill getSchetVladelca() {
        return schetVladelca;
    }

    public void setSchetVladelca(Bill schetVladelca) {
        this.schetVladelca = schetVladelca;
    }

    public Person getVladelecScheta() {
        return vladelecScheta;
    }

    public void setVladelecScheta(Person vladelecScheta) {
        this.vladelecScheta = vladelecScheta;
    }
}
