package org.example.modul;

public class Aught extends Entity {

    public Aught() {
    }

    public Aught(int xcor, int ycor, int score){
        super("Нечто", xcor, ycor, score);
    }


    @Override
    public void move() {
        xcor = (int) (Math.random() * (101));
        ycor = (int) (Math.random() * (101));
        ++score;
    }
}
