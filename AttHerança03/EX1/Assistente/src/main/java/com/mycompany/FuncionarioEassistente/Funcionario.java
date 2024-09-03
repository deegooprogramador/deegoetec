/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
class Funcionario {
    protected String nome;
    protected int matricula;
    
    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
    }
    
}
