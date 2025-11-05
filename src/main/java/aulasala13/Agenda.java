/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala13;

/**
 *
 * @author Fernando
 */
public class Agenda {
    private Contato[] contatos;
    private int cont;
    
    public Agenda(int tamanho){
        contatos = new Contato[cont];
        cont = 0;
    }
    
    public void inserriContato(String nome, int telefone){
        if(cont < contatos.length){
            contatos[cont] = new Contato(nome, telefone);
            cont++;
        }
    }   
    
    public Contato pesquisaContato(String nome){
        for(int i = 0; i < cont; i ++){
            if(nome.equals(contatos[i].getNome())){
                return contatos[i];
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda(1000);
        
        agenda.inserriContato("FERNADO", 29999814);
        
    }
}
