import java.io.Serializable;
import java.util.ArrayList;
public class itemList  implements Serializable{
    private ArrayList<Item> list;
    public itemList(){
        list = new ArrayList<Item>();
        Item item = new Item();
        item.setId(0);
        item.setName("");
        item.setPrice(0.0);
        list.add(item);
}
     public void AddItem(Item item){
        list.add(item);  
    }
    public int getNumItem(){
        return list.size();
    }
    public Item getInfoItem(int index){
        return list.get(index);
    }
    public void DeleteItem(Item i){
        list.remove(i);
    }
    public ArrayList<Item> getItems() {
        return list;
    }

}
