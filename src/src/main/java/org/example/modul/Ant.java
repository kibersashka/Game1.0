package org.example.modul;

public class Ant extends Entity {

    public Ant() {}

    public Ant(int xcor, int ycor, int score) {
        super("Муравей", xcor, ycor, score);
    }
    @Override
    public void move() {
        int derection = (int) (Math.random() * 4);
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
                if (ycor < fheigth) {
                    ycor += 2;
                }
                break;
            case 3:
                if (xcor > 0) {
                    --xcor;
                }
                break;


        }
        ++score;
    }

}
