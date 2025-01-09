
public class Seller extends Employee {
    public Food sell(Employee e){
        double price = Food.getPrice();
        double balance = e.getWallet().getBalance();
        if (balance >= price){
            e.getWallet().setBalance(balance - price);
            getWallet().setBalance(getWallet().getBalance() + price);
            return new Food();
        } else{
            System.out.println("Your money is not enough.");
            return null;
        }
        
    }

}
