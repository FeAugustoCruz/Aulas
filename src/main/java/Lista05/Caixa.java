/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista05;

/**
 *
 * @author Fernando
 */
public class Caixa<T>{
    private T obj;
    
    public void guardar(T obj){
        this.obj = obj;
        System.out.println("Guardei o objeto! ");
    }
    
    public T pegar(){
        return obj;
    }
    
    public static void main(String[] args) {
        
        Caixa<Integer> dado = new Caixa<>();
        Caixa<String> dado2 = new Caixa<>();
        
        
        dado.guardar(3);
        dado2.guardar("Fernando");
        
        int num = dado.pegar();
        String nome = dado2.pegar();
        
        System.out.println(num);
        System.out.println(nome);
    }
}
