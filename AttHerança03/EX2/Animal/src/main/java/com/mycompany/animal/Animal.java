/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Admin
 */
class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }
}

