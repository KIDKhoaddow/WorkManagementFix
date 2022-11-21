package etc.vn.manage.account;

import etc.vn.manage.IGeneral;
import etc.vn.model.user.Account;

public interface IAccountManager extends IGeneral<Account> {
    Account findByEmail(String email);
    Account checkEmailPassword(String email,String password);

}
