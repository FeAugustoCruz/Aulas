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
        
    }
    
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        
        lista.add(new Pessoa("Fernando", 1843323));
        lista.add(new Pessoa("Teste", 434213));
        
        Dado<Pessoa> dado = new Dado<>(new Pessoa("Tese", 323213));
        dado.metodoTeste(lista);
    }
}
