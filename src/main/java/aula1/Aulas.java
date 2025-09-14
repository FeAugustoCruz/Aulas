package aula1;

//Input necessário para a entrada de dados
import java.util.Scanner;
public class Aulas {

    public static void main(String[] args) {
        /*
        Declaração normal:
        */
        int idade = 3;
        float salario = 1835.43f;
        char letra = 'A';
        boolean casada = false;
        
        /*
        Declaração (TypeCast):
        */
        int idade2 = (int) 3;
        float salario2 = (float) 1825.22;
        char letra2 = (char) 'A';
        boolean casada2 = (boolean) false;
        
        /*
        Declaração (Wrapper class):
        */
        Integer idade3 = 3;
        Float salario3 = 1242.12f;
        Character letra3 = 'A';
        Boolean casada3 = false;
        String nome = "Fernando";
        
        
        /*
        Comados de entrada:
        */
        
        float nota = 5.2f;
        String aluno = "Fulano";
        
        //'ln' -> Salto de linha apos o print
        System.out.println("Sua nota foi: " + nota);
        // Não havera salto de liha após o print
        System.out.print("Sua nota foi: ");
        //Usando um print formatado 'printf()'
        System.out.printf("A nota de %s nota é: %.2f\n", aluno, nota);
        
        /*
        Comandos para saída:
        */
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual e a sua nota?:");
        float notaAluno = entrada.nextFloat();
        entrada.nextLine();//<- Limpando o buffer
        System.out.println("Qual e o seu nome?:");
        String nomeAluno = entrada.nextLine();
        System.out.printf("A nota do %s e %.2f\n", nomeAluno, notaAluno);
        
        /*
        Convertendo uma inteiro -> string:
        */  
        int quantidadeAgua = 1000;
        String strQuantidade = Integer.toString(quantidadeAgua);
        System.out.printf("A quantidade e %s\n", strQuantidade);
        
        /*
        Convertendo uma string -> inteiro;
        */
        
        String strPeso = "300";
        int quantPeso = Integer.parseInt(strPeso);
        System.out.printf("O peso e de: %d kg\n", quantPeso);
        
        /*
        Convertendo um string -> float
        */
        
        String strLiquido = "12.23";
        float quantidadeLiquido = Float.parseFloat(strLiquido);
        System.out.printf("A quantidade de liquido no balde e %.2f", quantidadeLiquido);
    }
}
