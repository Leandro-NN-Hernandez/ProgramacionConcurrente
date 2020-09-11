/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriaSynchronized;

/**
 *
 * @author Leandro Hernandez
 */
public class Test {

    public static void main(String[] args) {

        Dato cuenta = new Dato();
        PingPong t1 = new PingPong("PING", (int) (Math.random() * 2300), cuenta);
        PingPong t2 = new PingPong("PONG", (int) (Math.random() * 2000), cuenta);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
        }
        System.out.println(Thread.currentThread() + " chau-chau.adios");
        System.out.println(" dato " + cuenta.obtenerValor());

    }
}
