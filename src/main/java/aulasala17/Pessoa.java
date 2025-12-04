/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala17;

/**
 *
 * @author Fernando
 */
//A interface comparable é uma inteface que permite a comparação entre metadados
//de uma classe, por exemplo Pessoa -> idade onde Pessoa.idade > Pessoa2.idede

//Comparble só permite uma única comparação, dessa forma se a ordenação A for igual
//a comparação será feita pela comparação B, porem essa forma é incorreta!
//O comparable só compara com uma único parâmetro.
import java.util.ArrayList;
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + "Idade: " + idade;
    }
    
    @Override
    //Observe que usando o cmparable podemos comparar por indade se a idade for igual 
    //comparar por nome
    public int compareTo(Pessoa p){
        // o método compare() do integer é capaz de comparar dois valores inteiros primitivos
        int result =  Integer.compare(idade, p.idade);
        
        if (result == 0){
            //Toda String pode se comparar com outra string, dessa forma a classse
            //string  implementa o comparable também.
            result = nome.compareTo(p.nome);
        }
        
        return result;
    }
    public static void main(String[] args) {
        //O compare compara cada caractere da string de a cordo com na table ascii
        System.out.println("ABCD".compareTo("ACCC"));
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Fernando", 21));
        pessoas.add(new Pessoa("Alan", 32));
        pessoas.add(new Pessoa("Rlan", 32));
        
        pessoas.toString();
        
    }
}
