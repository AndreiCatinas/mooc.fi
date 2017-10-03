
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("Matt's account", 1000);
        Account b = new Account("My account", 0);
        a.withdrawal(100);
        b.deposit(100);
        System.out.println(a + "\n" + b);
    }

}
