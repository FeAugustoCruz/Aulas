package aulasala6;

/**
 *
 * @author Fernando
 */
public class Carro {
    private String marca;
    private int modelo;
    private int ano;
    
    public Carro(){
        super();//-> object class genérico 
    }
    
    public Carro(String marca, int modelo, int ano){
        //super()
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        
    }
}