/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala13;

/**
 *
 * @author Fernando
 */
public class Contato {
    private String nome;
    private int telefone;
    
    public Contato(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
}
