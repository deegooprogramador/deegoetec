/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ingresso;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para ingresso Normal ou 2 para VIP:");
        int tipoIngresso = scanner.nextInt();

        if (tipoIngresso == 1) {
            Ingresso ingressoNormal = new Ingresso(100.0);
            ingressoNormal.imprimeTipo();
        } else if (tipoIngresso == 2) {
            System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior:");
            int tipoCamarote = scanner.nextInt();

            if (tipoCamarote == 1) {
                CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0);
                camaroteSuperior.imprimeTipo();
            } else if (tipoCamarote == 2) {
                CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 30.0);
                camaroteInferior.imprimeTipo();
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
