package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.printf("Resultado: %d", (valor*3 + 1) + (valor*2 - 1));

    }
}
