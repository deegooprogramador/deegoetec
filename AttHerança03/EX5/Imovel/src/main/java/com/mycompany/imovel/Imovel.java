/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imovel;

/**
 *
 * @author Admin
 */
class Imovel {
    private double valorBase;

    public Imovel(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorFinal() {
        return valorBase;
    }

    public void imprimeTipo() {
        System.out.println("Imóvel. Valor: R$" + getValorFinal());
    }
}
