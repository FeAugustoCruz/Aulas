
package aula2;

public class Aulas2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30;
        /*
        Lógica de execução dos calculos aritméticos
        */
        float media = (n1 + n2)/2;
        System.out.println("A media e: " + media);
        
        /*
        Pré-incremento:
        */
        int numero = 10;
        int numero2 = 5;
        int soma = numero + ++numero2;
        System.out.printf("O valor com o pre-incremento: %d\n", soma);//16
        
        /*
        Pós-incremento:
        */
        int numero3 = 10;
        int numero4 = 5;
        int soma2 = numero3 + numero4++ ;
        System.out.printf("O valor com o pos-incremento: %d\n", soma2);//15
        /*
        Pré-decremento:
        */
        int numero5 = 7;
        int numero6 = 1;
        int soma3 = numero5 + --numero6;
        System.out.printf("O valor com o pre decremento: %d\n", soma3);//7
        
        /*
        Pós-decremento:
        */
        int numero7 = 5;
        int numero8 = 2;
        int soma4 = numero7 + numero8--;
        System.out.printf("O valor com o pos decremento: %d\n", soma4);//7
        
        /*
        Operadores de atribuição: 
        */
        int a = 10;
        a += 2;//-> incremento 2 a 'a' (a = a + 2)
        System.out.printf("O valor de 'a' agora e: %d\n", a);//12
        
        int b = 5;
        b *= 5;//-> multiplicando 5 por 'a' (b = b * 5)
        System.out.printf("O valor de 'b' agora e: %d\n", b);//25
        
        float c = 7f;
        c /= 2;// -> dividindo 7 por 'c' (c = c/2)
        System.out.printf("O valor de 'c' agora e: %.2f\n", c);//3.50
        
        int d = 50;
        d %= 2;// -> o resto da divisao de 50 por 2 (d = d % 2) 
        System.out.printf("O valor de 'd' agora e: %d\n", d);//0
        
        
        /*
        Biblioteca Math:
        */
        float y = 7.499999f;
        /*
        Obtendo o valor absoluto EX |-4| = 4 ou |4| = 4
        */
        System.out.printf("O valor e: %d\n", Math.round(y));
        /*
        Obtendo o valor arredondado para baixo (truncamento) EX (1,000..1 <-> 1,999...9) = 1:
        */
        System.out.printf("O valor e: %d\n", (int) Math.floor(y));
        /*
        Obtendo o valor arredondado para cima EX (1,000...1 <-> 1,999...9) = 2
        */
        System.out.printf("O valor e: %d\n", (int) Math.ceil(y));
        /*
        Obtendo o valor arredondado ariméticamente EX (4,50 <= x < 4,999...9) = 5
                                                      (4,000...1 <= x < 4,50) = 4
        */
        System.out.printf("O valor e: %d\n", Math.round(y));
        
        
        /*
        Math.random();
        */
        double aleatorio = Math.random();
        int n = (int) (5 + aleatorio * (10-5));//-> valor aleatório entre 5 - 10
        int m = (int) (4 + aleatorio * (20-4));
        System.out.printf("O valor aleatorio e: %d\n", n);
        System.out.printf("O valor aleatorio e: %d\n", m);
    }
}
