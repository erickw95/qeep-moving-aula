package br.com.qm.aula05;

public class Exercicio01 {

    // Exercício 01

    // Crie uma função que recebe como parâmetro
    // um número inteiro e devolve o seu dobro.

    public static int funcValor(int paramValor){
        int variavelInternaValor = paramValor*2;
        return variavelInternaValor;
    }

    public static void main(String[] args) {
        System.out.printf("O dobro de %d é: %d", 3, funcValor(3));
    }
}
