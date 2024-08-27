/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author debor
 */
class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String acelerar(){
        return "O veiculo " + marca + " " + modelo + " está acelerando pela extrema ZL.";
    }
    
    public String frear(){
        return "O veiculo " + marca + " " + modelo + " está freando pela extrema ZL.";
    }
}
