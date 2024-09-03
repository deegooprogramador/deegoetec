/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imovel;

/**
 *
 * @author Admin
 */
class Velho extends Imovel {
    private double desconto;

    public Velho(double valorBase, double desconto) {
        super(valorBase);
        this.desconto = desconto;
    }

    public double getValorFinal() {
        return super.getValorFinal() - desconto;
    }

    public void imprimeTipo() {
        System.out.println("Imóvel Velho. Valor: R$" + getValorFinal());
    }
}
