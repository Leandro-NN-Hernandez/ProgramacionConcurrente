/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej4;

/**
 *
 * @author Leandro Hernandez
 */
public class Surtidor {

    public Surtidor() {
    }

    public synchronized void usandose(String patente) {
        System.out.println("El auto " + patente + " esta REPOSTANDO");
        System.out.println("El auto " + patente + " LIBERO el surtidor");
    }
}
