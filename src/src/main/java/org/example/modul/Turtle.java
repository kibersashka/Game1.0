package org.example.modul;

public class Turtle extends Entity {

    public Turtle() {}

    public Turtle(int xcor, int ycor, int score) {
        super("Черепаха", xcor, ycor, score);
    }
    @Override
    public void move() {
        int derection = (int) (Math.random() * 3);
        switch (derection) {
            case 0:
                if (ycor > 0) {
                    --ycor;
                }
                break;
            case 1:
                if (xcor < fwidth) {
                    ++xcor;
                }
                break;

            case 2:
                if (xcor > 0) {
                    --xcor;
                }
                break;
        }
        ++score;
    }
}

