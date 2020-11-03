package com.company;

public class Vector2D {
    double vX;
    double vY;
    static int count = 0;
    //служебные методы: сеторы, гетеры, кострукторы

    public Vector2D(){
        vX=1;
        vY=1;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vectorForCopy){
        vX = vectorForCopy.vX;
        vY = vectorForCopy.vY;
        count++;
    }
    //вычислительные методы

    public double length(){
        double rez = Math.sqrt(this.vX*this.vX + this.vY*this.vY);
        return rez;
    }

    public void add(Vector2D secondvector){
        this.vX = this.vX + secondvector.vX;
        this.vY = this.vY + secondvector.vY;
    }

    public void sub (Vector2D secondvector){
        this.vX = this.vX - secondvector.vX;
        this.vY = this.vY - secondvector.vY;
    }

    public void scale (double scaleFactor){
        this.vX = this.vX*scaleFactor;
        this.vY = this.vY*scaleFactor;
    }

    public void normalized (){
        double a = Math.sqrt(this.vX*this.vX + this.vY*this.vY);
        this.vX = this.vX/a;
        this.vY = this.vY/a;
        count++;
    }

    public double dotProduct (Vector2D secondvector){
        double rez = this.vX* secondvector.vX + this.vY* secondvector.vY;
        return rez;
    }

    //методы поддержки

    public void print (){
        System.out.format("(%.2f, %.2f)\n", vX, vY);
    }
}

