import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;
public class AddEvent implements ActionListener {
    private AddItem add;
    private Item item;
    private itemList list;
    private DashEvent tableEvent;
    public AddEvent(AddItem add ,itemList list ,DashEvent tableEvent){
        this.add = add;
        this.list = list;
        this.tableEvent = tableEvent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = add.getTid().getText();
        String name = add.getTn().getText();
        String price = add.getTp().getText();
        if (!name.equals("") && !id.equals("") & !price.equals("")){
            try{
                item = new Item();
                item.setId(Integer.parseInt(id));
                item.setName(name);
                item.setPrice(Double.parseDouble(price));
                list.AddItem(item);
                JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.DEFAULT_OPTION);
                tableEvent.showtable();
                tableEvent.saved();
                add.getFr().dispose();
                tableEvent.close();
                new DashBoard();
                
            }
            catch(NumberFormatException ex){
                System.out.println(ex.toString());
            }
        }
    }
}
