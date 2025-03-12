import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class EventA implements ActionListener , WindowListener {
    private ClientAChat gui;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private ArrayList<String> savemessage;
    
    public EventA(ClientAChat gui){
        this.gui = gui;
        savemessage = new ArrayList<>();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("send")){
            String message = gui.getTf().getText();
            String Time = dtf.format(LocalDateTime.now());
            savemessage.add(Time +" A:" +message);
            gui.getTa().append(Time + " A(You):" + message +"\n");
            gui.getTf().setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("chat_history.dat");
    if (f.exists()) {
        try (FileInputStream fin = new FileInputStream(f);
             ObjectInputStream oin = new ObjectInputStream(fin)) {
             
            savemessage = (ArrayList<String>) oin.readObject();
            for (String msg : savemessage) {
                if (msg.contains(" A(You):")) { 
                    gui.getTa().append(msg + "\n");
                } else if (msg.contains(" A:")) { 
                    gui.getTa().append(msg.replace(" A:", " A(You):") + "\n");
                } else {
                    gui.getTa().append(msg + "\n");
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("chat_history.dat");
             ObjectOutputStream oout = new ObjectOutputStream(fout)) {

            oout.writeObject(savemessage);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
