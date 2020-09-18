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
        for (int i = 0; i < 10; i++) {
            while (!imprimir()) {
                //repite imprimir hasta que sea su turno
            }
        }
    }

    public boolean imprimir() {
        boolean exito = contador.isTurno(repeticion);
        if (exito) {
            for (int i = 0; i < repeticion; i++) {
                System.out.print(caracter);
            }
            contador.plusTurno();
        }

        return exito;
    }

}
