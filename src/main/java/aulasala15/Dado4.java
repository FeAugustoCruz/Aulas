/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;

/**
 *
 * @author Fernando
 */
public class Dado4 {
    public static <T> void printArray(T[] vetor){//Metodo generio estatico
        /*for(int i = 0; i < vetor.length; i ++){
            System.out.println("Elemento: " + i);
        }*/ //-> outra forma de printat na tela
        for(T elemento: vetor){
            System.out.println("Elemento" + elemento);
        }
    }
     
    public static void main(String[] args) {
        Integer[] numeros = {2,4,1};
        
        String[] nomes = {"Fernando", "Augusto"};
        
        printArray(numeros);
        printArray(nomes);
    }
    
}
