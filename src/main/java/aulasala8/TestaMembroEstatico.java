/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala8;

/**
 *
 * @author Fernando
 */
public class TestaMembroEstatico {
    public static void main(String[] args) {
        
        /*MembroEstatico a = new MembroEstatico();
        MembroEstatico b = new MembroEstatico();//Intancialização da classe (Nesse caso as variaveis e métodos estáticos são comums a ela)
        
        
        MembroEstatico.cont = -10;
        MembroEstatico.cont = 30;
        
        
        Funcionario c = new Funcionario("Fernando");
        Funcionario d = new Funcionario("Felipe");
        
        
        
        System.out.println(MembroEstatico.getCont());//Forma correta, sem instâncialização de variáveis
        System.out.println(Funcionario.cont);*/
        
        Funcionario.criaInstancia("Fernando");
        
        Funcionario funcionario = Funcionario.getInstancia();
        
        System.out.println(funcionario.getNome());
        
        //Math.pow(2,3) -> é uma classe estática por exemplo !, observe que não é necessrio instancialiar a classe math, basta alenas chama-la de forma livre, porque?. A ideia é que não é necessário instnacilizar um obljetop para calcular a pontencia entre 2 e 3,.
        
    }
}
