package HW.Bank.Services;

import HW.Bank.Entity.Account;
import HW.Bank.Entity.Bill;

public class DepositService {
    public void deposit(Account account,int sumDep){
        Bill bill = account.getSchetVladelca();
        System.out.println("Mi seichas v cshete etogo polzovatelya " +
                account.getVladelecScheta().getName());
        int tekushiySchet = bill.getSchet();
        System.out.println(" Proishodit platezh, tekushee zhacheniye  " +
                tekushiySchet);
        bill.setSchet(tekushiySchet + sumDep);
        System.out.println(" platezh sovershen ostatok scheta " +
                bill.getSchet());
    }
}
