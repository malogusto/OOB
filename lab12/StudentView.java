import java.awt.*;
import javax.swing.*;
public class StudentView {
    private JFrame fr;
    private JPanel pn,pnbt;
    private JButton depo,with;
    private JLabel ID,name,money;
    private JTextField idtxt,nametxt,moneytxt;
    private StdEvent e;
    public StudentView(){
        fr = new JFrame("Student Bank");
        pn = new JPanel();
        pnbt = new JPanel();
        ID = new JLabel("ID:");
        name = new JLabel("Name:");
        money = new JLabel("Money");
        idtxt = new JTextField();
        nametxt = new JTextField();
        moneytxt = new JTextField("0");
        depo = new JButton("Deposit");
        with = new JButton("Withdraw");
        e = new StdEvent(this);
        
        
        fr.setLayout(new BorderLayout());
        pn.setLayout(new GridLayout(3,2));
        pnbt.setLayout(new FlowLayout());
        fr.add(pn , BorderLayout.CENTER);
        fr.add(pnbt , BorderLayout.SOUTH);
        pn.add(ID);
        pn.add(idtxt);
        pn.add(name);
        pn.add(nametxt);
        pn.add(money);
        moneytxt.setEditable(false);
        pn.add(moneytxt);
        pnbt.add(depo);
        pnbt.add(with);
        
        fr.addWindowListener(e);
        depo.addActionListener(e);
        with.addActionListener(e);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPn() {
        return pn;
    }

    public void setPn(JPanel pn) {
        this.pn = pn;
    }

    public JPanel getPnbt() {
        return pnbt;
    }

    public void setPnbt(JPanel pnbt) {
        this.pnbt = pnbt;
    }

    public JButton getDepo() {
        return depo;
    }

    public void setDepo(JButton depo) {
        this.depo = depo;
    }

    public JButton getWith() {
        return with;
    }

    public void setWith(JButton with) {
        this.with = with;
    }

    public JLabel getID() {
        return ID;
    }

    public void setID(JLabel ID) {
        this.ID = ID;
    }

    public JLabel getName() {
        return name;
    }

    public void setName(JLabel name) {
        this.name = name;
    }

    public JLabel getMoney() {
        return money;
    }

    public void setMoney(JLabel money) {
        this.money = money;
    }

    public JTextField getIdtxt() {
        return idtxt;
    }

    public void setIdtxt(JTextField idtxt) {
        this.idtxt = idtxt;
    }

    public JTextField getNametxt() {
        return nametxt;
    }

    public void setNametxt(JTextField nametxt) {
        this.nametxt = nametxt;
    }

    public JTextField getMoneytxt() {
        return moneytxt;
    }

    public void setMoneytxt(JTextField moneytxt) {
        this.moneytxt = moneytxt;
    }

    public StdEvent getE() {
        return e;
    }

    public void setE(StdEvent e) {
        this.e = e;
    }
    
}
