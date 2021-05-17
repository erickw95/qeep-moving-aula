package br.com.qm.aula05;

public class Exercicio02 {

    // Faça uma função que receba 3 números inteiros como parâmetro,
    // representando horas, minutos e segundos, e os converta em segundos.

    public static int funcConverteSegundos(int paramHoras, int paramMinutos, int paramSegundos){
        int localHoras = paramHoras, localMinutos = paramMinutos, localSegundos = paramSegundos;
        localHoras = localHoras*3600;
        localMinutos = localMinutos*60;

        return localHoras + localMinutos + localSegundos;
    }

    public static void main(String[] args) {
        System.out.println(funcConverteSegundos(1,1,0));
    }
}
