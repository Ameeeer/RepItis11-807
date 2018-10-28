package Java;

import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame {
    GUI() {
        super("Test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();


        panel.setLayout(new FlowLayout());
        panel.add(new JButton("press"), JButton.CENTER);
        panel.add(new JButton("-"));
        panel.add(new JButton("+"));
        panel.add(new JButton("CheckCount"));
        setContentPane(panel);
        setSize(400, 300);
        pack();
    }
}
