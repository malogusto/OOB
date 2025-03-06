    import java.awt.event.*;
    import java.util.ArrayList;
public class Poringsummon implements ActionListener ,WindowListener {
    private Poring summon;
    private static ArrayList<Poring> lst= new ArrayList<>();

    @Override
    public void actionPerformed(ActionEvent e) {
        if  (e.getActionCommand().equals("add")){
            summon = new Poring();
            lst.add(summon);
            Poring.setCountValue(Poring.getCountValue() ); 
        }
    }
    @Override
    public void windowOpened(WindowEvent e) {
        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
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
