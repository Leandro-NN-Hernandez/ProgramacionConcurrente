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
public class IngresoAuto extends Ingreso implements Runnable {

    protected int cantAutos = 50;
    protected final int cant;

    public IngresoAuto(Estacionamiento est, String n, int cant) {
        super(est, n);
        this.cant = cant;
    }

    public void run() {
        boolean estaciono;
        if (cant == 0) {
            cantAutos = cantAutos / 2;
        }
        for (int i = 0 + cant; i < cantAutos; i++) {
            System.out.println("El auto " + i + " INGRESA por " + nombre + ".");
            estaciono = estacionamiento.ingresaAuto();
            if (estaciono) {
                System.out.println("El auto " + i + " ESTACIONO.");
                try {
                    Thread.sleep(10*i);
                } catch (InterruptedException ie) {
                }
            } else {
                System.out.println("El auto " + i + " NO PUDO estacionar.");
            }
        }
    }
}
