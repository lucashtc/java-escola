/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacio.aula1;

import java.util.Scanner;

/**
 *
 * @author Larissa
 */
public class exemplo04 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = s.nextInt();
        if(n%2==0){
               System.out.println("Número é PAR");
        }else{
            System.out.println("Número é IMPA.");
        }
        
    }
    
}
