/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Admin
 */
class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.println(nome + " está miando: Miau!");
    }
}
