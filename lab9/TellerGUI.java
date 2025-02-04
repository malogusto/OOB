import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel pn1,pn2;
    private JTextField textField;
    private JLabel Balance,Amount,money;
    private JButton depo,with,exit;
    private EventHandling02 eventHandling;
    public TellerGUI(){
        fr = new JFrame("Calculator");
        pn1 = new JPanel();
        pn2 = new JPanel();
        Balance = new JLabel("Balance");
        Amount = new JLabel("Amount");
        money = new JLabel("6000");
        textField = new JTextField();
        depo = new JButton("deposit");
        with = new JButton("withdraw");
        exit = new JButton("Exit");
        eventHandling = new EventHandling02(this);
        
        fr.setSize(300, 150);
        fr.setLayout(new GridLayout(2,1));
        pn1.setLayout(new GridLayout(2,2));
        pn2.setLayout(new FlowLayout());
        
        fr.add(pn1);
        pn1.add(Balance);
        pn1.add(money);
        pn1.add(Amount);
        pn1.add(textField);
        
        fr.add(pn2);
        pn2.add(depo);
        pn2.add(with);
        pn2.add(exit);
        depo.addActionListener(eventHandling);
        with.addActionListener(eventHandling);
        exit.addActionListener(eventHandling);
        
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JLabel getBalance() {
        return Balance;
    }

    public void setBalance(JLabel Balance) {
        this.Balance = Balance;
    }

    public JLabel getAmount() {
        return Amount;
    }

    public void setAmount(JLabel Amount) {
        this.Amount = Amount;
    }

    public JLabel getMoney() {
        return money;
    }

    public void setMoney(JLabel money) {
        this.money = money;
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

    public JButton getExit() {
        return exit;
    }

    public void setExit(JButton exit) {
        this.exit = exit;
    }

    public EventHandling02 getEventHandling() {
        return eventHandling;
    }

    public void setEventHandling(EventHandling02 eventHandling) {
        this.eventHandling = eventHandling;
    }
    
}
