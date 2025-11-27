/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;

/**
 *
 * @author Fernando
 */
public class Dado2<T extends Pessoa>{
     private T dado;
    
    public Dado2(T dado){
        this.dado = dado;
    }
    
    public T getDado(){
        return dado;
    }
    public static void main(String[] args) {
        Dado<PessoaFisica> d1 = new Dado<>(new PessoaFisica("Fernando", 21, 12));
        Dado<PessoaJuridica> d2 = new Dado<>(new PessoaJuridica("SEI la.ltda", 21, 12));
    }
}
