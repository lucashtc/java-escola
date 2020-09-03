/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacio.aula1;

/**
 *
 * @author Larissa
 */
public class exemplo07 {
    public static void main(String[] args){
        int[] numeros = {5,5,10,10};
        int soma = 0;
        for(int i = 0; i< numeros.length; i++){
            soma += numeros[i];
        }
        System.out.printf("Soma é %d",soma);
    }
    
}
