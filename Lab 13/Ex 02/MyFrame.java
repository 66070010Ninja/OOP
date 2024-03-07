
// Import
import javax.swing.*;

// MyFrame
public class MyFrame {

    // Varlabel
    private JFrame fr;
    private JPanel panel;
    private MyClock clock;
    private Thread t;

    // Init
    public MyFrame() {
        panel = new JPanel();
        fr = new JFrame();
        clock = new MyClock();
        t = new Thread();
        t.start();
        panel.add(clock);
        fr.add(panel);
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Test And Run Code
    public static void main(String[] args) {
        new MyFrame();
    }
}
