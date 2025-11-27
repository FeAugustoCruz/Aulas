/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;

/**
 *
 * @author Fernando
 */
//Classe genérica que descreve um atributo de tipo variável
import java.util.ArrayList;
public class Dado<E>{
    private E dado;
    
    public Dado(E dado){
        this.dado = dado;
    }
    
    public E getDado(){
        return dado;
    }

    
    public static void main(String[] args) {
        Dado<String> dado = new Dado("Teste");
        
        Dado<Integer> dado2 = new Dado(10);
        
        Dado<Pessoa> dado3 = new Dado(new Pessoa("Fernando", 21));//Criando um dado do tipo pessoa 
        
        System.out.println(dado.getDado() + ", " + dado2.getDado());
        System.out.println("Nome: " + dado3.getDado().getNome());
        System.out.println("Idade: " + dado3.getDado().getIdade());
        
        ArrayList<Dado> colecaoDados = new ArrayList<>();//Usando a classe de Collection para imbutir um Dado
        colecaoDados.add(dado);
        colecaoDados.add(dado2);
        colecaoDados.add(dado3);
        
        
        Dado<Integer>[] vetorDado = new Dado[5];
        vetorDado[0] = new Dado<>(6);
        vetorDado[1] = new Dado<>(4);
        vetorDado[2] = new Dado<>(1);
        vetorDado[3] = new Dado<>(89);
        vetorDado[4] = new Dado<>(2);
        //Dado[] dados = new Dado();
        for(int t = 0; t < 5; t ++){
            vetorDado[t].getDado();
        }
        Dado<String>[] vetorDado2 = new Dado[5];
        vetorDado2[0] = new Dado<>("Fernando");
        
        
    }   
}
//OBS: Naõ pe possivel uma clase generica ter um meodo generico! se uma classe generica defini um metodo generico esta deve ser constant