/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej2;

/**
 *
 * @author Leandro Hernandez
 */
public class TestVida {

    public static void main(String[] args) {
        ContadorVida cv = new ContadorVida();
        Thread orco = new Thread(new Personajes(cv, -3));
        orco.setName("orco");
        Thread curandero = new Thread(new Personajes(cv, +3));
        curandero.setName("curandero");
        System.out.println("VIDA: " + cv.getVida());
        orco.start();
        curandero.start();
        }

    //El resultado de ejecutarlo varias veces, resulta que cada vez el orden de ejecucion cambia.
}
