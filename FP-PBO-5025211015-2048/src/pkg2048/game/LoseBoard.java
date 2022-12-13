package pkg2048.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Muhammad Daffa Ashdaqfillah
 */

public class LoseBoard extends JPanel{
    Font large = new Font("SanSerif", 0, 40);
    Font small = new Font("SanSerif", 0, 20);
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(new Color(20,20,20));
        g.fillRect(0,0, 400, 400);
        g.setFont(large);
        g.drawString("You Lose!", 20, 10);        
    }
}
