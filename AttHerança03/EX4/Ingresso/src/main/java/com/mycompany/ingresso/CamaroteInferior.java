/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ingresso;

/**
 *
 * @author Admin
 */
class CamaroteInferior extends Vip {
     public CamaroteInferior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public void imprimeTipo() {
        System.out.println("Ingresso VIP - Camarote Inferior. Valor: R$" + getValor());
    }
}
