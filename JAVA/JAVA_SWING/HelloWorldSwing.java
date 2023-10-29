import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 * @Joshua Alana
 *         2023
 */
public class HelloWorldSwing {
    private static void createAndShowGUI() {
        JFrame jframe = new JFrame("Hello Joshua World!!");
        jframe.setLayout(new FlowLayout());
        jframe.setSize(500, 360);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello Irabor");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Hello Irabor and Joshua");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        jframe.add(label);
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
