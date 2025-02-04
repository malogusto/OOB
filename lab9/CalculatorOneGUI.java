import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel input , cul;
    private JTextField num1 , num2 , total;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private EventHandling00 eventHandling;

    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        input = new JPanel();
        cul = new JPanel();
        num1 = new JTextField();
        num2 = new JTextField();
        total = new JTextField();
        eventHandling = new EventHandling00(this);
        
        fr.setLayout(new BorderLayout());
        input.setLayout(new GridLayout(2, 1, 10, 10));
        
        input.add(num1);
        input.add(num2);
        total.setEditable(false);
        input.add(total);
        
        fr.add(input , BorderLayout.NORTH);


        cul.setLayout(new GridLayout(1, 4, 5, 5));
        fr.add(cul , BorderLayout.CENTER);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        
        addButton.addActionListener(eventHandling);
        subtractButton.addActionListener(eventHandling);
        multiplyButton.addActionListener(eventHandling);
        divideButton.addActionListener(eventHandling);
        
        
        cul.add(addButton);
        cul.add(subtractButton);
        cul.add(multiplyButton);
        cul.add(divideButton);

        fr.add(total, BorderLayout.SOUTH);

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

    public JPanel getInput() {
        return input;
    }

    public void setInput(JPanel input) {
        this.input = input;
    }

    public JPanel getCul() {
        return cul;
    }

    public void setCul(JPanel cul) {
        this.cul = cul;
    }

    public JTextField getNum1() {
        return num1;
    }

    public void setNum1(JTextField num1) {
        this.num1 = num1;
    }

    public JTextField getNum2() {
        return num2;
    }

    public void setNum2(JTextField num2) {
        this.num2 = num2;
    }

    public JTextField getTotal() {
        return total;
    }

    public void setTotal(JTextField total) {
        this.total = total;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void setAddButton(JButton addButton) {
        this.addButton = addButton;
    }

    public JButton getSubtractButton() {
        return subtractButton;
    }

    public void setSubtractButton(JButton subtractButton) {
        this.subtractButton = subtractButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public void setMultiplyButton(JButton multiplyButton) {
        this.multiplyButton = multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public void setDivideButton(JButton divideButton) {
        this.divideButton = divideButton;
    }

    public EventHandling00 getEventHandling() {
        return eventHandling;
    }

    public void setEventHandling(EventHandling00 eventHandling) {
        this.eventHandling = eventHandling;
    }
    
}