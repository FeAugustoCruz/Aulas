/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Quadrado extends Figura{
    private double lado;
    
    public Quadrado(double lado){
        //super();
        this.lado = lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
}
