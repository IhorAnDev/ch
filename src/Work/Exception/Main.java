package Work.Exception;

public class Main {
    public static void main(String[] args) {

        AccountRepo accountRepo = AccountRepo.getInstance();
        Account account = new Account(1L, "Petr", 2310);
        Account account1 = new Account(2L, "Berta", 5000);
        Account account2 = new Account(3L, "Liza", 2000);

        accountRepo.add(account);
        accountRepo.add(account1);
        accountRepo.add(account2);

        Account account3 = accountRepo.getById(4L);

    }
}
