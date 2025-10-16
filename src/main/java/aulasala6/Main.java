package aulasala6;


/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas();
        pessoa.setIdade(10);
        pessoa.setNome("Ian");
        
        
        pessoa.exibirDados();
        
        
        /*-==-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
        
        Carro carro = new Carro("Ferrari", 2, 2017);
        Carro carro2 = new Carro("Fusca", 1, 2019);
        
        /*-=-=-=---=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-==-=-*/
        
        Produtos produto = new Produtos();
        
        produto.setNome("Maçã");
        produto.setPreco(3.99);
        
        System.out.println("Preco: " + produto.getPreco());
        System.out.println("Nome: " + produto.getNome());
    }
}