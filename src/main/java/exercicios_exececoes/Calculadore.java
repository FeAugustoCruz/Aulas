/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_exececoes;

/**
 *
 * @author Fernando
 */
public class Calculadore {
    
    public Calculadore(){}
    
    public int dividir(int a, int b){
        try{
            int resultado = a/b;
            System.out.printf("A divisão de %d/%d = %d",a ,b, resultado);
        }catch (Exception e){
            System.out.println("Não é possível dividir por zero");
        }
        return 0;
    }
}
