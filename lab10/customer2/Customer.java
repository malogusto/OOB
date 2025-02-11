import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    public Customer(){
        this("","");    
    }    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new ArrayList();
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
        if (index >= 0 && index < this.acct.size()) {
            return (Account) this.acct.get(index);
        }
        return null;
    }

    public void addAccount(Account acct) {
        this.acct.add(acct);
    }
    
    public int getNumOfAccount(){
        return this.acct.size();
    }
    @Override
    public String toString(){
        if (this.acct == null){
            return this.firstName +" "+ this.lastName + " doesn’t have account.";
        }else{
            return "The " + this.firstName + " account has " + getNumOfAccount() +" accounts";
        }
    }
    
    public boolean equals(Customer c){
        return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName);
    }
}