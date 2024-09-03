/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imovel;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para Imóvel Novo ou 2 para Imóvel Velho:");
        int tipoImovel = scanner.nextInt();

        if (tipoImovel == 1) {
            Novo imovelNovo = new Novo(300000, 50000);
            imovelNovo.imprimeTipo();
        } else if (tipoImovel == 2) {
            Velho imovelVelho = new Velho(300000, 30000);
            imovelVelho.imprimeTipo();
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
