import java.awt.*;
import javax.swing.*;
public class login {
    private JFrame fr;
    private JPanel pn1 , pn2 ,pn3;
    private JPasswordField pw;
    private JTextField  Lname;
    private JLabel log,pass,n,m,k;
    private JButton bn;
    private loginEvent et;
    public login(){
        fr = new JFrame("");
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pw = new JPasswordField();
        Lname = new JTextField();
        log = new JLabel("login");
        pass = new JLabel("Password");
        bn = new JButton("Login");
        n = new JLabel();
        m = new JLabel();
        k = new JLabel();
        et = new loginEvent(this);
        
        fr.setLayout(new GridLayout(2,1 ));
        pn1.setLayout(new GridLayout(3,2,5 ,30));
        pn1.add(n);
        pn1.add(m);
        pn1.add(log);
        pn1.add(pw);
        pn1.add(Lname);
        pn1.add(pass);
        pn1.add(pw);
        fr.add(pn1 );
        pn2.setLayout(new GridLayout(3,1 ));
        pn3.setLayout(new FlowLayout());
        bn.setPreferredSize(new Dimension(200, 30));
        pn2.add(k);
        pn2.add(pn3);
        pn3.add(bn);
        fr.add(pn2);
        bn.addActionListener(et);
        fr.setVisible(true);
        fr.setSize(400, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new login();
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

    public JPasswordField getPw() {
        return pw;
    }

    public void setPw(JPasswordField pw) {
        this.pw = pw;
    }

    public JTextField getLname() {
        return Lname;
    }

    public void setLname(JTextField Lname) {
        this.Lname = Lname;
    }

    public JLabel getLog() {
        return log;
    }

    public void setLog(JLabel log) {
        this.log = log;
    }

    public JLabel getPass() {
        return pass;
    }

    public void setPass(JLabel pass) {
        this.pass = pass;
    }

    public JLabel getN() {
        return n;
    }

    public void setN(JLabel n) {
        this.n = n;
    }

    public JLabel getM() {
        return m;
    }

    public void setM(JLabel m) {
        this.m = m;
    }

    public JLabel getK() {
        return k;
    }

    public void setK(JLabel k) {
        this.k = k;
    }

    public JButton getBn() {
        return bn;
    }

    public void setBn(JButton bn) {
        this.bn = bn;
    }
    
}
