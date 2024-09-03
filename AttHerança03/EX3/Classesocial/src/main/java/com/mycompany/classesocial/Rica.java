/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesocial;

/**
 *
 * @author Admin
 */
public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void gastarDinheiro() {
        if (dinheiro > 0) {
            System.out.println(nome + " está gastando muito dinheiro.");
            dinheiro -= 20000; 
            System.out.println("Dinheiro restante: " + dinheiro);
        } else {
            System.out.println(nome + " não tem mais dinheiro para gastar.");
        }
    }
}
