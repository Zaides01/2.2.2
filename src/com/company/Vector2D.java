package com.company;

public class Vector2D {
    double vX;
    double vY;
    //служебные методы: сеторы, гетеры, кострукторы


    public void setvX(double vX) {
        this.vX = vX;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }

    public double getvX() {
        return vX;
    }

    public double getvY() {
        return vY;
    }

    public Vector2D(){
        vX=1;
        vY=1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vectorForCopy){
        vX = vectorForCopy.vX;
        vY = vectorForCopy.vY;
    }
    //вычислительные методы

    public double length(){
        double rez = Math.sqrt(this.vX*this.vX + this.vY*this.vY);
        return rez;
    }

    public Vector2D add(Vector2D secondvector){
        Vector2D rez = new Vector2D();
        rez.vX = this.vX + secondvector.vX;
        rez.vY = this.vY + secondvector.vY;
        return rez;
    }

    public Vector2D sub (Vector2D secondvector){
        Vector2D rez = new Vector2D();
        rez.vX = this.vX - secondvector.vX;
        rez.vY = this.vY - secondvector.vY;
        return rez;
    }

    public Vector2D scale (double scaleFactor){
        Vector2D rez = new Vector2D();
        rez.vX = this.vX*scaleFactor;
        rez.vY = this.vY*scaleFactor;
        return rez;
    }

    //методы поддержки

    public void print (){
        System.out.format("(%.2f, %.2f)\n", vX, vY);
    }
}

