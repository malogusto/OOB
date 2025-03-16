
import java.io.Serializable;
import java.util.ArrayList;
public class BookList implements Serializable{
    private ArrayList<Book> list;
    public BookList(){
        list = new ArrayList();
        Book book = new Book();
        book.setName("");
        book.setPrice(0);
        book.setType("Default");
        list.add(book);
    }
    public void AddBook(Book book){
        list.add(book);  
    }
    public int getNumBook(){
        return list.size();
    }
    public Book getInfoBook(int index){
        return list.get(index);
    }
    public void DeleteBook(Book b){
        list.remove(b);
    }
}
