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
public class Cliente extends Thread {

    @Override
    public void run() {
        System.out.println("Soy " + Thread.currentThread().getName());
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
;
}
