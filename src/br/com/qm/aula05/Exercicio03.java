package br.com.qm.aula05;

public class Exercicio03 {

    // Faça uma função que receba uma temperatura em graus Celsius
    // e retorne-a convertida em graus Fahrenheit.

    //(C × 9/5) + 32 = F

    public static float funcCelsiusToFahrenheit(float paramCelcius){
        float localFahrenheit = (paramCelcius*9/5) + 32;
        return localFahrenheit;
    }

    public static void main(String[] args) {
        System.out.println(funcCelsiusToFahrenheit(10));
    }
}
