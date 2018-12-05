package gui.ex;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Create by 163 on 2018/12/4
 */
public class DynamicHelloLabel extends JFrame {

    private static Random rand = new Random();
    JLabel[] labels;

    public DynamicHelloLabel() {
        super("hello Swing");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);

        int nums = rand.nextInt(10) + 1;
        labels = new JLabel[nums];
        for (int i = 0; i < nums; i++) {
            add(labels[i] = new JLabel("JLabel" + i));
        }

    }
    static DynamicHelloLabel dhl;
    public static void main(String[] args) throws InterruptedException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                dhl = new DynamicHelloLabel();
            }
        });

        TimeUnit.SECONDS.sleep(2);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < dhl.labels.length; i++) {
                    dhl.labels[i].setText("LABEL:"+i);
                }
            }
        });
    }
}
