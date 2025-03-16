import java.awt.*;
import javax.swing.*;
public class AddItem {
    private JFrame fr;
    private JPanel pn1 , pn2 ,pn3;
    private JLabel id,n,p,d;
    private JTextField tid,tn,tp;
    private JButton insert;
    private AddEvent ae;
    private itemList list;
    private DashEvent tableEvent;
    public AddItem(itemList list,DashBoard table){
        fr = new JFrame();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        id = new JLabel("ID");
        n = new JLabel("Name");
        p = new JLabel("Price");
        d = new JLabel();
        tid = new JTextField();
        tn = new JTextField();
        tp = new JTextField();
        insert = new JButton("Insert");
        this.list = list;
        tableEvent = new DashEvent(table, list);
        ae = new AddEvent(this ,list,tableEvent);
        
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
        pn2.setLayout(new FlowLayout());
        pn3.add(d);
        pn3.add(pn2);
        insert.setPreferredSize(new Dimension(200, 30));
        pn2.add(insert);
        insert.addActionListener(ae);
        
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

    public JLabel getD() {
        return d;
    }

    public void setD(JLabel d) {
        this.d = d;
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

    public JButton getInsert() {
        return insert;
    }

    public void setInsert(JButton insert) {
        this.insert = insert;
    }
    
}
