import java.awt.event.*;
import java.io.*;

public class loginEvent implements ActionListener {
 private login gui;
 
 public loginEvent(login gui){
     this.gui = gui;
 }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = gui.getLname().getText();
        char[] password = gui.getPw().getPassword();
        String passString = new String(password);
        if (name.equals("jisoo") && passString.equals("flower_me")){
            new DashBoard();
        }
    }
    
}
