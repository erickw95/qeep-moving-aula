package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("## SOMA DE TRÊS NÚMEROS ##");
        System.out.println("Digite três valores e eu" + "vou imprimir a soma deles :");

        System.out.println("Digite o primeiro número: ");
        int primeiroLido = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoLido = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int terceiroLido = sc.nextInt();

        int soma = primeiroLido + segundoLido + terceiroLido;
        System.out.printf("A soma dos números lidos é: %d", soma);
    }
}
