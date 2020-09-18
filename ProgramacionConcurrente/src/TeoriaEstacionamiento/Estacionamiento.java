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
public class Estacionamiento {

    private final Lugares lugarMotos;
    private final Lugares lugarAuto;

    public Estacionamiento(int maxM, int maxA) {
        lugarMotos = new Lugares(maxM);
        lugarAuto = new Lugares(maxA);
    }

    public boolean ingresaMoto() {
        boolean estaciona;
        synchronized (lugarMotos) {
            estaciona = lugarMotos.ingreso();
        }
        return estaciona;
    }

    public boolean ingresaAuto() {
        boolean estaciona;
        synchronized (lugarAuto) {
            estaciona = lugarAuto.ingreso();
        }
        return estaciona;
    }

    public boolean saleMoto() {
        boolean libera;
        synchronized (lugarMotos) {
            libera = lugarMotos.salida();
        }
        return libera;
    }

    public boolean saleAuto() {
        boolean libera;
        synchronized (lugarAuto) {
            libera = lugarAuto.salida();
        }
        return libera;
    }

    public boolean hayMotos() {
        synchronized (lugarMotos) {
            return lugarMotos.hayLugar();
        }
    }

    public boolean hayAutos() {
        synchronized (lugarAuto) {
            return lugarAuto.hayLugar();
        }
    }
}
