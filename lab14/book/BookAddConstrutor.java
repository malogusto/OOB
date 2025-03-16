import java.awt.event.*;
import javax.swing.*;
public class BookAddConstrutor implements ActionListener{
 private BookAdd add;
 private Book book;
 private BookList list;
    public BookAddConstrutor(BookAdd add , BookList list){
        this.add = add;
        this.list = list;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      String price = add.getTprice().getText();
      String name = add.getTname().getText();
      if (!name.equals("") && !price.equals("")){
          try{
              book = new Book();
              book.setName(name);   
              book.setPrice(Double.parseDouble(price));
              book.setType(add.getChoose().getSelectedItem().toString());
              list.AddBook(book);
              add.getFr().dispose();
              JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.DEFAULT_OPTION);
              System.out.println("dddd");
          }
          catch(NumberFormatException ex){
              System.out.println(ex.toString());
          }
      }
    }
    
}
