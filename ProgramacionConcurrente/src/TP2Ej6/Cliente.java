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
public class Cliente {

    private String nombre;
    private int[] carroCompra;

    public Cliente(String n, int[] carro) {
        this.nombre = n;
        this.carroCompra = carro;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int[] getCarroCompra() {
        return this.carroCompra;
    }
}
