package HW.Bank.Services;

import HW.Bank.Entity.Account;
import HW.Bank.Entity.Bill;

public class PaymentService {
    public void pay(Account account, int sumPay) {
        Bill bill = account.getSchetVladelca();
        System.out.println("Mi seichas v cshete etogo polzovatelya " +
                account.getVladelecScheta().getName());
        if (bill.getSchet() < sumPay) {
            System.out.println(" nedostatochno sredstv ");
        } else {
            int tekushiySchet = bill.getSchet();
            System.out.println(" Proishodit platezh, tekushee zhacheniye  " +
                    tekushiySchet);
            bill.setSchet(tekushiySchet - sumPay);
            System.out.println(" platezh sovershen ostatok scheta " +
                    bill.getSchet());
        }
    }
}
