/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Fernando
 */
public class DataComFabrica {
    private byte dia, mes;//-> 0000 0000
    private short ano;
    
    public DataComFabrica(byte dia, byte mes, short ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public static DataComFabrica natal(short ano){
        return new DataComFabrica((byte)25, (byte)12, ano);
    }
    
    public static DataComFabrica primeiroDeAbril(short ano){
        return new DataComFabrica((byte)1, (byte)4, ano);
    }
    
    public static DataComFabrica primeiroMes(byte dia, short ano){
        return new DataComFabrica(dia, (byte)1, (short)ano);
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/";
    }
    
    
    public static void main(String[] args) {
        DataComFabrica data = DataComFabrica.natal((short)2014);
        DataComFabrica data1abril = DataComFabrica.primeiroDeAbril((short)2017);
        DataComFabrica data1mes = DataComFabrica.primeiroMes((byte)12, (short)2018);
        
        
        data1mes.toString();
    }
}
