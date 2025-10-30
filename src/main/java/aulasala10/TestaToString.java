/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala10;

/**
 *
 * @author Fernando
 */
public class TestaToString {
    private String nome;
    
    @Override
    public String toString(){
        return "TestaToString: {" + nome + "}";
    }
    
    public static void main(String[] args) {
        TestaToString teste = new TestaToString();
        
        teste.nome = "Fernando";
        
        teste.toString();//-> Decorador de como visualizar a string
    }
}
