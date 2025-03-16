import java.awt.event.*;
import java.io.*;
public class DashEvent implements ActionListener , WindowListener{
    private DashBoard table;
    private itemList list;
    public DashEvent(DashBoard table ,itemList list){
        this.table = table;
        this.list = list;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(table.getA())){
            new AddItem(list ,table);
        }
        else if (e.getSource().equals(table.getE())){
            new EditItem(list , table);
        }
        else if (e.getSource().equals(table.getL())){
            table.getFr().dispose();
            new login();
            saved();
        }
    }
    public void showtable(){
        if (list != null && list.getNumItem() > 0) {
        table.showData();  // แสดงข้อมูลในตาราง
    } else {
        System.out.println("No items to display.");
    }
    }
    public void loads(){
        File f = new File("ItemJisoo.data");
        if(f.exists()){
            try(FileInputStream fin = new FileInputStream(f);
                ObjectInputStream oin = new ObjectInputStream(fin)){
                list = (itemList) oin.readObject();
                System.out.println("Data loaded: " + list);
            }
        catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();      
     }
        }
    }
    public void saved(){
        if (list != null && list.getNumItem() > 0) {
        try (FileOutputStream fout = new FileOutputStream("ItemJisoo.data");
             ObjectOutputStream oout = new ObjectOutputStream(fout)) {
            System.out.println("Saving itemList: " + list);
            oout.writeObject(list);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } else {
        System.out.println("No items to save.");
    }
}
    public void close(){
        table.getFr().dispose();
                
    }

    @Override
    public void windowOpened(WindowEvent e) {
        loads();
        showtable();
    }

    @Override
    public void windowClosing(WindowEvent e) {
      
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
