/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class Funcionario {
    protected double horas;
    
    public double calcularSalario(){
        return 1518 + (40 * horas);
    }
    
    public void setHoras(double horas){
        this.horas = horas;
    }
    
    public double getHoras(){
        return horas;
    }
}   
