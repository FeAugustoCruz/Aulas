/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala11;

/**
 *
 * @author Fernando
 */
public class Cadeira extends Mobilia{
    private int numPerna;
    
    public Cadeira(String modelo, double preco, int numPerna){
        super(modelo, preco);//O super deve SEMPRE vir primeiro quando estmaos tratando de um construntctor de umsa subclasse pois temos que primeiro constriuir a superclasse e doispis definir a sublclasse
        this.numPerna = numPerna;
    }
    
    public void setNumPerna(int numPerna){
        this.numPerna = numPerna;
    }
    
    public int getNumPerna(){
        return this.numPerna;
    }
}
