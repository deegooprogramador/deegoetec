/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesocial;

/**
 *
 * @author Admin
 */
class Pobre extends Pessoa {
     public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando para ficar rico.");
    }
}
