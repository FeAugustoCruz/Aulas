/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Aluno extends Pessoa{
    protected int matricula;
    
    public Aluno(int matricula, String nome, int idade){
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno(2024200124, "Fernando", 21);
        aluno.exibirDados();
        System.out.println(aluno.getMatricula());
    }
}
