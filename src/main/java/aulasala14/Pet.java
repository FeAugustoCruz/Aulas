/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala14;

/**
 *
 * @author Fernando
 */
//Uma unterface é uma forma memos formal de contrto de implementação!. Isso é são usadas para expecificar certos comportamentos de certas cãsses que outra não devem execultatr
//Supondo que Animal |comer()|vaguear()|... ~~ Felino() -> Animal() ~~ Leao() -> Felino() 
//Gato() -> Felino() && Gato() -~> Pet()(Interface)
//Cao() -> Felino() && Cao() -~> Pet()(interface)
//Nesse caso, gato herda caracteristicas de felino e implementa metódos de interface. Algo que Leao() não faz.
/////Interfaces podem ser passadas como variaveis
//Metodos são quase sempre abstrtos 
//classes que herdam uma interface geralmente implementam suas métodos 
//Interfaces ocultam o que um animal faz, deixando apenas o metodo brincar(), não visualizando os metodos comer(), vaguear() ...
public class Pet {
    public static void main(String[] args) {
        
        
        Pet p1 = new Gato();
        //Nesse caso temos que uma variavel de reeferencia sendo tratada como Pet porem com valor de Gatos(),
        //Nesse caso, a unicas coisas que pi pode fazer são as definidas em Pet não em Animais();
        
        
        Pet[] pets = new Pet[4];
        
        pets[0] = new Gato();
        pets[1] = new Cao();
        pets[2] = new RoboDog();
        pets[3] = new AlienBrincalhao();
        pets[4] = new Guerreiro();
        
        for (Pet p: pets){
            p.brincar();
        }
        //Observe que estamos inicioando objetos no vetor de pets de varios tipos, porem todos eles visualizam apenas o que o Pet execulta.
    }
}
