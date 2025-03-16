import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class BookAddCon implements ActionListener{
    private BookAdd addgui;
    private BookViewCon save;
    private Book book;
    private ArrayList <Book> bookList;
    public BookAddCon(BookAdd addgui){
        this.addgui = addgui;
        this.bookList = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = addgui.getTname().getText();
        String price = addgui.getTprice().getText();
        if (e.getActionCommand().equals("Insert")){
            if(!"".equals(name) && !"".equals(price)){
                addListBook(name , price);
                save.savedbook();
                addgui.getFr().setVisible(false);
                JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.DEFAULT_OPTION);
            }
        }
}

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public void addBook(Book book) {
        bookList.add(book);
    }
    public Book getBook(int index) {
        return bookList.get(index);
    }
    
    public int getNumOfBook() {
        return bookList.size();
    }
    
    public void deleteBook(Book b) {
        bookList.remove(b);
    }
    public void addListBook(String name , String price){
        try{
            book = new Book();
            book.setName(name);
            book.setPrice(Double.parseDouble(price));
            book.setType(addgui.getChoose().getSelectedItem().toString());
            bookList.add(book);
                }
            catch(NumberFormatException ex){
                    System.out.println(ex.toString());
                }
    }
}
