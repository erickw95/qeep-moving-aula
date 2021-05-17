package br.com.qm.aula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float valorProd = sc.nextFloat();
        float valorProdDesconto = valorProd - (float) (valorProd * 0.12);
        System.out.println("O valor deste produto com desconto é: "+valorProdDesconto);

    }
}
