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

    private final ContadorTurno contador;
    private final char caracter;
    private final int repeticion;

    public Secuencia(char caracter, int repeticion, ContadorTurno palabra) {
        this.caracter = caracter;
        this.repeticion = repeticion;
        this.contador = palabra;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            while (!imprimir()) {
            }
        }
    }

    public boolean imprimir() {
        boolean exito = false;
        if (contador.isTurno(repeticion)) {
            for (int i = 0; i < repeticion; i++) {
                System.out.print(caracter);
            }
            contador.plusTurno();
            exito = true;
        }

        
        return exito;
    }

}
