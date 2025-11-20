/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista04ex01;

/**
 *
 * @author Fernando
 */
public class Principal {
    public static void main(String[] args) {
        Conectavel[] conectaveis = new Conectavel[3];
        
        conectaveis[0] = new Impressora();
        conectaveis[1] = new Scanner();
        conectaveis[2] = new Webcam();
        
        for(int i = 0; i < conectaveis.length; i++){
            conectaveis[i].conectar();
        }
    }
}
