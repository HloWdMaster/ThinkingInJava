package gui.ex;

import gui.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Create by 163 on 2018/12/4
 */
public class E09_ShowMethods {
    public static void main(String[] args) {
        SwingConsole.run(new ShowMethodClean(), 600, 400);
    }
}

class ShowMethodClean extends JFrame {
    private static Pattern qualifier = Pattern.compile("\\w+\\.");
    String[] n;
    JTextField name = new JTextField(25),   //类名
            searchFor = new JTextField(25); //搜索
    JTextArea results = new JTextArea(40, 65);
    JScrollPane scrollPane = new JScrollPane(results);

    class NameL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            results.setText("");
            String nm = name.getText().trim();
            if (nm.length() == 0) {
                results.setText("No match");
                return;
            }
            Class<?> type;
            try {
                type = Class.forName(nm);
            } catch (ClassNotFoundException e1) {
                results.setText("No Match");
                return;
            }
            Method[] methods = type.getMethods();
            Constructor<?>[] ctor = type.getConstructors();
            n = new String[methods.length + ctor.length];
            for (int i = 0; i < methods.length; i++) {
                n[i] = methods[i].toString();
            }
            for (int i = 0; i < ctor.length; i++) {
                n[i + methods.length] = ctor[i].toString();
            }
            reDisPlay();
        }
    }

    void reDisPlay() {
        results.setText("");
        String searchStr = searchFor.getText().trim();
        if (searchStr.length() == 0)
            for (String s : n)
                results.append(qualifier.matcher(s).replaceAll("") + "\n");
        else {
            List<String> lookFor = Arrays.asList(searchStr.split("\\s+"));
            for (String s : n) {
                Iterator<String> it = lookFor.iterator();
                boolean include = true;
                while (it.hasNext()) {
                    if (s.indexOf(it.next()) == -1) {
                        include = false;
                    }
                    if (include == true) {
                        results.append(qualifier.matcher(s).replaceAll("") + "\n");
                    }
                }
            }
        }
        scrollPane.getViewport().setViewPosition(new Point(0, 0));  //视图返回顶部
    }

    public ShowMethodClean() {
        name.addActionListener(new NameL());
        searchFor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reDisPlay();
            }
        });
        JPanel top1 = new JPanel();
        JPanel top2 = new JPanel();
        top1.add(new JLabel("Qualified.class.name (press Enter):"));
        top1.add(name);

        top2.add(new JLabel("Words to search for (optional):"));
        top2.add(searchFor);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(top1);
        panel.add(top2);
        add(BorderLayout.NORTH, panel);
        add(scrollPane);
    }
}