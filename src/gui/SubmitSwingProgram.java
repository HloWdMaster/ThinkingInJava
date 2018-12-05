package gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Create by 163 on 2018/12/4
 */
public class SubmitSwingProgram extends JFrame {
    JLabel label;

    public SubmitSwingProgram() {
        super("Hello Swing");
        label = new JLabel("A Label");
        this.add(label);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws InterruptedException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    ssp = new SubmitSwingProgram();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Hey ");
            }
        });
    }
}
