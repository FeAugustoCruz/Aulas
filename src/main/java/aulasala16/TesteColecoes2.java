/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala16;

/**
 *
 * @author Fernando
 */

import java.util.ArrayList;

public class TesteColecoes2 {
    public static void main(String[] args) {
        ArrayList<Integer> col4 = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Pessoa("Bruno", 14));
        pessoas.add(new Pessoa("Átila", 30));
        pessoas.add(new Pessoa("Fernando", 12));
        
        System.out.println(pessoas);
        
        //Como ordenar uma classe??
        //Collections.sort(pessoas);
    }
}
