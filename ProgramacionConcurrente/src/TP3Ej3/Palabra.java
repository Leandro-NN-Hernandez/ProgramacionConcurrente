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
public class Palabra {

    private int turno;

    public Palabra() {
        turno = 1;
    }

    public synchronized int getTurno() {
        return turno;
    }

    public synchronized void plusTurno() {
        if (turno == 3) {
            turno = 1;
        } else {
            turno++;
        }
    }

}
