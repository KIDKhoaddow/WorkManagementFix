package etc.vn.manage.account;

import etc.vn.model.user.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManagerImpl implements IAccountManager{
    private static List<Account> listAccount=new ArrayList<>();


    @Override
    public void save(Account account) {
        listAccount.add(account);
    }

    @Override
    public void edit(int index, Account account) {
        listAccount.set(index,account);
    }

    @Override
    public boolean delete(Long idTask) {
        return listAccount.remove(idTask);
    }

    @Override
    public List<Account> findAll() {
        return listAccount;
    }

    @Override
    public Account findById(Long id) {
        for (Account element: listAccount) {
            if(element.getId().equals(id)){
                return element;
            }
        }
        return null;
    }

    @Override
    public Account findByEmail(String email) {
        for (Account element: listAccount) {
            if(element.getEmail().equals(email)){
                return element;
            }
        }
        return null;
    }

    @Override
    public Account checkEmailPassword(String email, String password) {
        for (Account element: listAccount) {
            if(element.getEmail().equals(email)&&element.getPassword().equals(password)){
                return element;
            }
        }
        return null;
    }


}
