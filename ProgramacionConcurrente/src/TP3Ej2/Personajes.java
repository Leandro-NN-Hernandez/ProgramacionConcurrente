/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej2;

/**
 *
 * @author Leandro Hernandez
 */
public class Personajes implements Runnable {

    private ContadorVida cv;
    private final int modificador;

    public Personajes(ContadorVida cv, int modificador) {
        this.cv = cv;
        this.modificador = modificador;
    }

    private void modificarVida() {
        synchronized (cv) {
            cv.modificarVida(modificador);
            System.out.println(Thread.currentThread().getName() + " modifico vida: " + this.modificador);
            System.out.println("Vida modificada por " + Thread.currentThread().getName() + " a: " + cv.getVida());            
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            modificarVida();
        }
    }
}