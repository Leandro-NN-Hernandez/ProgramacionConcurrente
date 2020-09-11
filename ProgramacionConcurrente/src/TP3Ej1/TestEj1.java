/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej1;

/**
 *
 * @author Leandro Hernandez
 */
public class TestEj1 {

    public static void main(String[] args) {
        VerificarCuenta vc = new VerificarCuenta();
        Thread Luis = new Thread(vc, "Luis");
        Thread Manuel = new Thread(vc, "Manuel");
        Luis.start();
        Manuel.start();

        //Hay veces que el resultado es correcto, terminando con un saldo de 0,
        //pero la mayoria de las veces el resultado es -10, siendo un resultado 
        //erroneo
    }
}
