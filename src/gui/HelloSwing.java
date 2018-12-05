package gui;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Create by 163 on 2018/12/4
 */
public class HelloSwing {
    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Hello Swings");
//        JLabel label = new JLabel();
        Random r = new Random();
        for (int i = 0; i < r.nextInt(7); i++) {
            JLabel label = new JLabel("i" + i);
            label.setText(""+i);
            jFrame.add(label);
        }
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 100);
        jFrame.setVisible(true);

        TimeUnit.SECONDS.sleep(1);
//        label.setText("Hey! this is different");

    }
}
