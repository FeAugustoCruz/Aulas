/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala18;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;
import java.util.Collections;
public class Pessoa {
    private String nome;
    private int idade;
    
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + " Idade: " + idade;
     }
    
    public static void main(String[] args){
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Felipe", 21));
        pessoas.add(new Pessoa("Augusto", 7));
        pessoas.add(new Pessoa("Pedro", 32));
        pessoas.add(new Pessoa("Julio", 65));
        pessoas.add(new Pessoa("Miguel", 79));
                
        Collections.sort(pessoas, new ComparaPessoaNome());
        
        System.out.println(pessoas);
        
        //-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-
        
        
        Collections.sort(pessoas, new ComparaPessoaIdade());
        
        System.out.println(pessoas);
        
        //-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                
        Collections.sort(pessoas, new ComparaPessoaNomeIdade());
        
        System.out.println(pessoas);
        
    }
}
