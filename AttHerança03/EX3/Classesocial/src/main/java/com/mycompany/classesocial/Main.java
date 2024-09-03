/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesocial;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
  
        Rica pessoaRica = new Rica("Diego", 18, 1000000);
        Pobre pessoaPobre = new Pobre("Carlinhos", 18);
        Miseravel pessoaMiseravel = new Miseravel("Davi", 17);

        System.out.println("Pessoa Rica:");
        pessoaRica.exibirInformacoes();
        pessoaRica.gastarDinheiro();

        System.out.println("Pessoa Pobre:");
        pessoaPobre.exibirInformacoes();
        pessoaPobre.trabalhar();

        System.out.println("Pessoa Miseravel:");
        pessoaMiseravel.exibirInformacoes();
        pessoaMiseravel.mendigar();
    }
}
