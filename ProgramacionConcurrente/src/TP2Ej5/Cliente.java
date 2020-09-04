/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Ej5;

/**
 *
 * @author Leandro Hernandez
 */
public class Cliente implements Runnable {

    @Override
    public void run() {
        //Indica el nombre del hilo actual
        System.out.println("Soy " + Thread.currentThread().getName());
        //LLama al metodo de clase uso, el cual indica el nombre del hilo en ejeccucion
        Recurso.uso();
        try {
            //¿Duerme al hilo actual 2 segundos?
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
;
}
