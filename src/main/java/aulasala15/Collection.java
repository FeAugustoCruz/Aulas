/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala15;
//Collection -> é um tamplate que define metodos comuns para qualuqer collection
//ArrayList -> classe concreta que herda as caracteristicas da interface collection
//Indicar onde está a classe que você queira utilizar pode-se utilizar o import 
//List -> uma subinterface de collection que por sua vez é uma outra classe
//Object -> objetos que serão armazenados dentro de uma collection (ou seja parametros que são referencias para objetos do tipo desejado como por exemplo ArrayList [Pessoa, Pessoa, Pessoa, ..] onde *Pessoa -> apotna para pessoa
//Classes inpacotadoras -> são classes que estruturalizam um valor para ele se tornar um objeto:
//Integer x = new Integer(i); -> obbserve que o valor i esta sendo impacotado dentro da calsse int, dessa forma é possivel alimentar uma
//ArrayList com esse objeto: 
//Integer x = 10;
//List Lista = new ArrayList()
//lista.add(x);
//Temos que uma <Interface> nome = new <Classe> -> é possivel! por mas que a
//interface não possa ser instanciada. Pois estamos tratando como interface porem 
//Usandos ela em ArrayList
/**
 *
 * @author Fernando
 */

import java.util.ArrayList;
public class Collection {
    public static void main(String[] args) {
        Integer x = 10;
        //Character y = 'D';
        
        ArrayList<Integer> a;
        a = new ArrayList<>();
        a.add(x);
      //a.add(10); -> alto-empacotamento!
        
        System.out.println("Tamanho: " + a.size());
        System.out.println("Existe o 10?: " + a.contains(10));
        a.remove(10);
        System.out.println("Tamanho: " + a.size());
        System.out.println("Existe o 10?" + a.contains(10));
        //ArrayList<Character> b = new ArrayList<>();
        //b.add(y);
         
        
        //String c;
        //burno.com.String t; -> String devinida em outra classe
    }
}
