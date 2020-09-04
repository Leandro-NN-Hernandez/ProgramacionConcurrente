/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Ej3;

/**
 *
 * @author Leandro Hernandez
 */
public class PruebaPingPong {

    public static void main(String[] args) {
        PingPong t1 = new PingPong("PING", 13);
        PingPong t2 = new PingPong("PONG", 10);// Activación
        //3.f No se puede determinar que proceso se esta ejecutando
        PingPong t3 = new PingPong("PANG", 14);
        PingPong t4 = new PingPong("PUNG", 12);
        t1.start();
        t2.start();// Espera unos segundos
        t3.start();
        t4.start();
        // 3.c
        for (int i = 0; i < 20; i++) {
            System.out.println("Una sentencia cualquiera " + i);
            /*
            //3.d 
            try {                
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
             */
        }
        try {
            //Con la siguiente sentencia, el programa tarda 5 segundos mas
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }

    }// Finaliza la ejecución de los threads... 
    //3.e el agregar un sleep en una estructura repetitiva aumenta el tiempo
    //de ejecuccion considerablemente y que en el programa no hay un orden
    //de ejecucion, hay indeterministo
}
