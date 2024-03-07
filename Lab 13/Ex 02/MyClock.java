
// Import
import java.awt.*;
import java.util.*;
import javax.swing.*;

// MyClock
public class MyClock extends JLabel implements Runnable {

    // Init
    public MyClock() {
        setText("00 : 00 : 00");
        setFont(new Font("Verdana", Font.PLAIN, 30));
    }

    // Run
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            String h = String.format("%02d", hour);
            String m = String.format("%02d", min);
            String s = String.format("%02d", sec);
            setText(h + " : " + m + " : " + s);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
