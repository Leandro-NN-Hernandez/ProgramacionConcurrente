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
public class EstacionamientoTest {

    public static void main(String[] args) {
        Estacionamiento est = new Estacionamiento(65, 38);
        Thread entradaMoto = new Thread(new IngresoMoto(est, "EntradaM"));
        Thread salidaMoto = new Thread(new SalidaMoto(est, "SalidaM"));

        Thread entradaAutoSur = new Thread(new IngresoAuto(est, "EntradaS", 0));
        Thread entradaAutoNorte = new Thread(new IngresoAuto(est, "EntradaN", 24));
        Thread salidaAuto = new Thread(new SalidaAuto(est, "SalidaA"));

        entradaMoto.start();
        salidaMoto.start();
        entradaAutoSur.start();
        entradaAutoNorte.start();
        salidaAuto.start();
    }
}
