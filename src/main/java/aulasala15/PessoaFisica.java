/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;

/**
 *
 * @author Fernando
 */
public class PessoaFisica extends Pessoa{
    private int CPF;
    
    public PessoaFisica(String nome, int idade, int CPF){
        super(nome, idade);
        this.CPF = CPF;
    }
}
