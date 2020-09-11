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
public class TestAuto {

    public static void main(String[] args) {
        Thread[] hilo = new Thread[7];
        Surtidor surtidor = new Surtidor();
        for (int i = 0; i < 7; i++) {
            hilo[i] = new Thread(new Auto("A" + i, 1000, 10 + i, surtidor));
        }
        for (int j = 0; j < 7; j++) {
            hilo[j].start();
        }
    }
}
