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
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;

public class TesteColecoes {
    public static void main(String[] args) {
        ArrayList<Integer> col1 = new ArrayList<>();// Repete os elementos
        TreeSet<Integer> col2 = new TreeSet<>();// Não repete os elementos onde cada elemento já é ordenado
        HashSet <Integer> col3 = new HashSet<>();//Não repete os elementos onde cada elemento já é ordenado
        
        col1.add(10);
        col1.add(-2);
        col1.add(100);
        
        //Esse remove vai remover o elemento na posição 2
        col1.remove(2);
        //Esse remove vai remover a primeira ocorrecia do objeto 2
        col1.remove(2);
        
        
        //Uma outra bordagem para remover 
        /*while(col1.contains(2)){
            col1.remove(new Integer(2));
        }*/
        
        //Carregando O TreeSet
        col2.add(4);
        col2.add(11);
        col2.add(40);
        col2.add(4);
        System.out.println(col2);
        
        //Vai ordenar o ArrayList, do menor para o manor, e altera o arraylist para a forma ordenada
        //OBS: sort NÃO consegue ordenar TREESET nem HASHSET pois eles ja se alto
        //ordenam!!
        Collections.sort(col1);
        
        //Vai mostrar o Arraylist ordenado
        System.out.println(col2);
        
        
        
        //HashSet -> não é possivel imprimir os objetos do HashSet diretamente
        //logo, devemos utilizar o interator()
        col3.add(122);
        col3.add(10);
        col3.add(-12);
        col3.add(2);
        
        //Fazendo um for each para iterar o Hashset
        for(Integer numero: col3){
            System.out.println(numero);
        }
        
        //Fazendo um intereitor para varrer o HashSet
        Iterator<Integer> meuIt = col3.iterator();
        
        while(meuIt.hasNext()){
            //o método next retorna entrega o valor atual e apos fazer isso ela
            //passa para o priximo elemento, assim qualquer método aplicado a meuIt
            //será em cima do próximo elemento 
            int temp = meuIt.next();
            System.out.println(temp);
            if(temp == 2){
                //remove o elemento 2, pois o next() não irá passar o valor;
                meuIt.remove();
            }
        }
        
        meuIt = col3.iterator();
        
        
        while(meuIt.hasNext()){
            int temp = meuIt.next();
            System.out.println(temp);
            if(temp == 4){
                meuIt.remove();
            }
        }
        
        
        
        
        
        
        
        
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
