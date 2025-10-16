package aulasala4;


/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernando", 4.23, 2.21);
        
        // aluno1.setNota1(aluno1.getNota2()); // exemplo de uso
        
        System.out.println(
            "Nome: " + aluno1.getNome() +
            " | Nota1: " + aluno1.getNota1() +
            " | Nota2: " + aluno1.getNota2() +
            " | Média: " + aluno1.calculaMedia()
        );
    }
}