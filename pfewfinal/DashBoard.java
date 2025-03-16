import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class DashBoard {
    private JFrame fr;
    private JPanel pn1 ,pn2;
    private JTable tb;
    private JButton a,e,l;
    private JLabel txt,n;
    private JScrollPane scroll;
    private DashEvent ed;
    private itemList list;
    private DefaultTableModel model;
    public DashBoard(){
        fr = new JFrame("Jisoo MarketPalce");
        pn1 = new JPanel();
        pn2 = new JPanel();
        a = new JButton("Add item");
        e = new JButton("Edit item");
        l = new JButton("Logout");
        txt = new JLabel("Welcome too Jisoo MarketPalce" , SwingConstants.CENTER);
        n = new JLabel("");
        scroll = new JScrollPane();
        list = loadItemListFromFile();
        ed = new DashEvent(this ,list);
        
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Price");
        model.addColumn("Create_On");

        tb = new JTable(model);
        scroll.setViewportView(tb);
        tb.setDefaultEditor(Object.class, null);
        
        fr.setLayout(new BorderLayout());
        pn2.setLayout(new GridLayout(2,1));
        pn2.add(txt);
        pn2.add(pn1);
        pn1.setLayout(new FlowLayout());
        pn1.add(a);
        pn1.add(e);
        pn1.add(l);
        fr.add(pn2 ,BorderLayout.NORTH );
        fr.add(scroll, BorderLayout.CENTER);
        a.addActionListener(ed);
        e.addActionListener(ed);
        l.addActionListener(ed);
        fr.addWindowListener(ed);
        
        fr.setVisible(true);
        fr.setSize(400, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new DashBoard();
    }
    
public void showData() {
    DefaultTableModel model = (DefaultTableModel) tb.getModel();
    model.setRowCount(0); 
    System.out.println("list: " + list); 
    ArrayList<Item> items = list.getItems();
    System.out.println("items: " + items); 

    if (items != null && !items.isEmpty()) {
        for (Item item : items) {
            model.addRow(new Object[]{
                item.getId(),
                item.getName(),
                item.getPrice(),
                item.getCreateOn()
            });
        }
    } else {
        System.out.println("No items to display!");  // พิมพ์ข้อความหากไม่มีข้อมูล
    }
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

    public JTable getTb() {
        return tb;
    }

    public void setTb(JTable tb) {
        this.tb = tb;
    }

    public JButton getA() {
        return a;
    }

    public void setA(JButton a) {
        this.a = a;
    }

    public JButton getE() {
        return e;
    }

    public void setE(JButton e) {
        this.e = e;
    }

    public JButton getL() {
        return l;
    }

    public void setL(JButton l) {
        this.l = l;
    }

    public JLabel getTxt() {
        return txt;
    }

    public void setTxt(JLabel txt) {
        this.txt = txt;
    }

    public JLabel getN() {
        return n;
    }

    public void setN(JLabel n) {
        this.n = n;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
    private itemList loadItemListFromFile() {
    File f = new File("ItemJisoo.data");
    itemList loadedList = new itemList();
    
    if (f.exists()) {
        try (FileInputStream fin = new FileInputStream(f);
             ObjectInputStream oin = new ObjectInputStream(fin)) {
            loadedList = (itemList) oin.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    return loadedList;
}
}
