package aulasala6;


/**
 *
 * @author Fernando
 */
public class Produtos {
    private double preco;
    private String nome;
    
    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        }
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}