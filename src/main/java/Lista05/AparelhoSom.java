/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista05;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;

public abstract class AparelhoSom {
    
    public abstract void som();
    
    public static void main(String[] args) {
        ArrayList<AparelhoSom> aparelhos = new ArrayList<>();
        
        aparelhos.add(new Radio());
        aparelhos.add(new TocaFitas());
        aparelhos.add(new Radio());
        
        for(AparelhoSom aparelho: aparelhos){
            aparelho.som();
        }
        
        /*for(AparelhoSom aparelho: aparelhos){
            if (){
                
            }
        }*/
    }
}
