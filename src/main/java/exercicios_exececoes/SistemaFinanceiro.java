/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_exececoes;

/**
 *
 * @author Fernando
 */
public class SistemaFinanceiro {
    public void efeturarPagamento(){
        ServicoPagamento servico = new ServicoPagamento();
        try{
            servico.realizarPagamento(200, 130);
        }catch(RuntimeException e){
            System.out.println("Erro no sistema financeiro" + e.getMessage());
        }
    }
}
