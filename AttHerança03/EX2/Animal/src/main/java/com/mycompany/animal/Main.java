/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Davi");
        Gato gato = new Gato("Diego");

        System.out.println("Ações do Cachorro:");
        cachorro.latir();
        cachorro.caminhar();

        System.out.println("Ações do Gato:");
        gato.miar();
        gato.caminhar();
    }
}
