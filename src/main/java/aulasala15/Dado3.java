/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;

/**
 *
 * @author Fernando
 */
import java.util.*;
public class Dado3<E extends Pessoa>{
    private E dado;
   
    public Dado3(E dado){
        this.dado = dado;
    }
    
    public void metodoTeste(List<?super PessoaJuridica> li){
        for(int i = 0; i < li.size(); i ++){
            //li[i].getCnpj();
            System.out.println("TESTE");
        }
    }
    
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        
        lista.add(new Pessoa("Fernando", 1843323));
        lista.add(new Pessoa("Teste", 434213));
        
        //Observe que estamos utilzando uma função que requisita um paramentros
        //do tipo super em relação a PessoaJuridica, tal superclasse é a própria
        //classe Pessoa()
        Dado3<Pessoa> dado = new Dado3<>(new Pessoa("Tese", 323213));
        dado.metodoTeste(lista);
    }
}
