import java.awt.*;
import javax.swing.*;
public class BookView {
    private JFrame fr;
    private JPanel pn1,pn2,pn3;
    private JLabel lname ,lprice, ltype;
    private JButton add,update,dele,next,prev;
    private JTextField tname,tprice,num;
    private JComboBox choose;
    private BookViewCon et;
    public BookView(){
        fr = new JFrame("Book");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        lname = new JLabel("Name");
        lprice = new JLabel("Price");
        ltype = new JLabel("Type");
        tname = new JTextField();
        tprice = new JTextField();
        num = new JTextField("0");
        add = new JButton("add");
        update = new JButton("Update");
        dele = new JButton("Delete");
        next = new JButton(">>>");
        prev = new JButton("<<<");
        et = new BookViewCon(this);
        
        fr.setLayout(new BorderLayout());
        pn1.setLayout(new GridLayout(3,2));
        pn2.setLayout(new FlowLayout());
        pn3.setLayout(new FlowLayout());
        
        choose = new JComboBox();
        choose.addItem("General");
        choose.addItem("Computer");
        choose.addItem("Math&Sci");
        choose.addItem("Photo");
        
        fr.add(pn1 ,BorderLayout.NORTH );
        fr.add(pn2,BorderLayout.CENTER);
        fr.add(pn3,BorderLayout.SOUTH);
        pn1.add(lname);
        pn1.add(tname);
        pn1.add(lprice);
        pn1.add(tprice);
        pn1.add(ltype);
        pn1.add(choose);
        pn2.add(next);
        pn2.add(num);
        pn2.add(prev);
        pn3.add(add);
        pn3.add(update);
        pn3.add(dele);
        add.addActionListener(et);
        update.addActionListener(et);
        dele.addActionListener(et);
        next.addActionListener(et);
        prev.addActionListener(et);
        
        et.loadsdata();
        fr.addWindowListener(et);
        num.setEditable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPn1() {
        return pn1;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public JPanel getPn2() {
        return pn2;
    }

    public void setPn2(JPanel pn2) {
        this.pn2 = pn2;
    }

    public JPanel getPn3() {
        return pn3;
    }

    public void setPn3(JPanel pn3) {
        this.pn3 = pn3;
    }

    public JLabel getLname() {
        return lname;
    }

    public void setLname(JLabel lname) {
        this.lname = lname;
    }

    public JLabel getLprice() {
        return lprice;
    }

    public void setLprice(JLabel lprice) {
        this.lprice = lprice;
    }

    public JLabel getLtype() {
        return ltype;
    }

    public void setLtype(JLabel ltype) {
        this.ltype = ltype;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public JButton getUpdate() {
        return update;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public JButton getDele() {
        return dele;
    }

    public void setDele(JButton dele) {
        this.dele = dele;
    }

    public JButton getNext() {
        return next;
    }

    public void setNext(JButton next) {
        this.next = next;
    }

    public JButton getPrev() {
        return prev;
    }

    public void setPrev(JButton prev) {
        this.prev = prev;
    }

    public JTextField getTname() {
        return tname;
    }

    public void setTname(JTextField tname) {
        this.tname = tname;
    }

    public JTextField getTprice() {
        return tprice;
    }

    public void setTprice(JTextField tprice) {
        this.tprice = tprice;
    }

    public JTextField getNum() {
        return num;
    }

    public void setNum(JTextField num) {
        this.num = num;
    }

    public JComboBox getChoose() {
        return choose;
    }

    public void setChoose(JComboBox choose) {
        this.choose = choose;
    }
    public static void main(String[] args) {
        new BookView();
    }
}
