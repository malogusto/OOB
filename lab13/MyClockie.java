import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class MyClockie extends JLabel implements Runnable {
    private int sec,min,hour;
    private boolean pause = true;
    
        public synchronized void continueTime() {
        pause = !pause;
        if (pause) {
            System.out.println("continue");
            notifyAll();
        } else {
            System.out.println("pause");
        }
    }
    @Override
    public void run(){
        
        while (true){
            synchronized (this) {
                while (!pause) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
            setFont(new Font("Arial", Font.BOLD, 59));

            setHorizontalAlignment(SwingConstants.CENTER);
            setText(String.format("%02d:%02d:%02d", hour,min,sec));
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            sec++;
            if (sec > 59) {
                min++;
                sec = 0;
            } else if (min > 59) {
                hour++;
                min = 0;
        }
    }


}
}
