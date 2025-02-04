import java.awt.event.*;
public class EventHandling00 implements ActionListener ,WindowListener {
    private CalculatorOneGUI gui;
    public EventHandling00(CalculatorOneGUI gui){
        this.gui = gui;
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        double num1 = Double.parseDouble(gui.getNum1().getText());
        double num2 = Double.parseDouble(gui.getNum2().getText());
        double result = 0;
        if (command.equals("+" )){
            result = (num1 + num2);
            }
        else if (command.equals("-")){
                result = (num1 - num2);
            }
        else if (command.equals("/")){
                result = (num1 / num2);
            }
        else if (command.equals("*")){
                result = (num1 * num2);
            }
        gui.getTotal().setText(String.valueOf(result));
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
