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
public class CuentaBanco {

    private int balance = 50;

    public CuentaBanco() {
    }

    public  int getBalance() {
        return balance;
    }

    public  void retiroBancario(int retiro) {
        balance = balance - retiro;
    }
}
