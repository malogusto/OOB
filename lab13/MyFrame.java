import java.awt.*;
import javax.swing.*;

public class MyFrame {
    private JFrame fr;
    private MyClockie clock;
    private Thread t;
    public MyFrame(){
        fr = new JFrame("clock");
        clock = new MyClockie();
        t = new Thread(clock);
        
        t.start();
        fr.add(clock);
        
        fr.setSize(300, 150);;
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
        public static void main(String[] args) {
        new MyFrame();

    }
}
