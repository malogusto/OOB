import java.awt.*;
import javax.swing.*;
public class EditItem {
    private JFrame fr;
    private JPanel pn1 , pn2 ,pn3 ,pn4;
    private JLabel id,n,p;
    private JTextField tid,tn,tp;
    private JButton dele,up,close,next,prev;
    private DashEvent tableEvent;
    private itemList list;
    private EditEvent ee;
    public EditItem(itemList list,DashBoard table){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        id = new JLabel("ID");
        n = new JLabel("Name");
        p = new JLabel("Price");;
        tid = new JTextField();
        tn = new JTextField();
        tp = new JTextField();
        dele = new JButton("Delete");
        up = new JButton("Update");
        close = new JButton("Close");
        next = new JButton(">>>");
        prev = new JButton("<<<");
        this.list = list;
        tableEvent = new DashEvent(table, list);
        ee = new EditEvent(this ,list,tableEvent);
        
        fr.setLayout(new GridLayout(2,1));
        pn1.setLayout(new GridLayout(3,1,5,10));
        pn1.add(id);
        pn1.add(tid);
        pn1.add(n);
        pn1.add(tn);
        pn1.add(p);
        pn1.add(tp);
        fr.add(pn1);
        pn3.setLayout(new GridLayout(3,1));
        fr.add(pn3);
        pn4.setLayout(new FlowLayout());
        pn4.add(prev);
        pn4.add(next);
        pn2.setLayout(new FlowLayout());
        pn3.add(pn4);
        pn3.add(pn2);
        pn2.add(dele);
        pn2.add(up);
        pn2.add(close);
        next.addActionListener(ee);
        prev.addActionListener(ee);
        dele.addActionListener(ee);
        up.addActionListener(ee);
        close.addActionListener(ee);
        
        fr.setVisible(true);
        fr.setSize(400, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    public JPanel getPn4() {
        return pn4;
    }

    public void setPn4(JPanel pn4) {
        this.pn4 = pn4;
    }

    public JLabel getId() {
        return id;
    }

    public void setId(JLabel id) {
        this.id = id;
    }

    public JLabel getN() {
        return n;
    }

    public void setN(JLabel n) {
        this.n = n;
    }

    public JLabel getP() {
        return p;
    }

    public void setP(JLabel p) {
        this.p = p;
    }

    public JTextField getTid() {
        return tid;
    }

    public void setTid(JTextField tid) {
        this.tid = tid;
    }

    public JTextField getTn() {
        return tn;
    }

    public void setTn(JTextField tn) {
        this.tn = tn;
    }

    public JTextField getTp() {
        return tp;
    }

    public void setTp(JTextField tp) {
        this.tp = tp;
    }

    public JButton getDele() {
        return dele;
    }

    public void setDele(JButton dele) {
        this.dele = dele;
    }

    public JButton getUp() {
        return up;
    }

    public void setUp(JButton up) {
        this.up = up;
    }

    public JButton getClose() {
        return close;
    }

    public void setClose(JButton close) {
        this.close = close;
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
    
}
