/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Lampada {
    private boolean ligada;
    
    public Lampada(boolean estado){
        this.ligada = estado;
    }
    
    public void apagar(){
        this.ligada = false;
    }
    
    public void ligar(){
        this.ligada = true;
    }
    
    @Override
    public String toString(){
        return "Estado: " + this.ligada;
    }
    
    public static void main(String[] args) {
        Lampada lampada = new Lampada(true);
        System.out.println(lampada.toString());
    }
}
