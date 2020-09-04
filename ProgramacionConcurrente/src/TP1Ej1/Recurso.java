/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP1Ej1;

/**
 *
 * @author Leandro Hernandez
 */
public class Recurso {

     static​​   void​​ 
        uso​() { Thread t = Thread.currentThread();
        //indica cual es el hilo que llamo al metodo uso()
        System.out.println("En recurso soy:" + t.getName()
        );
    }
}
