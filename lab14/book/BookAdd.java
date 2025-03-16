import java.awt.*;
import javax.swing.*;
public class BookAdd {
    private JFrame fr;
    private JPanel pn1,pn2;
    private JLabel lname ,lprice, ltype;
    private JTextField tname,tprice;
    private JComboBox choose;
    private JButton inser;
    private BookAddCon ea;
    public BookAdd(){
        fr = new JFrame("Book");
        pn1 = new JPanel();
        pn2 = new JPanel();
        lname = new JLabel("Name");
        lprice = new JLabel("Price");
        ltype = new JLabel("Type");
        tname = new JTextField();
        tprice = new JTextField();
        choose = new JComboBox();
        choose.addItem("General");
        choose.addItem("Computer");
        choose.addItem("Math&Sci");
        choose.addItem("Photo");
        inser = new JButton("Insert");
        ea = new BookAddCon(this);
        
        fr.add(pn1 ,BorderLayout.NORTH );
        fr.add(pn2,BorderLayout.CENTER);
        pn2.setLayout(new FlowLayout());
        pn1.setLayout(new GridLayout(3,2));
        pn1.add(lname);
        pn1.add(tname);
        pn1.add(lprice);
        pn1.add(tprice);
        pn1.add(ltype);
        pn1.add(choose);
        pn2.add(inser);
        inser.addActionListener(ea);
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

    public JComboBox getChoose() {
        return choose;
    }

    public void setChoose(JComboBox choose) {
        this.choose = choose;
    }

    public JButton getInser() {
        return inser;
    }

    public void setInser(JButton inser) {
        this.inser = inser;
    }
    public static void main(String[] args) {
        new BookAdd();
    }
}
