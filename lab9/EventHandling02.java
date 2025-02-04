import java.awt.event.*;
public class EventHandling02 implements ActionListener , WindowListener{
    private TellerGUI gui;
    public EventHandling02(TellerGUI gui){
        this.gui = gui;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        double num1 = Double.parseDouble(gui.getMoney().getText());
        double num2 = Double.parseDouble(gui.getTextField().getText());
        if (ae.getActionCommand().equals("deposit")){
            num1 = num1 + num2;
        }
        if (ae.getActionCommand().equals("withdraw")){
            if (num1 > num2){
                num1 = num1 - num2;
            }
            else{
                num1 = 0;
            }
        }
        if (ae.getActionCommand().equals("Exit")){
            System.exit(0);
        }
        gui.getMoney().setText(String.valueOf(num1));
        
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
