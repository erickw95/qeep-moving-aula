package br.com.qm.aula05;

import java.util.Scanner;

public class Exercicio05 {

    static final double PI = 3.14;

    // 1. Função para calcular o dobro
    public static int funcValor(int paramValor){
        int variavelInternaValor = paramValor*2;
        return variavelInternaValor;
    }

    // 2. Função hora, minuto, segundo para segundos
    public static int funcConverteSegundos(int paramHoras, int paramMinutos, int paramSegundos){
        int localHoras = paramHoras, localMinutos = paramMinutos, localSegundos = paramSegundos;
        localHoras = localHoras*3600;
        localMinutos = localMinutos*60;

        return localHoras + localMinutos + localSegundos;
    }

    // 3. Função temperatura Celcius para Fahrenheit
    public static float funcCelsiusToFahrenheit(float paramCelcius){
        float localFahrenheit = (paramCelcius*9/5) + 32;
        return localFahrenheit;
    }

    // 4. Função volume do cilindro
    public static double funcVolumeCilindro(int paramRaio, int paramAltura){
        double volume = PI*(paramRaio*paramRaio)*paramAltura;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1, variavelParametro;

        while(op!=0){
            System.out.println("\n\n+------------------------------------------------------------+");
            System.out.println("|      Menu de Opções                                        |");
            System.out.println("+------------------------------------------------------------+");
            System.out.println("| 01 - Calcular o dobro                                      |");
            System.out.println("| 02 - Transforma hora, minuto, segundo para segundos        |");
            System.out.println("| 03 - Temperatura Celcius para Fahrenheit                   |");
            System.out.println("| 04 - Volume do cilindro                                    |");
            System.out.println("| 00 - Sair                                                  |");
            System.out.println("+------------------------------------------------------------+");

            System.out.println("Digite um número correspondente a uma opção do menu: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite um numero para ser dobrado: ");
                    variavelParametro = sc.nextInt();
                    System.out.printf("O dobro de %d é: %d \n", variavelParametro, funcValor(variavelParametro));
                case 2:
                    System.out.println("Digite hora, minuto, segundo para ser convertido em segundos: ");
                    System.out.printf("Total de segundos: %d\n", funcConverteSegundos(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                case 3:
                    System.out.println("Digite Celcius para trasformar em Fahrenheit: ");
                    System.out.println("Fahrenheit: "+funcCelsiusToFahrenheit(sc.nextFloat()));
                case 4:
                    System.out.println("Digite o raio e a altura do cilindro: ");
                    System.out.println("O Volume do cilindro é: "+funcVolumeCilindro(sc.nextInt(), sc.nextInt()));
            }
        }
        System.out.println("Sistema Finalizado!");
    }
}
