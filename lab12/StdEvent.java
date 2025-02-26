    import java.awt.event.*;
    import java.io.*;

    public class StdEvent implements ActionListener , WindowListener{
        private StudentView gui;
        private Student s = new Student();

        public StdEvent(StudentView gui){
            this.gui = gui;
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("Deposit")){
                this.s.setMoney(s.getMoney() +100);
                this.gui.getMoneytxt().setText(String.valueOf(s.getMoney()));
            }
            else if (command.equals("Withdraw")){
                this.s.setMoney(s.getMoney() -100);
                this.gui.getMoneytxt().setText(String.valueOf(s.getMoney()));
            }
        }
        @Override
        public void windowOpened(WindowEvent e) {
            File file = new File("StudentM.dat");
            if (file.exists()){
                try (FileInputStream fin = new FileInputStream("StudentM.dat");
                    ObjectInputStream in = new ObjectInputStream(fin);){
                    Student write = (Student)in.readObject();
                    s.setMoney(write.getMoney());
                    this.gui.getIdtxt().setText(String.valueOf(write.getID()));
                    this.gui.getNametxt().setText(write.getName());
                    this.gui.getMoneytxt().setText(String.valueOf(write.getMoney()));

                }
            catch(IOException | ClassNotFoundException ex) {               
                System.out.println(ex.toString());
            }
            }
        }

        @Override
        public void windowClosing(WindowEvent e) {
            try (FileOutputStream fout = new FileOutputStream("StudentM.dat");
                    ObjectOutputStream oout = new ObjectOutputStream(fout);) {
                    s.setID(Integer.parseInt(this.gui.getIdtxt().getText()));
                    s.setName(this.gui.getNametxt().getText());
                    oout.writeObject(s);
            }
            catch (IOException ex) {
                System.out.println(ex.toString());
            }
            finally {
                System.exit(0);
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
