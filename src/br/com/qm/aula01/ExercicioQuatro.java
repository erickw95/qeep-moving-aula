package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número real: ");
        float i = sc.nextInt();

        System.out.printf("O quadrado desse número é: %f", i*i);
    }
}
