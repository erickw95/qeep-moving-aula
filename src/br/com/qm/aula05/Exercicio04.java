package br.com.qm.aula05;

public class Exercicio04 {

    // Faça uma função que receba
    // a altura e o raio de um cilindro circular e retorne o volume do cilindro.

    static final double PI = 3.14;

    public static double funcVolumeCilindro(int paramRaio, int paramAltura){
        double volume = PI*(paramRaio*paramRaio)*paramAltura;
        return volume;
    }

    public static void main(String[] args) {
        System.out.println(funcVolumeCilindro(2,6));
    }
}
