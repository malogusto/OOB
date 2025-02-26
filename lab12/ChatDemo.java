import java.awt.*;
import javax.swing.*;
import java.io.*;
public class ChatDemo {
    private JFrame fr;
    private JPanel pn;
    private JTextArea chat;
    private JTextField txt;
    private JButton rest,submit;
    private HandleEvent handle;
    public ChatDemo(){
        fr = new JFrame("ChatDemo");
        pn = new JPanel();
        chat = new JTextArea(20,45);
        txt = new JTextField(45);
        rest = new JButton("reset");
        submit = new JButton("submit");
        handle = new HandleEvent(this);
        
        fr.addWindowListener(handle);
        fr.setLayout(new BorderLayout());
        chat.setEditable(false);
        fr.add(chat , BorderLayout.NORTH);
        fr.add(txt , BorderLayout.CENTER);
        
        pn.setLayout(new FlowLayout());
        fr.add(pn , BorderLayout.SOUTH);
        pn.add(submit);
        submit.addActionListener(handle);
        pn.add(rest);
        rest.addActionListener(handle);
        
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

    public JTextArea getChat() {
        return chat;
    }

    public void setChat(JTextArea chat) {
        this.chat = chat;
    }

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public JButton getRest() {
        return rest;
    }

    public void setRest(JButton rest) {
        this.rest = rest;
    }

    public JButton getSubmit() {
        return submit;
    }

    public void setSubmit(JButton submit) {
        this.submit = submit;
    }

    public HandleEvent getHandle() {
        return handle;
    }

    public void setHandle(HandleEvent handle) {
        this.handle = handle;
    }
    
}
