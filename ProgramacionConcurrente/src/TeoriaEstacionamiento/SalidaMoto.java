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
public class SalidaMoto extends Ingreso implements Runnable {

    public SalidaMoto(Estacionamiento est, String n) {
        super(est, n);
    }

    @Override
    public void run() {
      
           
        
        boolean hayMoto = estacionamiento.hayMotos();
        int i = 0;
         Thread.yield();
        while (hayMoto) {
            estacionamiento.saleMoto();
            System.out.println("La moto " + i + " SALE del estacionamiento");
            i++;
            hayMoto = estacionamiento.hayMotos();
        }
    }

}
