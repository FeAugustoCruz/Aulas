 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */

//A classe deve ser abstrata para que um metodo seja abistrato
public abstract class Figura{
    public abstract double calcularArea();
    
    public static void main(String[] args) {
        Circul0 circulo = new Circul0(4.00);
        Quadrado quadrado = new Quadrado(10.00);
        
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Área: " + circulo.calcularArea());
    }
}
