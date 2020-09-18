/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej4;

/**
 *
 * @author Leandro Hernandez
 */
public class Auto implements Runnable {

    private Surtidor surtidor;
    private String patente;
    private final int kmMaximos;
    private int kmRecorridos;
    private int vueltas;

    public Auto(String pat, int km, int vueltas, Surtidor surtidor) {
        patente = pat;
        kmMaximos = km;
        this.surtidor = surtidor;
        this.vueltas = vueltas;
    }

    @Override
    public void run() {
        for (int i = 0; i < vueltas; i++) {
            System.out.println("El auto " + patente + " esta ANDANDO");
            for (kmRecorridos = 0; kmRecorridos < kmMaximos; kmRecorridos++) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException ie) {
                }
            }
            System.out.println("El auto " + patente + " se FRENO");
            if (vueltas - 1 != i) {
                surtidor.usandose(patente);

            } else {
                System.out.println("EL AUTO " + patente + " SE PARO DEFINITIVAMENTE");
            }
        }
    }

}
