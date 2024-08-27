/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author debor
 */
public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Hyundai", "HB20", 2018);
        Carro carro = new Carro("Lamborghini", "Uus", 2018, "Gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2022, 100);
        
        /**
         * veiculo métodos
         */
        System.out.println(veiculo.acelerar());
        System.out.println(veiculo.frear());
        /*
        carro métodos
        */
        System.out.println(carro.acelerar());
        System.out.println(carro.frear());
        /*
        carro eletrico métodos
        */
        System.out.println(carroEletrico.carregarBateria());
        System.out.println(carroEletrico.acelerar());
        System.out.println(carroEletrico.frear());
    }
}
