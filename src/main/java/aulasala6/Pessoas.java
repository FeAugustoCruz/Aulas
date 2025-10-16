package aulasala6;


/**
 *
 * @author Fernando
 */
public class Pessoas {
    private String nome;
    private int idade;
    
    public Pessoas(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    
    public Pessoas(){}

    public void exibirDados(){//<- Remover isso e deixar na main!
        System.out.println("Idade: " + this.idade);
        System.out.println("Nome: " + this.nome);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    } 
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
}