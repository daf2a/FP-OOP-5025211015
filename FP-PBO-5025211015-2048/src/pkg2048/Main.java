package pkg2048;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;
import pkg2048.game.Game;
import pkg2048.input.Keyboard;

/**
 * @author Muhammad Daffa Ashdaqfillah
 */

public class Main extends Canvas implements Runnable{

    public static final int WIDTH = 400, HEIGHT = 400;
    public static float scale = 2.0f;
    public static int score = 0;
    public static int highScore = 0;
    public static boolean run = true;
    
    public JFrame frame;
    public Thread thread;
    public Keyboard key;
    public Game game;
    public boolean running = false;
    
    public static BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    public static int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
    
    public Main(){
        setPreferredSize(new Dimension((int)(WIDTH*scale), (int)(HEIGHT *scale)));
        frame = new JFrame();
        game = new Game ();
        key = new Keyboard();
        addKeyListener(key);
    }
    
    public void start(){
        running = true;
        thread = new Thread(this, "loopThread");
        thread.start();
    }   
    
    public void stop(){
        try {
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public void run(){
        long lastTimeInNanoSeconds = System.nanoTime();
        long timer = System.currentTimeMillis();
        double nanoSecondsPerUpdate = 1000000000.0 / 60.0;
        double updatesToPerform = 0.0;
        int frames = 0;
        int updates = 0;
        requestFocus();
        
        while(running){
            long currentTimeInNanoSeconds = System.nanoTime();
            updatesToPerform += (currentTimeInNanoSeconds =  lastTimeInNanoSeconds) /  nanoSecondsPerUpdate;
            if(updatesToPerform >= 1){
                update();
                updates++;
                updatesToPerform--;
            }
            lastTimeInNanoSeconds = currentTimeInNanoSeconds;
            
            render();
            frames++;
            
            if(System.currentTimeMillis() - timer>1000){
                frame.setTitle("2048" + updates + " updates, " + frames + " frames");
                updates = 0;
                frames = 0;
                timer += 1000;                
            }
        }
    }
    
    public void update(){
        game.update();
        key.update();
    }
    
    public void render(){
        BufferStrategy bs = getBufferStrategy();
        if(bs == null){
            createBufferStrategy(3);
            return;
        }
        
        game.render();
        
        Graphics2D g = (Graphics2D) bs.getDrawGraphics();
        g.drawImage(image, 0, 0, (int) (WIDTH * scale), (int) (HEIGHT * scale), null);
        game.renderText(g);
        g.dispose();
        bs.show();
    }
    
    public static void main(String[] args) {
            Main m = new Main();
    }
    
    
}
