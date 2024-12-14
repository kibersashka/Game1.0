package org.example;

public class Main {
    public static void main(String[] args) {
        int fwidth= 1000;
        int fheigth = 1000;
        int finishFieldH = 10;
        int finishFieldW = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = new Entity[4];
        entities[0] = new Ant(0, 0, 0);
        entities[1] = new Turtle(0, 0, 0 );
        entities[2] = new Aught(0, 0, 0);
        entities[3] = new Grasshopper(0, 0, 0);
        Entity.setFSize(fwidth, fheigth);

        Game game = new Game(fwidth, fheigth,
                finishFieldW, finishFieldH,
                finishX, finishY, entities);
        Entity champion = game.start();
        System.out.println(champion);
    }
}
