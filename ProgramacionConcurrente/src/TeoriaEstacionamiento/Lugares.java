/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaEstacionamiento;

/**
 *
 * @author Leandro Hernandez
 */
public class Lugares {

    private final int MAX;
    private int cant;

    public Lugares(int m) {
        MAX = m;
        cant = 0;
    }

    public synchronized boolean ingreso() {
        boolean estaciona = MAX > cant;
        if (estaciona) {
            cant++;
        }
        return estaciona;
    }

    public synchronized boolean salida() {
        boolean libera = cant > 0;
        if (libera) {
            cant--;
        }
        return libera;
    }

    public synchronized boolean hayLugar() {
        return cant > 0;
    }

}
