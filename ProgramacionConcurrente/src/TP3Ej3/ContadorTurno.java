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
public class ContadorTurno {

    private int turno;
    private final int MAXTURNO;

    public ContadorTurno(int max) {
        this.turno = 1;
        MAXTURNO = max;
    }

    public synchronized boolean isTurno(int t) {
        return (turno == t);
    }

    public synchronized void plusTurno() {
        if (turno == MAXTURNO) {
            turno = 1;
        } else {
            turno++;
        }
    }

}
