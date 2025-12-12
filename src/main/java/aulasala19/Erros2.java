/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulasala19;

/**
 *
 * @author Fernando
 */
public class Erros2 {
    public static void main(String[] args) {
        try{
            int[] nums = {1,3,-5};
            System.out.println(nums[3]);
        }catch(ArrayIndexOutBoundsException e){
            System.out.println("");
        }
    }
}
