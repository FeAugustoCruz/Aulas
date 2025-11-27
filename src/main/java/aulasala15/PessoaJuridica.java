/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;

/**
 *
 * @author Fernando
 */
public class PessoaJuridica extends Pessoa{
    private int CNPJ;
    
    public PessoaJuridica(String nome, int idade, int CNPJ){
        super(nome, idade);
        this.CNPJ = CNPJ;
    }
}
