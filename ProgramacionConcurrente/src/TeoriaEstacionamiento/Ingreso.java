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
public class Ingreso {
    protected String nombre;
    protected Estacionamiento estacionamiento;

    public Ingreso(Estacionamiento est, String n) {
        nombre = n;
        estacionamiento = est;
    }
}
