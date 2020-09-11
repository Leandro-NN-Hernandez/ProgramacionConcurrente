/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej3;

/**
 *
 * @author Leandro Hernandez
 */
public class TestLetras {
    
    public static void main(String[] args) {
        Palabra palabra = new Palabra();
        Thread a = new Thread(new Secuencia('A', 1, palabra));
        Thread b = new Thread(new Secuencia('B', 2, palabra));
        Thread c = new Thread(new Secuencia('C', 3, palabra));
        a.start();
        b.start();
        c.start();
        
        
    }
}
