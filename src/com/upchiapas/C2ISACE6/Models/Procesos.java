package com.upchiapas.C2ISACE6.Models;

public class Procesos {

    private Punto [] puntos = new Punto[4];

    Impresion impresion = new Impresion();

    public void asignarPunto(){
        puntos [0] = new Punto(0,0);
        puntos [1] = new Punto(2,0);
        puntos [2] = new Punto(2,2);
        puntos [3] = new Punto(0,2);
    }
    public void trasladar(Punto p1){
        for( int i = 0; i<4; i++){
            puntos [i].setX(puntos[i].getX()+p1.getX());
            puntos[i].setY(puntos[i].getY()+p1.getY());
        }
        impresion.imprimir(puntos);
    }
    public void escalar(Punto p1){
        for(int i = 0; i < 4; i++){
            puntos [i].setX(puntos[i].getX()*p1.getX());
            puntos[i].setY(puntos[i].getY()*p1.getY());
        }
        impresion.imprimir(puntos);
    }
}
