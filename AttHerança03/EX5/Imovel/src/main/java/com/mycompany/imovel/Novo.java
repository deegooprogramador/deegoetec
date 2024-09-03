/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imovel;

/**
 *
 * @author Admin
 */
class Novo extends Imovel {
    private double adicional;

    public Novo(double valorBase, double adicional) {
        super(valorBase);
        this.adicional = adicional;
    }

    public double getValorFinal() {
        return super.getValorFinal() + adicional;
    }

    public void imprimeTipo() {
        System.out.println("Imóvel Novo. Valor: R$" + getValorFinal());
    }
}
