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
public class SalidaAuto extends Ingreso implements Runnable {

    public SalidaAuto(Estacionamiento est, String n) {
        super(est, n);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {

        }
        boolean hayMoto = estacionamiento.hayAutos();
        int i = 0;
        while (hayMoto) {
            estacionamiento.saleAuto();
            System.out.println("El auto " + i + " SALE del estacionamiento");
            i++;
            hayMoto = estacionamiento.hayAutos();
        }
    }

}
