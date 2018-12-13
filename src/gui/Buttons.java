package gui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

/**
 * Create by 163 on 2018/12/13
 */
public class Buttons extends JFrame {
    private JButton btn = new JButton("JButton");
    private BasicArrowButton
            up = new BasicArrowButton(BasicArrowButton.NORTH),
            down = new BasicArrowButton(BasicArrowButton.SOUTH),
            left = new BasicArrowButton(BasicArrowButton.EAST),
            right = new BasicArrowButton(BasicArrowButton.WEST);

    public Buttons() {
        setLayout(new FlowLayout());
        add(btn);
        add(new JToggleButton("JToggleButton"));
        add(new JCheckBox("JCheckBox"));
        add(new JRadioButton("JRadioButton"));
        JPanel jp = new JPanel();
        jp.setBorder(new TitledBorder("Directions"));
        jp.add(up);
        jp.add(down);
        jp.add(left);
        jp.add(right);
        add(jp);
    }

    public static void main(String[] args) {
        SwingConsole.run(new Buttons(), 350, 200);
    }

}
