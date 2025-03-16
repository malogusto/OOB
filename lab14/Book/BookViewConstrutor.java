import java.awt.event.*;
import java.io.*;
import javax.swing.JOptionPane;


public class BookViewConstrutor implements ActionListener , WindowListener{
 private BookView gui;
 private int index =0;
 private Book book;
 private BookList list;
 private BookAdd add;
 public BookViewConstrutor(BookView gui ,BookList list){
     this.gui = gui;
     this.list = list;
     loads();
     showBook();
 }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("add")){
            add  = new BookAdd(list);
            new BookAddConstrutor(add, list);
        }
        else if (command.equals("Update")){
            String price = gui.getTprice().getText();
            String name = gui.getTname().getText();

             if (!name.equals("") && !price.equals("")){
             try{
              Book updatedBook = list.getInfoBook(index);
              updatedBook.setName(name);
              updatedBook.setPrice(Double.parseDouble(price));
              updatedBook.setType(gui.getChoose().getSelectedItem().toString());
              JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.DEFAULT_OPTION);
          }
          catch(NumberFormatException ex){
              System.out.println(ex.toString());
          }
            }
             showBook();
            
        }
        else if (command.equals("Delete")){
            if (list.getNumBook() > 0) {
                list.DeleteBook(list.getInfoBook(index));
                index--; 
            }
            showBook();
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.DEFAULT_OPTION);
        }
        else if (e.getSource().equals(gui.getNext())) {
            if (index < list.getNumBook() - 1) {
                index++;
                showBook();
            }
        } else if (e.getSource().equals(gui.getPrev())) {
            if (index > 0) { 
                index--;
                showBook();
                
    }
}
    
    }
    public void saved(){
        try (FileOutputStream fout = new FileOutputStream("Book.data");
             ObjectOutputStream oout = new ObjectOutputStream(fout)) {
            oout.writeObject(list);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
    }
    public void loads(){
        File f = new File("Book.data");
        if(f.exists()){
            try(FileInputStream fin = new FileInputStream(f);
                ObjectInputStream oin = new ObjectInputStream(fin)){
                list = (BookList) oin.readObject();
            }
        catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();      
     }
        }
    }
    public void showBook() {
        if (list.getNumBook() > 1) {
            Book currentBook = list.getInfoBook(index);
            gui.getNum().setText(String.valueOf(index));
            gui.getTname().setText(currentBook.getName());
            gui.getTprice().setText(String.valueOf(currentBook.getPrice()));
            gui.getChoose().setSelectedItem(currentBook.getType());
        } else {
            gui.getNum().setText("0");
            gui.getTname().setText("");
            gui.getTprice().setText("");
            gui.getChoose().setSelectedIndex(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        loads();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        saved();
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
