/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala3;

/**
 *
 * @author Fernando
 */
public class Sala {
    public static void main(String[] args) {
        //Questão 4)
        aulasala3.Quadro quadro = new aulasala3.Quadro(); 
        //ligação entre classes!
   
        //Questão 4.1)
        aulasala3.Quadro quadro2[] = new aulasala3.Quadro[3];
        
        // Se quiser instanciar os objetos dentro do vetor:
        for (int i = 0; i < quadro2.length; i++) {
            quadro2[i] = new aulasala3.Quadro();
        //preenchendo um vetor com objetos "Quadros"
        }
    }
}
