package pkg2048.gameobject;

import java.util.Random;
import pkg2048.Main;
import pkg2048.game.Game;
import pkg2048.graphics.Renderer;
import static pkg2048.graphics.Renderer.pixels;
import pkg2048.graphics.Sprite;

/**
 *
 * @author Muhamammad Daffa Ashdaqfillah
 */

public class GameObject {
    
    public double x, y;
    public int width, height;
    public Sprite sprite;
    public int value, speed = 8;
    
    public boolean moving = false, remove = false, hasMoved = false;
    
    Random rand =  new Random();
    
    public GameObject(double x, double y){
        this.x = x;
        this.y = y;
        this.value = (rand.nextBoolean() ? 2 : 4);
        createSprite();
        this.width = sprite.width;
        this.height = sprite.height;
    }
    
    public GameObject(double x, double y, double xp, double yp){
        this.x = x;
        this.y = y;
        int yy = (int) (y + yp);
        for(int i = 0; i < sprite.height; i++){
            if(yy<0 || yy > 100) continue;
            for(int j = 0; j < sprite.width; j++){
                int xx = (int) (j + xp);
                if(xx < 0 || xx > width) continue;
                int col = sprite.pixels[j + i * sprite.width];
                if(col == 0xffff00ff) continue;
                else pixels[xx + yy * width] =  col;
            }
        }
        this.value = (rand.nextBoolean() ? 2 : 4);
        createSprite();
        this.width = sprite.width;
        this.height = sprite.height;
    }

    public void createSprite() {
        if(this.value == 2){
            this.sprite = new Sprite (100, 100, 0x8091af);
        } else if(this.value == 4){
            this.sprite = new Sprite (100, 100, 0x4869ab);
        } else if(this.value == 8){
            this.sprite = new Sprite (100, 100, 0x1788ac);
        } else if(this.value == 16){
            this.sprite = new Sprite (100, 100, 0x2d6ae2);
        } else if(this.value == 32){
            this.sprite = new Sprite (100, 100, 0x0dd044);
        } else if(this.value == 64){
            this.sprite = new Sprite (100, 100, 0xf365ee);
        } else if(this.value == 128){
            this.sprite = new Sprite (100, 100, 0xf3189b);
        } else if(this.value == 256){
            this.sprite = new Sprite (100, 100, 0xfca642);
        } else if(this.value == 512){
            this.sprite = new Sprite (100, 100, 0x439A97);
        } else if(this.value == 1024){
            this.sprite = new Sprite (100, 100, 0x82CD47);
        } else if(this.value == 2048){
            this.sprite = new Sprite (100, 100, 0x80489C);
        } else if(this.value == 4096){
            this.sprite = new Sprite (100, 100, 0x6D67E4);
        }
    }
    
    public boolean canMove(){
        if(x < 0 || x + width > Main.WIDTH || y < 0 || y + height > Main.HEIGHT){
            return false;
        }
        for(int i = 0; i < Game.objects.size(); i++){
            GameObject o = Game.objects.get(i);
            if(this == o) continue;
            if(x + width > o.x && x < o.x + o.width && y + height > o.y && y < o.y + o.height && value != o.value){
                return false;
            }
        }
        return true;
    }

    public void update() {
        if(Game.moving){
            if(!hasMoved){
                hasMoved = true;
            }
            if(canMove()){
                moving = true;
            }
            if(moving){
                if(Game.dir == 0) x -= speed;
                if(Game.dir == 1) x += speed;
                if(Game.dir == 2) y -= speed;
                if(Game.dir == 3) y += speed;
            }
            if(!canMove()){
                moving = false;
                x = Math.round(x / 100) * 100;
                y = Math.round(y / 100) * 100;
            }
        }
    }
    
    public void render(){
        Renderer.renderSprite(sprite, (int) x, (int) y);
    }
}
