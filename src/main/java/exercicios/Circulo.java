/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Circulo {
    private double raio;
    private Ponto2D centro;
    
    public Circulo(Ponto2D centro, double raio){
        this.centro = centro;
        this.raio = raio;
    }
    
    public double diametro(){
        return 2*raio;
    }
    
    public double getCircunferencia(double raio){
        return 2 * Math.PI * raio;
    }
    
    public double getArea(){
        return Math.PI * raio * raio;
    }
    
    
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D(3,1);
        Ponto2D ponto2 = new Ponto2D(5,2);
        double distanciap1p2 = Ponto2D.distancia(ponto, ponto2);
        Circulo circulo = new Circulo(ponto, 3);
        System.out.println("Diametro: "+ circulo.diametro() + " Circunferencia: " + circulo.getCircunferencia(circulo.raio));
        System.out.println("Área: " + circulo.getArea());
        System.out.println("Distancia: " + distanciap1p2);
    }
}
