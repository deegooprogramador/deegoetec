/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author debor
 */
class CarroEletrico extends Carro{
    protected int capacidadeBateria;
    
    public CarroEletrico(String marca, String modelo, int ano, int capacidadeBateria){
        super(marca, modelo, ano, "eletricidade");
        this.capacidadeBateria = capacidadeBateria; 
    }
    
    public String carregarBateria(){
        return "O carro " + marca + " " + modelo + " está carregando";
    }
    
    public String acelerar(){
        return "O carro " + marca + " " + modelo + " está acelerando silenciosamente.";
    }
    
    public String frear(){
        return "O carro " + marca + " " + modelo + " está freando bem devagarzinho.";
    }
    
}
