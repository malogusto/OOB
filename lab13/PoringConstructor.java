import java.awt.*;
import javax.swing.*;
public class PoringConstructor {
    private JFrame fr;
    private JButton add;
    private Poringsummon e;
    public PoringConstructor(){
        fr = new JFrame("add poring");
        add = new JButton("add");
        fr.setLayout(new FlowLayout());
        fr.add(add);
        e = new Poringsummon();
        
        add.addActionListener(e);
        fr.addWindowListener(e);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public Poringsummon getE() {
        return e;
    }

    public void setE(Poringsummon e) {
        this.e = e;
    }
    
}
