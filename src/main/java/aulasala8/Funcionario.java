/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala8;

/**
 *
 * @author Fernando
 */
public class Funcionario {
    public String nome;
    public static int cont = 0;
    private static Funcionario instancia = null;
    
    
    public Funcionario(String nome){//Com o contructor private, podemos criar n vunciopnarios sem limitaçoes como tratar isso?
        this.nome = nome;
        Funcionario.instancia = this;//O bilder vai armazenar a sua instancia em uma variavel estática uqe ira contar se voce pode ou não criar uma outra instancia  
        //Funcionario.cont ++;//A variavel cont é stática logo ela é uma variavel da classe que pode ser alterada por qualquer onstancia e conseva seu valor
    }
    
    public static void criaInstancia(String nome){
        if(Funcionario.instancia == null){//Verificando se a instancia recebeu a referencia do objeto, se sim, não sera premitido 
            Funcionario.instancia = new Funcionario(nome);
        }
    }
    
    public static Funcionario getInstancia(){
        return Funcionario.instancia;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    //Nção estatico pode execultar nos estáticos porem o contrario não ocorre
}
