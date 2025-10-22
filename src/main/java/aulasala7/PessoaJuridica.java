/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala7;

/**
 *
 * @author Fernando
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    
    public PessoaJuridica(String nome, String cnpj){
        super(nome);//-> chama o construcntor de Pessoa()
        this.cnpj = cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    //Caso o nome seja privado na classe Pessoa()!
    /*public void exibeNome(){
        System.out.println(getNome());//<- você poderia usar o this.nome
    }*/
    
    //Main de teste da classe!
    public static void main(String[] args){
        PessoaJuridica pessoaj = new PessoaJuridica("Nome", "3223.23");
        
        pessoaj.setNome("Fernando");
        pessoaj.setCnpj("3653.245");
        
        //pessoaj.exibeNome();
    }
    
}
