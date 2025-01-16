
public class CheckingAccount extends Account{
    private double credit;
   
    public CheckingAccount() {this(0.0,"",0.0);}
    public CheckingAccount(double balance, String name,double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    @Override
    public void withdraw(double a){
        if (a >= 0){
            if (this.getBalance() - a >= 0){
                this.setBalance(this.getBalance() - a);
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.credit);
            }else if (this.getBalance() - a + this.getCredit() >= 0){
                this.setBalance(0);
                this.setCredit(this.credit - (a - this.getBalance()));
                System.out.println(a+" baht is withdrawn from "+this.getName()+" and your credit balance is "+this.credit);
            }else{
                System.out.println("Not enough money!");
            }
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public void withdraw(String a){
        a = a.replace("“", "")
         .replace("”", "")
         .replace("‘", "")
         .replace("’", "")
         .replace(",", "")
         .trim();
        double amountValue = Double.parseDouble(a);
        this.withdraw(amountValue);
    }
    
    @Override
    public String toString(){
        return "The "+ this.getName() + " account has " + this.getBalance() + " baht and " + this.credit + " credits.";
    }
}