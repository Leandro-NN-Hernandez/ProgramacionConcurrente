/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej3;

/**
 *
 * @author Leandro Hernandez
 */
public class Secuencia implements Runnable {

    private Palabra palabra;
    private final char caracter;
    private final int repeticion;

    public Secuencia(char caracter, int repeticion, Palabra palabra) {
        this.caracter = caracter;
        this.repeticion = repeticion;
        this.palabra = palabra;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            imprimir();
        }
    }

    public synchronized void imprimir() {
        String pal = "";
        if (palabra.getTurno() == repeticion) {
            for (int i = 0; i < repeticion; i++) {
                pal += caracter;
            }
            System.out.print(pal);
            if (palabra.getTurno() == 3) {
                System.out.println();
            }
            palabra.plusTurno();
        } else {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ie) {
            }
        }
    }

}
