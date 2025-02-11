
public class Bank {
    private Account []acct;
    private int numAcct;
    public Bank(){
        this.acct = new Account[10];
        this.numAcct =0;
    }
    public void addAccount(Account ac){
        if (numAcct < acct.length){
            this.acct[numAcct] =ac;
            numAcct++;  
        }
    }
    public Account getAccount(int index){
        if (index >= 0 && index < numAcct) {
            return this.acct[index];
        }
        return null;
    }
    public int getNumAccount(){
        return this.numAcct;
    }
}
