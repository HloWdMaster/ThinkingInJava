package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Create by 163 on 2018/12/4
 */
public class Button1 extends JFrame {
    private JButton
            b1 = new JButton("btn 1"),
            b2 = new JButton("btn 2");

    public Button1() {
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Button1(), 200, 200);
    }
}
