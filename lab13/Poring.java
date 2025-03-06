import java.awt.*;
import javax.swing.*;
public class Poring {
    private JFrame fr;
    private JLabel poring , counttxt;
    private ImageIcon img;
    private Poringcount e;
    private static int countValue = 0;
    public Poring(){
        fr = new JFrame("Poring");  
        poring = new JLabel();
        counttxt = new JLabel(""+ (++countValue));
        img = new ImageIcon(getClass().getResource("/poring.png"));
        e = new Poringcount(this);
        
        Image po = img.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon por = new ImageIcon(po);
        
        poring.setIcon(por);
        fr.setLayout(new FlowLayout());
        fr.add(poring);
        fr.add(counttxt);
        
        poring.addMouseListener(e);
        
        fr.setResizable(false); 
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JLabel getCounttxt() {
        return counttxt;
    }

    public void setCounttxt(JLabel counttxt) {
        this.counttxt = counttxt;
    }

    public static int getCountValue() {
        return countValue;
    }

    public static void setCountValue(int countValue) {
        Poring.countValue = countValue;
    }

    
}
