/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author debor
 */
 class Carro extends Veiculo{
    protected String tipodecombustivel;

    public Carro(String marca, String modelo, int ano, String tipodecombustivel) {
        super(marca, modelo, ano);
        this.tipodecombustivel = tipodecombustivel;
    }
    
    public String acelerar(){
        return "O carro " + marca + " " + modelo + ", que usa " + tipodecombustivel + " está acelerando pela extrema ZL.";
    }
    
    public String frear(){
        return "O carro " + marca + " " + modelo + ", que usa " + tipodecombustivel + " está freando pela extrema ZL.";
    }
}
