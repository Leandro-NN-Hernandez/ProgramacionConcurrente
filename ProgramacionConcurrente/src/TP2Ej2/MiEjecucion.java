/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Ej2;

/**
 *
 * @author Leandro Hernandez
 */
public class MiEjecucion extends Thread {

    @Override
    public void run() {
        //llama al metodo ir()
        ir();
    }

    public void ir() {
        //llama al metodo hacerMas()
        hacerMas();
    }

    public void hacerMas() {
        //Imprime "en la pila" 
        System.out.println("En la pila");
    }
}
