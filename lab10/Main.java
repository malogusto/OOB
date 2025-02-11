
public class Main {
/*    public static void main(String[] args) {
        Account a1 = new Account(5000, "Sommai");
        Account a2 = new Account(3000, "Somchai");
        Account a3 = new Account(900, "Somsri");

            Bank myBank = new Bank();
        myBank.addAccount(a1);
        myBank.addAccount(a2);
        myBank.addAccount(a3);

        System.out.println("Number of Account: " + myBank.getNumAccount());
        myBank.getAccount(0).showAccount();
        System.out.println("Deposit 600...");
        myBank.getAccount(0).deposit(600);
        System.out.println("Number of Account: " + myBank.getNumAccount());
        myBank.getAccount(1).showAccount();
        System.out.println("Deposit 600...");
        myBank.getAccount(1).deposit(3000);
        myBank.getAccount(1).showAccount();
        System.out.println("Show all accounts");
        System.out.println("==============================");
        for(int i=0; i<myBank.getNumAccount(); i++){
        myBank.getAccount(i).showAccount();
 }
}
*/
    public static void main(String[] args) {
 Customer cust = new Customer("Somsri", "Boonjing");
 Account acct1 = new Account(5000, "Somsri01");
 Account acct2 = new Account(3000, "Somsri02");
 Account acct3 = new Account(10000, "Somsri03");
 cust.addAccount(acct1);
 cust.addAccount(acct2);
 cust.addAccount(acct3);
 cust.getAccount(0).withdraw(3000);
 cust.getAccount(1).deposit(3000);
 cust.getAccount(2).deposit(10000);
 System.out.println(cust);
 for (int i = 0; i < cust.getNumOfAccount(); i++) {
 cust.getAccount(i).showAccount();
 }
}
}
