/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala10;

/**
 *
 * @author Fernando
 */
public class B extends A{
    private int c;
    
    @Override
    public int soma(){
        return super.soma() + c;//-> Observe que super() -> retorna a super classe da referida super-classe em relação a B, ou seja B.
        //Essa forma de utilização do super é utilizada ppara simplificar o polimorfismo de métods quando temos dois metodos que devem se diferencia r mais muito pouco.
        //como por exemplo um método de soma() - referente a A que soma 'a' + 'b' e soma - redferente a B que soma 'a' + 'b' + 'c'. Observe q a diferençã é muit pouca logo podemos simplismetne fazer super.soma() + c
    }
    
    @Override
    public String toString(){
        return super.toString() + "c = " + c;
    }
}
