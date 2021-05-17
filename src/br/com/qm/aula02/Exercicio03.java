package br.com.qm.aula02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = sc.nextInt();

        int anoDeNascimento = anoAtual - idade;
        System.out.println("Seu ano de nascimento é: " + anoDeNascimento);
    }
}
