/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class ConversaoDeUnidadesDeComprimento {
    
    public static double peQuad(double metro){
        return 10.76 * metro;
    }
    
    public static double centQuad(double pequad){
        return 929 * pequad;
    }
    
    public static double acre(double milhaquad){
        return 640 + milhaquad;
    }
    
    public static double pesQuad(double acre){
        return 43560*acre;
    }
    
    public static void main(String[] args) {
        double metro = 34.12;
        double pesquadados = ConversaoDeUnidadesDeComprimento.peQuad(metro);
        System.out.println(pesquadados);
    }
}
