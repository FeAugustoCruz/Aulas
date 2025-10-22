/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala7;

/**
 *
 * @author Fernando
 */
public class Pessoa {
    protected String nome;
    
    public Pessoa(String nome){
        super();// -> clamando a classe object (nesse caso nula, pois se trata de um contructor de uma class-objected (comum a todoas as classes)
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
