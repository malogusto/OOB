/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class linecount {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int line = nc.nextInt();
        for (int i = 1; i <= line; i++){
            if(i%5==0){
                System.out.print("/");
            }
            else{
                System.out.print("|");
            }
        }
    }
}
