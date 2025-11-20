/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista04ex01;

/**
 *
 * @author Fernando
 */
public class Scanner implements Conectavel {
    @Override
    public void conectar(){
        System.out.println("Scanner conectado!");
    }
    
    @Override
    public void desconectar(){
        System.out.println("Scanner desconectado!");
    }
}
