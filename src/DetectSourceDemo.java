import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/1/4.
 */
public class DetectSourceDemo extends JFrame{
    private JButton jbtNew = new JButton("New");
    private JButton jbtOpen = new JButton("Open");
    private JButton jbtSave = new JButton("Save");
    private JButton jbtPrint = new JButton("Print");
    public DetectSourceDemo(){
        JPanel panel = new JPanel();
        panel.add(jbtNew);
        panel.add(jbtOpen);
        panel.add(jbtSave);
        panel.add(jbtPrint);

        add(panel);

        ButtonListener buttonListener = new ButtonListener();

        jbtNew.addActionListener(buttonListener);
        jbtOpen.addActionListener(buttonListener);
        jbtSave.addActionListener(buttonListener);
        jbtPrint.addActionListener(buttonListener);
    }

    public static void main(String[] args) {
        JFrame frame = new DetectSourceDemo();
        frame.setTitle("DetectSourceDemo");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == jbtNew)
                System.out.println("new");
            else if(e.getSource() == jbtOpen)
                System.out.println("open");
            else if(e.getSource() == jbtSave)
                System.out.println("save");
            else if (e.getSource() == jbtPrint)
                System.out.println("print");
        }
    }
}
