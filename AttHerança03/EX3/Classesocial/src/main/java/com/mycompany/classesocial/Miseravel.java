/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesocial;

/**
 *
 * @author Admin
 */
class Miseravel extends Pessoa {
    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendigar() {
        System.out.println(nome + " está pedindo dinheiro no sinal.");
    }
}
