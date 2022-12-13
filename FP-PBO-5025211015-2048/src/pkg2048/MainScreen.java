package pkg2048;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static pkg2048.Main.highScore;

/**
 *
 * @author Muhammad Daffa Ashdaqfillah
 */

public class MainScreen{
    public static void main (String[] args){
        X obj = new X();
    }
}

class Text<T> {
    T prnt;
    Text(T prnt) { this.prnt = prnt; }
    public T getObject() { return this.prnt; }
}

class X extends JFrame {
    private ImageIcon bg;
    private JLabel myLabel;
    public X(){
        JFrame f = new JFrame();
        
        try {
            bg = new ImageIcon(getClass().getResource("/images/bg.png"));
        } catch (Exception e){
            System.out.println("Image can't be louded !");
        }
        
        myLabel = new JLabel(bg);
        myLabel.setSize(385,385);
        
        JButton button = new JButton("Play");
        button.addActionListener((ActionEvent e) -> {
            Main m = new Main();
            m.frame.setResizable(false);
            m.frame.setTitle("2048");
            m.frame.add(m);
            m.frame.pack();
            m.frame.setVisible(true);
            m.frame.setLocationRelativeTo(null);
            m.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            m.frame.setAlwaysOnTop(true);
            m.start();
        });
        
        Text<Integer> highI = new Text<>(highScore);
        Text<String> highS = new Text<>("High Score : ");
        
        //JLabel label = new JLabel ("" + highS + highS);
        JLabel label = new JLabel ("High Score : " + highScore);
        JLabel title = new JLabel ("        2048");
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(150,150,150,150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(title);
        panel.add(button);
        panel.add(label);
        
        
        f.add(myLabel);
        f.add(panel, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Main Screen");
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setAlwaysOnTop(true);
    }
}
