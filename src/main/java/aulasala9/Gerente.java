/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala9;

/**
 *
 * @author Fernando
 */
public class Gerente extends Funcionario{
    private String setor;
    
    public Gerente(String nome, String setor){
        super(nome);    
        this.setor = setor;
    }
    
    //@Override //-> verifica se é valido a sobreescrita, para ser válida o método
    //deve ter o mesmo nome mesmos parametros mesmos tipos e mesmas definições. Nesse caso temos um método difierente o metodo definido na classe pai. Usando o @Overrride dará erro pois nçao existe uma sobreescrita
    /*public void exibirFuncionario(String nome, String setor){
        System.out.println(nome);
        System.out.println(setor);
    }*/
    
    public void exibirFuncionario(){
        System.out.println(this.nome);
        System.out.println(this.setor);
    }
    
    public static void main(String[] args) {
  
        
        Funcionario g = new Gerente("Fernando", "Sul");//Variavel g sendo tratada como Funcionario mais operadn ocomo gerente!.
 
        Gerente x = (Gerente) g;//-> Type Casting tratando a variavel x como Gerente
        
        Funcionario[] empregados = new Funcionario[10];
        
        for(int i = 0; i < empregados.length; i ++){
            empregados[i].exibirFuncionario();
        }
        /*g.exibirFuncionario();
        g.exibirFuncionario("Fernando");-> teremos um erro pois a instancia funcionario não possue exibirFuncionario(String nome) */ 
    }
}
/*

Sobrecarga -> são varias opções do mesmo método
Sobreescrita -> altera os metodos já criados

Classe da várivalvel -> Informa quais metodos a variavel pode executar
classe do objeto -> Informa qual método sera execultado

Funcionário f1 = new Funcionário();

Nesse caso Funcionário f1 -> define as capacidades operacionais nas quais a variável f1 possa fazer, mesmo que Funcionário f1 recebesse um supertipo, ela ainda execultará métodos de funcionários e apenas funconario por mais que a classe Gerente() possa fazer mais.

Funcionário f1 = new Gerente();

Observe que por exemplo a classe genérica Object pode receber qualquer tipo de classe, porem
não poderá chamar quaisquer método ou atributo. 

Object vetClasses = [];
vetClasses[0] = new Funcionário();
vetClasses[1] = new Bolas();
.
.
.

De um modo geral caso uma classes seja extends de outra como ClasseFIlho extends ClassePai, temos que qualquer instância do tipo filho ClasseFilho pode receber tanto um objeto do tipo ClasseFilho() como ClassePai(), Nesse caso:

ClasseFilho filho = ClassePai();

Temos que ClassePai() sofrerá um type casting para o tipo ClasseFilho() por readequação 
.

ClasseFilho filho = ClassePai(); -> ClasseFilho filho = new ClasseFilho(ClassePai());



*/