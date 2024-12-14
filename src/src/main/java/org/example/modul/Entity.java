package org.example.modul;

public class Entity {
    protected String name;
    protected int xcor;
    protected int ycor;
    protected static int fwidth;
    protected static int fheigth;
    protected int score;

    public Entity() {}

    public Entity(String name) {
        this.name = name;
    }

    public Entity(String name, int xcor, int ycor, int score) {
        this.xcor = xcor;
        this.ycor = ycor;
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return this.name + " (" + this.xcor + ", " + this.ycor + ") " + " Количество очков: " + this.score;
    }

    public void move() {
    }

    public int getXcor() {
        return xcor;
    }

    public String getName() {
        return name;
    }

    public int getYcor() {
        return ycor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setXcor(int xcor) {
        this.xcor = xcor;
    }

    public void setYcor(int ycor) {
        this.ycor = ycor;
    }
    public void setScore() {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public static void setFSize(int width, int heigth) {
        fheigth = heigth;
        fwidth = width;
    }

}

