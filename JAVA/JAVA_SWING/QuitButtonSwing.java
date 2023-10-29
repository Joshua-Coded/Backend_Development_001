import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Container;
import java.awt.EventQueue;

/**
 * Created BY JOSHUA ALANA
 */

public class QuitButtonSwing extends JFrame {
    private static final long serialVersionUID = 1L;

    private void initializeUI() {
        JButton quitButton = new JButton("QUIT");
        quitButton.addActionListener((event) -> System.exit(0));

        createLayout(quitButton);

        setTitle("quit button");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0]));

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0]));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            QuitButtonSwing quitButtonSwing = new QuitButtonSwing();
            quitButtonSwing.initializeUI();
            quitButtonSwing.setVisible(true);
        });
    }

}