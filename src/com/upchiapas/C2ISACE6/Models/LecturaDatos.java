package com.upchiapas.C2ISACE6.Models;
import javax.swing.*;
import java.util.Scanner;

public class LecturaDatos {
    private Scanner entrada = new Scanner(System.in);
    public void LecturaDatos(){
        Punto p1 = new Punto(0,0);
        Procesos proceso = new Procesos();
        proceso.asignarPunto();
        int opcion;
        do{
            String entrada = JOptionPane.showInputDialog(null,"1.-Trasladar" + "2.-Escalar");
            opcion = Integer.parseInt(entrada);
            switch(opcion){
                case 1:
                    entrada=JOptionPane.showInputDialog(null,"Ingrese x: ");
                    p1.setX(Float.parseFloat(entrada));
                    entrada =JOptionPane.showInputDialog(null,"Ingrese y: ");
                    p1.setY(Float.parseFloat(entrada));
                    proceso.trasladar(p1);
                    break;
                case 2:
                    entrada =JOptionPane.showInputDialog(null,"Ingrese x: ");
                    p1.setX(Float.parseFloat(entrada));
                    entrada =JOptionPane.showInputDialog(null,"Ingrese y: ");
                    p1.setY(Float.parseFloat(entrada));
                    proceso.escalar(p1);
                    break;
                default:
                    JOptionPane.showInputDialog(null,"opcion invalida");
                    break;
            }
        }while(opcion != 1 && opcion !=2);
    }
}
