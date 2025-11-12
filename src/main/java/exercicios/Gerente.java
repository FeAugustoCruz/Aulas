/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Gerente extends Funcionario{
    
    @Override
    public double calcularSalario(){
        return  1518 + (40 * horas) + ((40 * horas)* 0.2);
    }
}
