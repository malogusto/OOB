import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class BookViewCon implements ActionListener ,WindowListener{
    private BookView gui;
    private BookAdd ba;
    private BookAddCon test;
    private int index;
    private Book book;
    private BookAddCon bok;
    public BookViewCon(BookView gui){
        this.gui = gui;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        index = Integer.parseInt(this.gui.getNum().getText());
        if (command.equals("add")){
            ba = new BookAdd();
        }
        else if (command.equals("Update")){
            String name = gui.getTname().getText();
            String price = gui.getTprice().getText();
            if(!"".equals(name) & !"".equals(price)){
                bok.addListBook(name, price);
                JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.DEFAULT_OPTION);
                }
                showbook();
            }
        else if (command.equals("Delete")){
            bok.deleteBook(bok.getBook(index));
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.DEFAULT_OPTION);
        }
        else if(command.equals(">>>")){
            if (index > bok.getNumOfBook()-1){
                index ++;
                showbook();
            }
        }
        else if(command.equals("<<<")){
            if (index > 0){
                index --;
                showbook();
            }
            else if(index == 0){
                index ++;
                showbook();
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
       
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
    public void savedbook(){
        try (FileOutputStream fOut = new FileOutputStream("Book.data"); ObjectOutputStream oOut = new ObjectOutputStream(fOut))
       {
            oOut.writeObject(bok.getBookList());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void loadsdata(){
        File f = new File("Book.data");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream("f"); ObjectInputStream oin = new ObjectInputStream(fin)) {
            bok.setBookList((ArrayList<Book>) oin.readObject());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
    
    public void showbook(){
        if (index >= 0 && index < bok.getNumOfBook()) {
        gui.getNum().setText(String.valueOf(index));
        gui.getTname().setText(bok.getBook(index).getName());
        gui.getTprice().setText(String.valueOf(bok.getBook(index).getPrice()));
        gui.getChoose().setSelectedItem(bok.getBook(index).getType());
    } else {
        gui.getNum().setText("0");
        gui.getTname().setText("");
        gui.getTprice().setText("");
        gui.getChoose().setSelectedIndex(0);
    }
    }
}
