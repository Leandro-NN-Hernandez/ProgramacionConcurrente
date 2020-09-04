/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2Ej1;

/**
 *
 * @author Leandro Hernandez
 */
public class TesteoRecurso {

     public​​ static​​ void main(String[] args) {
        //Se crea el Hilo juan, y se le pone nombre
        Cliente juan =  new​ Cliente();
        juan.setName("Juan Lopez");
        //Se crea el Hilo ines, y se le pone nombre
        Cliente ines = new Cliente();
        ines.setName("Ines Garcia");
        //Se inician ambos hilos
        juan.start();
        ines.start();
    }
}
