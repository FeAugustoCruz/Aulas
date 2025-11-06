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
        
        Quadro [][] quadro3 = new Quadro[3][3];
        
        quadro3[0] = new Quadro[3];
        quadro3[1] = new Quadro[3];
        quadro3[2] = new Quadro[3];
        
        for(int i = 0; i < quadro3.length; i ++){
            for(int j = 0; j < quadro3[0].length; j ++){
                quadro3[i][j] = new Quadro();
            }
        }
        
        // Se quiser instanciar os objetos dentro do vetor:
        for (int i = 0; i < quadro2.length; i++) {
            quadro2[i] = new aulasala3.Quadro();
        //preenchendo um vetor com objetos "Quadros"
        }
    }
}
