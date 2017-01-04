import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/1/4.
 */
public class ControlCircle2 extends JFrame{
    private JButton jbtEnlarge = new JButton("Enlarge");
    private JButton jbtShrink = new JButton("Shrink");
    private CirclePanel canvas = new CirclePanel();

    public ControlCircle2(){
        JPanel panel = new JPanel();
        panel.add(jbtEnlarge);
        panel.add(jbtShrink);

        this.add(canvas,BorderLayout.CENTER);
        this.add(panel,BorderLayout.SOUTH);
        jbtEnlarge.addActionListener(new EnlargeListener());
    }
    class EnlargeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            canvas.enlarge();
        }
    }

    class CirclePanel extends JPanel{
        private int radius = 5;
        public void enlarge(){
            radius ++;
            repaint();
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawOval(getWidth() / 2 - radius,getHeight() / 2 - radius,2 * radius,2 * radius);
        }
    }
}
