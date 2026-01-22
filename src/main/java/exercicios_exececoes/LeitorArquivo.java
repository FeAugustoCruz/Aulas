/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_exececoes;

/**
 *
 * @author Fernando
 */
public class LeitorArquivo {
    public void ler(){
        try{
            System.out.println("Abrindo arquivo....");
            throw new RuntimeException("Erro dorane a leitura");
        }catch(RuntimeException e){
            System.out.println("Falaha ao ler o arquivo:" + e.getMessage());
        //finally sempre será executado independe se deu erro ou não
        }finally{
            System.out.println("Arquivo fechado");
        }
    }
}
