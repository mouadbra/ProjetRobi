package exercice1;

public class AnimationThread extends Thread {
    private RobiController controller;
    
    public AnimationThread(RobiController controller) {
        this.controller = controller;
    }
    
    @Override
    public void run() {
        // Exécution de l'animation en boucle
        while (!isInterrupted()) {
            controller.moveToRightBorder();
            controller.moveToBottomBorder();
            controller.moveToLeftBorder();
            controller.moveToTopBorder();
            controller.changeToRandomColor();
        }
    }
}