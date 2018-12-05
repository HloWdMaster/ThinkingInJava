package gui;

import javax.swing.*;

/**
 * Create by 163 on 2018/12/4
 */
public class SwingConsole {
    public static void run(final JFrame frame, final int width, final int height) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setSize(width,height);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle(frame.getClass().getSimpleName());
                frame.setVisible(true);
            }
        });
    }
}
