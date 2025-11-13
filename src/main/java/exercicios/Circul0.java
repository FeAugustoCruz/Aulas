/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Circul0 extends Figura{
    private double raio;
    
    public Circul0(double raio){
        super();
        this.raio = raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    @Override
    public double calcularArea(){
        return 2 * Math.PI * raio * raio;
    }
}
