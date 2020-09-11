/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3Ej2;

/**
 *
 * @author Leandro Hernandez
 */
public class ContadorVida {

    private int vida = 10;

    public ContadorVida() {
    }

    public int getVida() {
        return vida;
    }

    public void modificarVida(int mod) {
        vida = vida - mod;
    }
}
