package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Create by 163 on 2018/12/4
 */
public class BorderLayout1 extends JFrame {
    public BorderLayout1() {
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.CENTER, new JButton("Center"));
    }

    public static void main(String[] args) {
        SwingConsole.run(new BorderLayout1(), 300, 250  );
    }
}
