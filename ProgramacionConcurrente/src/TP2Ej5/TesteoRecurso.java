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
public class TesteoRecurso {

     public​​ static​​ void main(String[] args) {
        //Se crea el Hilo juan con una clase que implementa runnable, y se le pone nombre
        Thread juan =  new​ Thread(new Cliente());
        juan.setName("Juan Lopez");
        //Se crea el Hilo ines con una clase que implementa runnable, y se le pone nombre
        Thread ines =  new​ Thread(new Cliente());
        ines.setName("Ines Garcia");
        //Se inician ambos hilos
        juan.start();
        ines.start();
    }

}
