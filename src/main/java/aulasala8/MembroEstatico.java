/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala8;

/**
 *
 * @author Fernando
 */
public class MembroEstatico {
    public static int cont = 0;//Variável que não depende de instancialização para poder ser acessado!
    
    public static void setCont(int cont){//Método da classe que pertence a classe e não as instâncias pois ele é estático
        MembroEstatico.cont = cont;
    } 
    
    public static int getCont(){//Método da classe que pertence a classe e não as instâncias pois ele é estático!
        return MembroEstatico.cont;
    }
    
    public void imprimeCont(){
        System.out.println(cont);
    }
}
