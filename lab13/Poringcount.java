import java.awt.event.*;
public class Poringcount implements ActionListener , MouseListener {
    private Poring poring;
    
    public Poringcount(Poring poring){
        this.poring = poring;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.poring.getFr().setVisible(false);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
