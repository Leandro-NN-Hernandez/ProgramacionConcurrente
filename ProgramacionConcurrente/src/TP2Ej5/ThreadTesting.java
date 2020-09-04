/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Ej5;

/**
 *
 * @author Leandro Hernandez
 */
public class ThreadTesting {

    public static void main(String[] args) {
        //Crea el hilo miHilo con una clase que implementa Runnable
        Thread miHilo = new Thread(new MiEjecucion());
        //inicia miHilo
        miHilo.start();

        //Se agrego un join para controlar la salida
        try {
            miHilo.join();
        } catch (InterruptedException ie) {
        }
        System.out.println("En el main");
    }
}
