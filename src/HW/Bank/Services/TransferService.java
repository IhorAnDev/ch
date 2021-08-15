package HW.Bank.Services;

import HW.Bank.Entity.Account;

public class TransferService {
    public void transfer(Account account1, Account account2, int sumPerevoda) {
        int schetaccount1 = account1.getSchetVladelca().getSchet();
        System.out.println("Polushaem chet vladelca1 " + schetaccount1);
        System.out.println(" Vladelec scheta spisaniya " + account1
                .getVladelecScheta()
                .getName());

        int schetaccount2 = account2.getSchetVladelca().getSchet();
        System.out.println("Polushaem chet vladelca2 " + schetaccount2);
        System.out.println(" Vladelec scheta zachislenya " + account2
                .getVladelecScheta()
                .getName());

        if (schetaccount1 < sumPerevoda) {
            System.out.println(" Slishkom malo sredstv dla perevoda ");
        } else {

            int ostatok = schetaccount1 - sumPerevoda;
            account1.getSchetVladelca().setSchet(ostatok);

            System.out.println(" Proishodit spisanie so scheta " +
                    account1.getVladelecScheta().getName() + " Na summu " +
                    sumPerevoda);

            System.out.println(" Ostatok posle perevoda " +
                    account1.getSchetVladelca().getSchet());

            System.out.println(" Sovershaetsa perevod na summu " +
                    sumPerevoda + " Na account " +
                    account2.getVladelecScheta().getName());

            int operation = schetaccount2 + sumPerevoda;
            account2.getSchetVladelca().setSchet(operation);

            System.out.println(" Schet account " + account2.getVladelecScheta().getName() +
                    " popolnen na summu " +
                    sumPerevoda + " Ballans cheta " + account2.getSchetVladelca()
                    .getSchet());

        }
    }
}
