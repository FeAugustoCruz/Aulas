/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala18;

/**
 *
 * @author Fernando
 */
import java.util.Comparator;
public class ComparaPessoaNome implements Comparator<Pessoa>{
    
    @Override
    public int compare(Pessoa p1, Pessoa p2){
        return p1.getNome().compareTo(p2.getNome());
    }
}
