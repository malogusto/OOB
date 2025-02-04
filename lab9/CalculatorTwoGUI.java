import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel btb;
    private JTextField output;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnMultiply,btnClear,btnEquals,btnDivide,btn0;
    private String oper;
    private double num1 ,num2 ,total;;
    private EventHandling01 eventHandling;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("Calculator");
        btb = new JPanel();
        output = new JTextField();
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPlus = new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btnMinus = new JButton("-");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btnMultiply = new JButton("X");
        btn0 = new JButton("0");
        btnClear = new JButton("C");
        btnEquals = new JButton("=");
        btnDivide = new JButton("/");
        eventHandling = new EventHandling01(this);
        
        fr.setSize(300, 400);
        fr.setLayout(new BorderLayout());
        
        fr.add(output, BorderLayout.NORTH);
        output.setHorizontalAlignment(JTextField.RIGHT);
        btb.setLayout(new GridLayout(4,4)); 
        
               
        btb.add(btn7);
        btb.add(btn8);
        btb.add(btn9);
        btb.add(btnPlus);
        btb.add(btn4);
        btb.add(btn5);
        btb.add(btn6);
        btb.add(btnMinus);
        btb.add(btn1);
        btb.add(btn2);
        btb.add(btn3);
        btb.add(btnMultiply);
        btb.add(btn0);
        btb.add(btnClear);
        btb.add(btnEquals);
        btb.add(btnDivide);
        btn0.addActionListener(eventHandling);
        btn1.addActionListener(eventHandling);
        btn2.addActionListener(eventHandling);
        btn3.addActionListener(eventHandling);
        btn4.addActionListener(eventHandling);
        btn5.addActionListener(eventHandling);
        btn6.addActionListener(eventHandling);
        btn7.addActionListener(eventHandling);
        btn8.addActionListener(eventHandling);
        btn9.addActionListener(eventHandling);
        btnPlus.addActionListener(eventHandling);
        btnMinus.addActionListener(eventHandling);
        btnMultiply.addActionListener(eventHandling);
        btnEquals.addActionListener(eventHandling);
        btnClear.addActionListener(eventHandling);
        btnDivide.addActionListener(eventHandling);

        fr.add(btb, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getBtb() {
        return btb;
    }

    public void setBtb(JPanel btb) {
        this.btb = btb;
    }

    public JTextField getOutput() {
        return output;
    }

    public void setOutput(JTextField output) {
        this.output = output;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public JButton getBtn9() {
        return btn9;
    }

    public void setBtn9(JButton btn9) {
        this.btn9 = btn9;
    }

    public JButton getBtnPlus() {
        return btnPlus;
    }

    public void setBtnPlus(JButton btnPlus) {
        this.btnPlus = btnPlus;
    }

    public JButton getBtnMinus() {
        return btnMinus;
    }

    public void setBtnMinus(JButton btnMinus) {
        this.btnMinus = btnMinus;
    }

    public JButton getBtnMultiply() {
        return btnMultiply;
    }

    public void setBtnMultiply(JButton btnMultiply) {
        this.btnMultiply = btnMultiply;
    }

    public JButton getBtnClear() {
        return btnClear;
    }

    public void setBtnClear(JButton btnClear) {
        this.btnClear = btnClear;
    }

    public JButton getBtnEquals() {
        return btnEquals;
    }

    public void setBtnEquals(JButton btnEquals) {
        this.btnEquals = btnEquals;
    }

    public JButton getBtnDivide() {
        return btnDivide;
    }

    public void setBtnDivide(JButton btnDivide) {
        this.btnDivide = btnDivide;
    }

    public JButton getBtn0() {
        return btn0;
    }

    public void setBtn0(JButton btn0) {
        this.btn0 = btn0;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EventHandling01 getEventHandling() {
        return eventHandling;
    }

    public void setEventHandling(EventHandling01 eventHandling) {
        this.eventHandling = eventHandling;
    }
    
}

