import javax.swing.JFrame;

public class Pause {
    private JFrame fr;
    private MyClockie clock;
    private Thread t;
    private EventPause e;

    public Pause() {
        fr = new JFrame("My Clock");
        clock = new MyClockie();
        t = new Thread(clock);
        e = new EventPause(clock);
        
        t.start();
        fr.add(clock);
        
        fr.addMouseListener(e);
        
        fr.setSize(300, 130);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Pause();
        
    }
}
    