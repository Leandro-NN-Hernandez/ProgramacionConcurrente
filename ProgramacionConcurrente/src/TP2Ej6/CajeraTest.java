/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Ej6;

/**
 *
 * @author Leandro Hernandez
 */
public class CajeraTest {

    public static void main(String[] args) {
        testCajeraRunnable();
    }

    private static void testSecuencial() {
        //Metodo de cajera implementado de manera secuencial
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});
        Cajera cajera1 = new Cajera("Cajera 1");
// Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        cajera1.procesarCompra(cliente1, initialTime);
        cajera1.procesarCompra(cliente2, initialTime);
    }

    private static void testCajeraHilo() {
        //Metodo de cajera implementado con cajera como Thread
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5,
            2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1,
            1});
        CajeraThread cajera1 = new CajeraThread("Cajera 1", cliente1);
        CajeraThread cajera2 = new CajeraThread("Cajera 2", cliente2);
        cajera1.start();
        cajera2.start();
    }

    private static void testCajeraRunnable() {
        //Metodo de cajera implementado como Runnable
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5,
            2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1,
            1});
        Thread cajera1 = new Thread(new CajeraRunnable("Cajera 1", cliente1));
        Thread cajera2 = new Thread(new CajeraRunnable("Cajera 2", cliente2));
        cajera1.start();
        cajera2.start();
    }
}
