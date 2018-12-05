package gui;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Create by 163 on 2018/12/4
 */
public class SubmitLabelManipulationTask {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame();
        final JLabel label = new JLabel("A Label");
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("hey! this is difference");
            }
        });
    }
}
