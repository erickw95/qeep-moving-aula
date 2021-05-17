package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número real: ");
        float realLido = sc.nextFloat();

        System.out.printf("O número lido foi %.2f", realLido);
    }
}
