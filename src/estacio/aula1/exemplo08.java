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
public class exemplo08 {
    public static void main(String[] args){
        int soma = 0;
        Scanner digitado = new Scanner(System.in);
        int valor;
        
        do{
            System.out.println("Digite um numero para somar (0 para sair)");
            valor = digitado.nextInt();
            soma += valor;
        }while(valor != 0);
        System.out.printf("Soma do valores digitados é: %d ",soma);
    }
}
