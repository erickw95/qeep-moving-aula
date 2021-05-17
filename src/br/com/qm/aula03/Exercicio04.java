package br.com.qm.aula03;

public class Exercicio04 {
    public static void main(String[] args) {
        int ct = 0, soma = 0, numero = 1;

        while (ct < 50){
            if(numero % 2 != 0){
                soma += numero;
                ct++;
            }
            numero++;
        }
        System.out.println("Soma dos 50 primeiros números ímpares: "+soma);
    }
}
