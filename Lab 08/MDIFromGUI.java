import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JDesktopPane desktopPane;
    private JInternalFrame app1, app2, app3;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, m4, mi1;
    private JMenuItem  mi2, mi3, mi4, msi1, msi2;

    public MDIFromGUI() {
        desktopPane = new JDesktopPane();
        app1 = new JInternalFrame("Application 01", true, true, true, true);
        app2 = new JInternalFrame("Application 02", true, true, true, true);
        app3 = new JInternalFrame("Application 03", true, true, true, true);
        desktopPane.add(app1); desktopPane.add(app2); desktopPane.add(app3);

        app1.setSize(190, 100);
        app1.setVisible(true);
        app2.setSize(190, 150);
        app2.setVisible(true);
        app3.setSize(220, 170);
        app3.setVisible(true);

        int x2 = app1.getX() + app1.getWidth() + 10;
        int y2 = app1.getY();
        app2.setLocation(x2, y2);
        int x3 = app2.getX() + app2.getWidth() + 10;
        int y3 = app2.getY();
        app3.setLocation(x3, y3);

        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("RTX");
        fr.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3); mb.add(m4);
        mi1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(mi1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        mi1.add(msi1);
        mi1.addSeparator();
        mi1.add(msi2);
        fr.add(desktopPane, BorderLayout.CENTER);
        fr.setSize(480, 300);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {new MDIFromGUI();});
    }
}
