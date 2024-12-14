package org.example.modul;

public class Game {
    protected static int fwidth;
    protected static int fheigth;
    private Entity[] players;
    private int finishX;
    private int finishY;
    private int finishFieldH;
    private int finishFieldW;


    public Game() {
    }

    public Game(int fheigth, int fwidth, int finishX, int finishY, int finishFieldH, int finishFieldW, Entity[] players) {
        this.fwidth = fwidth;
        this.fheigth = fheigth;
        this.players = players;
        this.finishFieldH = finishFieldH;
        this.finishFieldW = finishFieldW;
        this.finishX = finishX;
        this.finishY = finishY;
    }

    public Entity start() {
        while (true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].xcor >= finishX
                        && players[i].xcor <= finishX + finishFieldW
                        && players[i].ycor >= finishY
                        && players[i].ycor <= finishY + finishFieldH) {

                    return players[i];
                }

            }
        }

    }
}

