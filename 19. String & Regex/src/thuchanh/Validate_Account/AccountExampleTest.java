package thuchanh.Validate_Account;

public class AccountExampleTest {

    private static AccountExample accountExample;

    private static final String[] validAccount = new String[] {"123abc_", "_abc123", "______", "123456","abcdefgh"};
    private static final String[] invalidAccount = new String[] {".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account ís " + account + " is valid: " + isValid);
        }

        for (String account : invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account ís " + account + " is valid: " + isValid);
        }
    }
}
