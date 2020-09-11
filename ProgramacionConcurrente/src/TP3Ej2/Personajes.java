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

    @Override
    public void run() {
        cv.modificarVida(modificador);
        System.out.println(Thread.currentThread().getName() + " modifico: " + modificador);
        System.out.println(Thread.currentThread().getName() + " tu vida es: " + cv.getVida());

    }
}
