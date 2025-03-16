import java.awt.*;
import javax.swing.*;
public class TextEditor {
    private JFrame fr;
    private JMenuBar br;
    private JMenu file;
    private JMenuItem n , open , save , close;
    private JTextArea txt;
    private EditorEvent et;
    public TextEditor(){
        fr = new JFrame("TextEditor");
        br = new JMenuBar();
        file = new JMenu("File");
        n = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        close = new JMenuItem("close");
        et = new EditorEvent(this);
        txt = new JTextArea(); 
        
        fr.setLayout(new BorderLayout());
        fr.add(br , BorderLayout.NORTH);
        br.add(file);
        file.add(n);
        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(close);
        fr.add(txt , BorderLayout.CENTER);
        n.addActionListener(et);
        open.addActionListener(et);
        save.addActionListener(et);
        close.addActionListener(et);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(400, 350);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JMenuBar getBr() {
        return br;
    }

    public void setBr(JMenuBar br) {
        this.br = br;
    }

    public JMenu getFile() {
        return file;
    }

    public void setFile(JMenu file) {
        this.file = file;
    }

    public JMenuItem getN() {
        return n;
    }

    public void setN(JMenuItem n) {
        this.n = n;
    }

    public JMenuItem getOpen() {
        return open;
    }

    public void setOpen(JMenuItem open) {
        this.open = open;
    }

    public JMenuItem getSave() {
        return save;
    }

    public void setSave(JMenuItem save) {
        this.save = save;
    }

    public JMenuItem getClose() {
        return close;
    }

    public void setClose(JMenuItem close) {
        this.close = close;
    }

    public JTextArea getTxt() {
        return txt;
    }

    public void setTxt(JTextArea txt) {
        this.txt = txt;
    }
    public static void main(String[] args) {
        new TextEditor();
    }
}

