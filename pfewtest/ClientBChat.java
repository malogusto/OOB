import java.awt.*;
import javax.swing.*;
public class ClientBChat {
    private JFrame fr;
    private JTextArea ta;
    private JTextField tf;
    private JButton send;
    private JPanel pn;
    private EventB eb;
    public ClientBChat(){
        fr = new JFrame("ClientBChat");
        pn = new JPanel();
        ta = new JTextArea(20 , 45);
        tf = new JTextField(40);
        send = new JButton("send");
        eb = new EventB(this);
        
        fr.setLayout(new BorderLayout());
        pn.setLayout(new FlowLayout());
        ta.setEditable(false);
        fr.add(ta , BorderLayout.CENTER);
        fr.add(pn , BorderLayout.SOUTH);
        pn.add(tf);
        pn.add(send);
        
        fr.addWindowListener(eb);
        send.addActionListener(eb);
        
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

    public JTextArea getTa() {
        return ta;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
    }

    public JTextField getTf() {
        return tf;
    }

    public void setTf(JTextField tf) {
        this.tf = tf;
    }

    public JButton getSend() {
        return send;
    }

    public void setSend(JButton send) {
        this.send = send;
    }

    public JPanel getPn() {
        return pn;
    }

    public void setPn(JPanel pn) {
        this.pn = pn;
    }

    public EventB getEb() {
        return eb;
    }

    public void setEb(EventB eb) {
        this.eb = eb;
    }
    
}
