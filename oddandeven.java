/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class oddandeven {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int odd=0,even=0;
        while (true){
            int number = nc.nextInt();
            if (number == -1){
                break;
            }
            if (number % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
    
}
