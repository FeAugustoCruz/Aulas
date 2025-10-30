/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala11;

/**
 *
 * @author Fernando
 */
public class Sofa extends Mobilia{
    private String tipoRevestimento;
    
    public Sofa(String modelo, double preco, String tipoRevestimento){
        super(modelo, preco);
        this.tipoRevestimento = tipoRevestimento;
    }
    
    public void setTipoRevestimento(String tipoRevestimento){
        this.tipoRevestimento = tipoRevestimento;
    }
    
    public String getTipoRevestimento(){
        return this.tipoRevestimento;
    }
    
    public static void main(String[] args) {//Testando as classes
        //!!!!!Mobilia mobilia = new Mobilia("Escritorio", 300.00);!!!!//Não pode ser feito pois a classe Mobilia é absracted!!
        
        Mobilia teste = new Sofa("Sala", 500.00, "Algodão");//Pode Existir pois uma Superclasse pode referenciar uma subclasse.
        
        Sofa sofa = new Sofa("Sala", 500.00, "Algodão");//Valido e agora observe que sofa vai herdar todos métodoas da classe Mobilia.
    }
}
