/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        AssistenteAdministrativo assistente = new AssistenteAdministrativo("Yasmim", 1214);
        Tecnico tecnico = new Tecnico("Diego Santista", 1212);

        System.out.println("Dados do Assistente Administrativo:");
        assistente.imprimirDados();

        System.out.println("Dados do Técnico:");
        tecnico.imprimirDados();
    }
}
