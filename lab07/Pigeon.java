
public class Pigeon extends Bird {
    private static int numberOfPigeon;

    public int getNumberOfPigeon() {
        return numberOfPigeon;
    }

    public void setNumberOfPigeon(int numberOfPigeon) {
        Pigeon.numberOfPigeon = numberOfPigeon;
    }
    public Pigeon(){
        this.wingSize =0.0;
        this.weight = 0.0;
        this.height = 0.0;
        numberOfPigeon += 1;
    }
    public Pigeon(double wingSize,double weight,double height){
        super(wingSize,weight,height);
        numberOfPigeon += 1;
    }
    public void eat(String food){
        if (food.equals("worn")){
            setWeight(getWeight()+0.5);
        } else if (food.equals("seed")){
        setWeight(getWeight()+0.2);
        } else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    @Override
    public String toString(){
        return "Pigeon "+getWeight()+" kg and "+ getHeight()+ 
                " cm.There are " +getNumberOfPigeon()+ " pigeons." ;
        
    }
    @Override
    public void fly(){
        if (getWeight() >= 5){
            setWeight(getWeight() - 0.25);
            System.out.println("Fly Fly");
        } else{
            System.out.println("I’m hungry.");
        }
    }
    @Override
    public void takeOff(){
        if (getWeight() >= 5){
            setWeight(getWeight() - 0.5);
            System.out.println("Take Off");
        } else{
            System.out.println("I’m hungry.");
        }
}
    @Override
    public void landing(){
        if (getWeight() >= 5){
            setWeight(getWeight() - 0.5);
            System.out.println("Landing");
        } else{
            System.out.println("I’m hungry.");
        }
    }
}

