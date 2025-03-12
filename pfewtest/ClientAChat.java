import java.awt.*;
import javax.swing.*;
public class ClientAChat {
    private JFrame fr;
    private JTextArea ta;
    private JTextField tf;
    private JButton send;
    private JPanel pn;
    private EventA ea;
    public ClientAChat(){
        fr = new JFrame("ClientAChat");
        pn = new JPanel();
        ta = new JTextArea(20 , 45);
        tf = new JTextField(40);
        send = new JButton("send");
        ea = new EventA(this);
        
        fr.setLayout(new BorderLayout());
        pn.setLayout(new FlowLayout());
        ta.setEditable(false);
        fr.add(ta , BorderLayout.CENTER);
        fr.add(pn , BorderLayout.SOUTH);
        pn.add(tf);
        pn.add(send);
        
        fr.addWindowListener(ea);
        send.addActionListener(ea);
        
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

    public EventA getEa() {
        return ea;
    }

    public void setEa(EventA ea) {
        this.ea = ea;
    }
    
}
