/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_exececoes;

/**
 *
 * @author Fernando
 */
public class ServicoPagamento {
    public ServicoPagemento(){}
    
    public void realizarPagamento(double saldo, double pagar) throws Exception{
        double total = saldo - pagar;
        if(total < 0){
                throw new RuntimeException("Saldo insuficiente");
        }
        System.out.println("Pagamento realizado com sucesso.");
    }
    
}
