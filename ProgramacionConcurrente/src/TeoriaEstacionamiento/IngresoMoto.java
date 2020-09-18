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
public class IngresoMoto extends Ingreso implements Runnable {

    protected final int cantMotos = 100;

    public IngresoMoto(Estacionamiento est, String n) {
        super(est, n);
    }

    public void run() {
        boolean estaciono;
        for (int i = 0; i < cantMotos; i++) {
            System.out.println("La moto " + i + " INGRESA por "+ nombre +".");
            estaciono = estacionamiento.ingresaMoto();
            if (estaciono) {
                System.out.println("La moto " + i + " ESTACIONO.");
                try {
                    Thread.sleep(10*i);
                } catch (InterruptedException ie) {
                }
            } else {
                System.out.println("La moto " + i + " NO PUDO estacionar.");
            }
        }
    }
}
