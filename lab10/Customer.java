
public class Customer {
    private String firstName;
    private String lastName;
    private Account []acct;
    private int numOfAccount;
    public Customer(){
        this("","");    
    }    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
        this.numOfAccount = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < numOfAccount) {
            return this.acct[index];
        }
        return null;
    }

    public void addAccount(Account acct) {
        if (numOfAccount < this.acct.length){
            this.acct[numOfAccount] =acct;
            numOfAccount++;  
        }
    }
    
    public int getNumOfAccount(){
        return this.numOfAccount;
    }
    @Override
    public String toString(){
        if (this.acct == null){
            return this.firstName +" "+ this.lastName + " doesn’t have account.";
        }else{
            return "The " + this.firstName + " account has " + numOfAccount +" accounts";
        }
    }
    
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}