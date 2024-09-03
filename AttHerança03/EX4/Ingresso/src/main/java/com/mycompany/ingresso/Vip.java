/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ingresso;

/**
 *
 * @author Admin
 */
class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValor() {
        return super.getValor() + valorAdicional;
    }

    public void imprimeTipo() {
        System.out.println("Ingresso VIP. Valor: R$" + getValor());
    }
}
