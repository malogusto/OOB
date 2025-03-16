
import java.io.Serializable;
import java.util.Date;
public class Item implements Serializable{
    private int Id;
    private String name;
    private double price;
    private  Date createOn;
    public Item(){
        this(0,"", 0.0);
    }
    public Item(int Id,String name,double price){
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.createOn = new Date();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }
    
}
