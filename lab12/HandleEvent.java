import java.awt.event.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class HandleEvent implements ActionListener , WindowListener{
    private ChatDemo gui;
    private File file = new File("ChatDemo.dat");
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public HandleEvent(ChatDemo gui){
        this.gui = gui;
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        if (command.equals("submit")){        
            String message = gui.getTxt().getText();
            String Time = dtf.format(LocalDateTime.now());
            gui.getChat().append(Time + ":" + message +"\n");
            gui.getTxt().setText("");
        }
        else if (command.equals("reset")){
            gui.getChat().setText("");
            gui.getTxt().setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (file.exists()){
        try (FileInputStream fin = new FileInputStream("file");
                DataInputStream din = new DataInputStream(fin);){
                String history = din.readUTF();
                if (!history.isEmpty()) {
                gui.getChat().append(history);
                    
                }
            }
        catch(IOException ex) {
            System.out.println("llll");
        }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("file"); 
                DataOutputStream dout = new DataOutputStream(fout);) {
            dout.writeUTF(gui.getChat().getText());
        } catch (IOException ex) {
            System.out.println("sssss");
        }
        System.exit(0);
    }
    
    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void windowClosed(WindowEvent e) {}
}
