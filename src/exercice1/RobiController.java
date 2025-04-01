package exercice1;

import java.awt.Color;
import java.awt.Point;
import java.util.Random;

import graphicLayer.GRect;
import graphicLayer.GSpace;

public class RobiController {
    private GSpace space;
    private GRect robi;
    private Random random;
    
    public RobiController(GSpace space, GRect robi) {
        this.space = space;
        this.robi = robi;
        this.random = new Random();
    }
    
    public void moveToRightBorder() {
        while (robi.getX() + robi.getWidth() < space.getWidth()) {
            robi.translate(new Point(1, 0));
            sleep(10);
        }
    }
    
    public void moveToBottomBorder() {
        while (robi.getY() + robi.getHeight() < space.getHeight()) {
            robi.translate(new Point(0, 1));
            sleep(10);
        }
    }
    
    public void moveToLeftBorder() {
        while (robi.getX() > 0) {
            robi.translate(new Point(-1, 0));
            sleep(10);
        }
    }
    
    public void moveToTopBorder() {
        while (robi.getY() > 0) {
            robi.translate(new Point(0, -1));
            sleep(10);
        }
    }
    
    public void changeToRandomColor() {
        Color randomColor = new Color(
            random.nextInt(256), 
            random.nextInt(256), 
            random.nextInt(256)
        );
        robi.setColor(randomColor);
    }
    
    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}