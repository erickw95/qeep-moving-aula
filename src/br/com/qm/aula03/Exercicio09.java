package br.com.qm.aula03;

import java.util.Scanner;

public class Exercicio09 {

    // Calcular fatorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para realizar o fatorial: ");
        int fatorial = sc.nextInt();
        int primeiroValorFatorial = fatorial;
        for (int i = fatorial-1; i>1; i--){
            fatorial = fatorial * i;
        }
        System.out.printf("Fatorial de %d é %d", primeiroValorFatorial, fatorial);
    }
}
