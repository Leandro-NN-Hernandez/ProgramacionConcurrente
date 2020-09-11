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
        cv.modificarVida(modificador);
        System.out.println(Thread.currentThread().getName() + " modifico vida: " + this.modificador);
        System.out.println("Vida modificada por " + Thread.currentThread().getName() + " a: " + cv.getVida());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
        }
    }

    @Override
    public void run() {
        modificarVida();
    }
}
