/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala2;

/**
 *
 * @author Fernando
 */
public class AulaSala2 {
    public class Pessoa{
        private String nome;
        private int idade;
    }
    
    public static void main(String[] args){
    int[] numeros = new int[5];
    //numeros é um ponteiros para um objeto Vector<int>(5)
    
    //numeros
    //Estamos tratando um vetor
            
    //numeros[2];
    //Estamos tratando de um valor int 
    
    //numeros.length
    //variavel publica utiizada para encontrar um valor do tamanho do vetor
    
    for(int i = 0; i < numeros.length; i ++){
        System.out.println(numeros[i]);
        //System -> classe do sistema
        //out -> variável de uma classe
        //println() método da classe system
    }
    
    
    for(int i = 0; i < numeros.length; i ++){
        numeros[i] = 10;
    }
    
    Pessoa[] pessoas = new Pessoa[5];
    //pessoas é um ponteiros para um objeto Vector<Pessoas>(5)
    
    for(int i = 0; i < pessoas.length; i ++){
        pessoas[i] = Pessoa;
    
    }
    
    //Operadores lógicos:
    int x = 10;
    int y = 10;
    
    //String nome = "Bruno";
    //String nome2 = "Bruno";
    //Nesse caso por economia de memória essas duas varáveis de referencia
    //iram apontar para o mesmo objeto [, nesse caso a comparação nome == nome2
    //será verdadeiro mas não porque as string são iguais, mas porque suas respectivas variaveis de refenrecia
    //apontam para o mesmo objeto
    
    //System.out.println(nome == nome2);
    
    
    String nome = "Bruno";
    String nome2 = "Bruno";
    
    System.out.println(nome.iguals(nome2));
    }
}
