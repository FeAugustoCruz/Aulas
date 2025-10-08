/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala1;

/**
 *
 * @author Fernando
 */
public class AlunosDePosGraduacao {//-> forma utilizando o CamelCase
    //'-' private
    //'+' public
    //'~' package
    //'#' protected
    //'/' derivado (é um método que implementa um atributo)
    private String nome;// -> Variável de instância <- (variável por referência)
    private int matricula;// -> Variável de instância <- (variável de primitiva)
    private double nota1, nota2;
    
    //Inicialização de váriaveis: 
    //-> Variável de instância (recebe um valor defout)
    //-> Variável de pilha (NÃO recebe um valor defout) 
    
    //Variavel  de instância: variável criadas dentro de uma classe.
    //atributo: Primeira letra sempre minúscula (<nomeTeste>).
    //Variável de referência: ponteiro para uma classe.
    //Variável primitiva: valor binário de um dado.
    //classes: ficam dentro da memória heap. Váriaveis de referência guadam
    //um ponteiro para o objeto. Em c -> String *nome;
    //O gerenciamento de memória da heap é gerenciado de foma indireta pelo sistema
    //de gerenciamento de memória java (Gaberge Colletor).
    
    public double calcularMedia(){
        //Metodos: são funções dentro de uma classe (<andarRapido>). metpdos ficam
        //em um lugar de memória chado de stack. as funções (métodos) so vão existir
        //quando o objeto AlunoDePosGraduacao chamar o método. EX: AlunoDePosGraduacao.calcularMedia()
        double soma = nota1 + nota2;
        double media = soma/2;
        //variáveis de pilhas: variáveis criadas dentro de um método.
        //métodos são armazenados em pilhas, logo suas váriaveis serão em pilhas
        return media;
    }
}//Escopo de uma classe 
