package aulasala4;

public class Aluno{
    private String nomeDoAluno;// - nomeDoAluno
    private double nota1, nota2;// - nota1 - nota2
    //private double media = calculaMedia();// - /media double; <- aaatributo desnecessário!
            
    
    public Aluno(String nome, double nota1, double nota2){
        this.nomeDoAluno = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        //super(); -> herança de uma classe para outra
    }//Método constrictor de uma classe genérica prepara o estado de um objeto para que fique pronto para uso.
    
    
    //Sobrecarga -> quantidades de paramentros maiores ou trocar as ordem dos parâmetros
    
    public Aluno(){
    
    }
    
    //métodos de acesso
    //getters e settes

    public String getNome(){
        return nomeDoAluno;// referencia a uma variavle criada na classe (no escopo classe)
    }
        
    public void setNome(String nome){//Nesse caso se modificaarmos 'nome' estariamos alterando nome do parametro. o 'nome' do paramentro estaria sobrepondo a variavael de instancia 'nome'.
        this.nomeDoAluno = nome;//this selecionana algum atgributo da classe Aluno
    }
    
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota1(double nota1){
        if (nota1 >= 0.0 && nota1 <= 10.0){
            this.nota1 = nota1;
        }else{
            System.out.println("Valor de nota inválido!\n");
        }
    }
    
    public double getNota2(){
        return this.nota2;
    } 
   
    public void setNota2(double nota2){
        if(nota2 >= 0.0 && nota2 <= 10.0){
            this.nota2 = nota2;
        }else{
            System.out.println("Valor de nota inválido!\n");
        }
    }
    
    public double calculaMedia(){
        return (this.nota1 + this.nota2)/2;
    }
    
}

