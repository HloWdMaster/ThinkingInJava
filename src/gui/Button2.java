package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Create by 163 on 2018/12/4
 */
public class Button2 extends JFrame {
    private JButton
            b1 = new JButton("btn1"),
            b2 = new JButton("btn2");
    private JTextField txt = new JTextField(10);

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText();
            txt.setText(name);
        }
    }

    private ButtonListener btnL = new ButtonListener();

    public Button2() {
        b1.addActionListener(btnL);
        b2.addActionListener(btnL);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Button2(), 200, 200);
    }
}
