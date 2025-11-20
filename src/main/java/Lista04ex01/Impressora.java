/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista04ex01;

/**
 *
 * @author Fernando
 */
public class Impressora implements Conectavel {
    
    @Override
    public void conectar(){
        System.out.println("Impressora conectada!");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Impressora desconectada!");
    }
}
