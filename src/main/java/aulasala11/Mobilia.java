/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala11;

/**
 *
 * @author Fernando
 */
public abstract class Mobilia {
    private String modelo;
    private double preco;
    
    public Mobilia(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
}
