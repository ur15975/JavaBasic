import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/1/4.
 */
public class AnonymousListenerDemo extends JFrame{
    public AnonymousListenerDemo(){
        JButton jbtNew = new JButton("New");
        JButton jbtOpen = new JButton("Open");
        JButton jbtSave = new JButton("Save");
        JButton jbtPrint = new JButton("Print");

        JPanel panel = new JPanel();
        panel.add(jbtNew);
        panel.add(jbtOpen);
        panel.add(jbtSave);
        panel.add(jbtPrint);

        add(panel);

        jbtNew.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Process New");
                    }
                });
        jbtOpen.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Process Open");
                    }
                });
        jbtSave.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Process Save");
                    }
                }
        );
        jbtPrint.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Process Print");
                    }
                }
        );
    }

    public static void main(String[] args) {
        JFrame frame = new AnonymousListenerDemo();
        frame.setTitle("AnonymousListenerDemo");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
