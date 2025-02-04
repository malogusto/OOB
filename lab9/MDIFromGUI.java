
import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane desktop;
    private JMenuBar mb;
    private JMenu m1,m2,m3,t1;
    private JMenuItem t2,t3,t4,tm1,tm2;
    private JInternalFrame b1,b2,b3;
    public MDIFromGUI(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // ใช้ Look and Feel ของระบบ
        } catch (Exception e) {
            e.printStackTrace();
        }
        fr = new JFrame("SubMenuItem Demo");
        desktop = new JDesktopPane();
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        
        t1 = new JMenu("New");
        t2 = new JMenuItem("Open");
        t3 = new JMenuItem("save");
        t4 = new JMenuItem("Exit");
        tm1 = new JMenuItem("Window");
        tm2 = new JMenuItem("Message");
        
        b1 = new JInternalFrame("Frame1",true,true,true,true);
        b1.setSize(100, 100);
        b1.setVisible(true);
        b2 = new JInternalFrame("Frame2",true,true,true,true);
        b2.setSize(70, 70);
        b2.setVisible(true);
        b3 = new JInternalFrame("Frame3",true,true,true,true);
        b3.setSize(70, 70);
        b3.setVisible(true);
        int x2 = b1.getX()+ b1.getWidth() + 50;
        int y2 = b1.getY();
        b1.setLocation(x2, y2);
        int x3 = b2.getX()+ b2.getWidth() + 20;
        int y3 = b2.getY()+30;
        b2.setLocation(x3, y3);
        desktop.add(b1);
        desktop.add(b2);
        desktop.add(b3);
        
        fr.add(desktop);
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        m1.add(t1);
        m1.add(t2);
        m1.addSeparator();
        m1.add(t3);
        m1.addSeparator();
        m1.add(t4);
        
        t1.add(tm1);
        t1.add(tm2);
        
        fr.setSize(300, 400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
