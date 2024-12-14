package org.example.modul;

public class Grasshopper extends Entity {

    public Grasshopper() {}

    public Grasshopper(int xcor, int ycor, int score) {
        super("Кузнечик", xcor, ycor, score);
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
                    xcor += 2;
                }
                break;
            case 2:
                if (ycor < fheigth) {
                    ++ycor;
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

