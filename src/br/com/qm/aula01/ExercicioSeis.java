package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe um lado do quadrado: ");
        int lado = sc.nextInt();
        System.out.printf("A área do quadrado é: %d", lado*lado);

    }
}
