/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacio.aula1;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Larissa
 */
public class exemplo05 {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("Digite o dia da semana:");
        int d = s.nextInt();
        
        System.out.println("Digite o mês:");
        int m = s.nextInt();
        
        System.out.println("Digite o ano");
        int a = s.nextInt();
        
        GregorianCalendar calendario = new GregorianCalendar(a,m-1,d);
        switch(calendario.get(GregorianCalendar.DAY_OF_WEEK)){
            case 1:
                System.out.println("Domingo:");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Sexta dia Util");
                break;
            case 7:
                System.out.println("Sabado \\o/:");
                break;
            default:
                System.out.println("Dia invalido:");
        }
    }
    
}
