import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;
public class EditEvent implements ActionListener{
    private EditItem edit;
     private itemList list;
     private Item item;
     private DashEvent tableEvent;
     private int index = 0;
    EditEvent(EditItem edit ,itemList list ,DashEvent tableEvent){
        this.edit = edit;
        this.list = list;
        this.tableEvent = tableEvent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Delete")){
            if(list.getNumItem() > 0){
                list.DeleteItem(list.getInfoItem(index));
                index--; 
            }
            tableEvent.showtable();
            tableEvent.saved();
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.DEFAULT_OPTION);
        }
        else if  (command.equals("Update")){
            String id = edit.getTid().getText();
            String price = edit.getTp().getText();
            String name = edit.getTn().getText();

             if (!name.equals("") && !price.equals("")){
             try{
              Item updatedBook = list.getInfoItem(index);
              updatedBook.setId(Integer.parseInt(id));
              updatedBook.setName(name);
              updatedBook.setPrice(Double.parseDouble(price));
              JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.DEFAULT_OPTION);
          }
          catch(NumberFormatException ex){
              System.out.println(ex.toString());
          }
            }
             tableEvent.showtable();
             tableEvent.saved();
        }
        else if (command.equals("Close")){
            edit.getFr().dispose();
        }
        else if (e.getSource().equals(edit.getNext())){
            if (index < list.getNumItem() - 1) {
                index++;
                show();
            }
        }
        else if (e.getSource().equals(edit.getPrev())){
            if (index > 0) { 
                index--;
                show();
        }
        }
}
    public void show(){
        if (list.getNumItem()> 0) {
            Item currentBook = list.getInfoItem(index);
            edit.getTid().setText(String.valueOf(currentBook.getId()));
            edit.getTn().setText(currentBook.getName());
            edit.getTp().setText(String.valueOf(currentBook.getPrice()));
        }
    }
}
