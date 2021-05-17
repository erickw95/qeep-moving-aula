package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite de um número real: ");
        float real = sc.nextFloat();
        System.out.printf("A quinte parte deste número é: %f", real/5);
    }
}
