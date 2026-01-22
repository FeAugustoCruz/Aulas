/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_exececoes;

/**
 *
 * @author Fernando
 */
public class ConversorNumerico {
    
    public int converter(String valor){
        //propaga o erro.
        return Integer.parseInt(valor);
    }
    
    public void processarConversao(String valor){
        try{
            int numero = converter(valor);
            System.out.println("Número convertido:" + numero);
        }catch(NumberFormatException e){
            System.out.println("Erro: valor inválido para conversão");
        }
    }
}
