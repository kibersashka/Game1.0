package org.example.modul;

public class Aught extends Entity {

    public Aught() {
    }

    public Aught(int xcor, int ycor, int score){
        super("Нечто", xcor, ycor, score);
    }


    @Override
    public void move() {
        int derection = (int) (Math.random() * 4);
        int step = (int) (Math.random() * 3);
        switch (derection) {
            case 0:
                if (ycor > 0) {
                    ycor -= step;
                }
                break;
            case 1:
                if (xcor < fwidth) {
                    xcor += step;
                }
                break;
            case 2:
                if (ycor < fheigth) {
                    ycor += step;
                }
                break;
            case 3:
                if (xcor > 0) {
                    xcor -= step;
                }
                break;


        }
        ++score;
    }
}
