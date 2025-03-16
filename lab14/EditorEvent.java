import java.awt.event.*;
import java.io.*;
import javax.swing.JFileChooser;
public class EditorEvent implements ActionListener{
    private TextEditor gui;
    public EditorEvent(TextEditor gui){
        this.gui = gui;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("New")){
            this.gui.getTxt().setText("");
        }
        else if (command.equals("Open")){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(gui.getFr());
            File f = fc.getSelectedFile();
            try (FileInputStream fin = new FileInputStream(f); DataInputStream din = new DataInputStream(fin)){
                String text = din.readUTF();
                gui.getTxt().setText(text);
                
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
        else if ( command.equals("Save")){
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(gui.getFr());
            File f = fc.getSelectedFile();
            try (FileOutputStream fout = new FileOutputStream(f); DataOutputStream dout = new DataOutputStream(fout)){
                dout.writeUTF(this.gui.getTxt().getText());
                
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
        else if(command.equals("close")){
            System.exit(0);
        }
    
}
}
