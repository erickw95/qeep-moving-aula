package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
        int inteiro = sc.nextInt();
        System.out.printf("Número digitado: %d\nNúmero anterior: %d\nNúmero posterior: %d", inteiro, inteiro-1, inteiro+1);
    }
}
