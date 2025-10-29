/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala9;

/**
 *
 * @author Fernando
 */
public class Funcionario {
    protected String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public void exibirFuncionario(){
        System.out.println(this.nome);
    }
}
