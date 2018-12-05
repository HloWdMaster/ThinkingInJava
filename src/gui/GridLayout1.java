package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Create by 163 on 2018/12/4
 */
public class GridLayout1 extends JFrame {
    public GridLayout1() {
        setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 20; i++) {
            add(new JButton("btn" + i));
        }
    }

    public static void main(String[] args) {
        SwingConsole.run(new GridLayout1(), 300, 300);
    }
}
