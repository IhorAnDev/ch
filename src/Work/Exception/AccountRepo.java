package Work.Exception;

import java.util.ArrayList;
import java.util.List;

public class AccountRepo {

    private static AccountRepo INSTANCE;
    private List<Account> accountList = new ArrayList<>();
    ;

    private AccountRepo() {
    }

    public static AccountRepo getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new AccountRepo();
        }
        return INSTANCE;
    }

    public void add(Account account) {

        accountList.add(account);
    }

    public Account getById(Long id){
        for (Account ac : accountList) {
            if (ac.getId().equals(id)) {
                return ac;
            }
        }

        throw new AccountNotFoundException("Net polzovatela c id :" + id);
    }

}
