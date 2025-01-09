
public class Employee {
    private int energy;
    private String name;
    private Wallet wallet;
    private static String nationality = "Thai";
    
    
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }
    public boolean buyFood(Seller s){
        Food food = s.sell(this);
        if (food != null){
            this.eat(food);
            return true;
        } else{
            return false;
        } 
    }
    public void eat(Food f){
        this.energy += f.getEnergy();
    }
    public boolean equals(Employee e){
        return this.name.equals(e.getName());
    }
    @Override
    public String toString(){
        return "My name is "+ name +". \n"+"I have "+ energy + " energy left."+"\n"+"I have a "
                + "balance of "+wallet.getBalance()+" baht.";
    }

}
