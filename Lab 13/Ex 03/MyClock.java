
// Import
import java.awt.*;
import javax.swing.*;

// MyClock
public class MyClock extends JLabel implements Runnable {

    // Varable
    private int sec = 0;
    private int min = 0;
    private int hour = 0;

    // Init
    public MyClock() {
        setText("00 : 00 : 00");
        setFont(new Font("Verdana", Font.PLAIN, 30));
    }

    // Run
    public void run() {
        while (true) {
            String h = String.format("%02d", hour);
            String m = String.format("%02d", min);
            String s = String.format("%02d", sec);
            setText(h + " : " + m + " : " + s);
            sec += 1;
            if (sec >= 60) {
                sec = 0;
                min += 1;
            }
            if (min >= 60) {
                min = 0;
                hour += 1;
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
