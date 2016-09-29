package model;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by Sheng on 9/20/16.
 */
public class Authenticator {
    /**
     *
     */
    public static Map<String, String> ACCOUNTS = new HashMap<>();
//    static {
//        Account bangpham = new Account("bang", "bang", "pham", "bangpham@gmail.com", AccountType.Admin);
//        ACCOUNTS.put(bangpham.toString(), "pass");
//    }

    /**
     * Creates an account using an account and password
     * @param account the account to be added
     * @param password the password to be added
     */
    public static void addAccount(Account account, String password) {
        ACCOUNTS.put(account.toString(), password);
        Account.accountList.put(account.toString(), account);
    }

    /**
     * Checks if the password and id is matches
     * @param id validates the id
     * @param password the password that is going be validated
     * @return true if the password and the id matches
     */
    public static boolean validatePassword(String id, String password){
        String validAccountPassword = ACCOUNTS.get(id);
        System.out.println(validAccountPassword != null && validAccountPassword.equals(password));
        return validAccountPassword != null && validAccountPassword.equals(password);
    }

    /**
     *  checks if the is matches with the user input
     * @param id the id that is going to validated
     * @return true if the id matches
     */
    public static boolean validateID(String id){
        if (Account.accountList.get(id) != null) {
            String validAccountName = Account.accountList.get(id).toString();
            System.out.println(!validAccountName.equals(id));
            return !validAccountName.equals(id);
        }
        return true;
    }
}
