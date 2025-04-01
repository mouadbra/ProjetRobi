package exercice1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import graphicLayer.GRect;
import graphicLayer.GSpace;

public class Exercice1_0 {
    private GSpace space;
    private GRect robi;
    private RobiController robiController;
    
    public Exercice1_0() {
        // Création et configuration de l'espace et de robi
        space = new GSpace("Exercice 1", new Dimension(200, 150));
        robi = new GRect();
        
        // Configuration initiale de robi
        robi.setColor(Color.BLUE);
        robi.setPosition(new Point(0, 0));
        robi.setDimension(new Dimension(30, 30));
        
        // Ajout de robi à l'espace
        space.addElement(robi);
        space.open();
        
        // Création du contrôleur pour gérer l'animation
        robiController = new RobiController(space, robi);
        
        // Démarrage de l'animation
        startAnimation();
    }
    
    private void startAnimation() {
        // Création et démarrage de l'animation dans un thread séparé
        AnimationThread animationThread = new AnimationThread(robiController);
        animationThread.start();
    }
    
    public static void main(String[] args) {
        new Exercice1_0();
    }
}