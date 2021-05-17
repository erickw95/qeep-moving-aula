package br.com.qm.aula03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 0; i<10; i++){
            valor = sc.nextInt();
            if (valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
        }

        System.out.printf("O maior valor foi: %d\n" +
                "O menor valor foi: %d\n", maior, menor);
    }
}
