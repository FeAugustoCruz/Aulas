/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Ponto2D {
    private double x;
    private double y;
    
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public static double distancia(Ponto2D ponto1, Ponto2D ponto2){
        return Math.sqrt(Math.pow((ponto1.x - ponto2.x), 2) + Math.pow((ponto1.y - ponto2.y), 2));
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}
