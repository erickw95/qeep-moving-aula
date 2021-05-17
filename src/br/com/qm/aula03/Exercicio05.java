package br.com.qm.aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("## SOMA DOS N INTEIROS POSITIVOS ##");
        System.out.println("Digite um número inteiro: ");
        int qtdNumero = sc.nextInt();

        if(qtdNumero < 0){
            System.out.println("Quantidade inválida");
            return;
        }
        int soma = 0;
        for (int i = 1; qtdNumero >= i; i++){
            soma += i;
        }
        System.out.printf(" A soma dos %d inteiros positivos é %d", qtdNumero, soma);
    }
}
