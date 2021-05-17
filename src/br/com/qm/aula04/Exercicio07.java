package br.com.qm.aula04;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetInteiros [] = new int[10];
        for (int i = 0; i<vetInteiros.length; i++){
            System.out.printf("Digite o valor para a posição %d: ", i);
            vetInteiros[i] = sc.nextInt();
        }
        int maiorElemento = Integer.MIN_VALUE;
        int posicao = Integer.MIN_VALUE;
        for (int i = 0; i<vetInteiros.length; i++){
            System.out.printf("\nVetor Posição [%d] contem %d", i, vetInteiros[i]);
            if(maiorElemento<vetInteiros[i]){
                maiorElemento = vetInteiros[i];
                posicao = i;
            }
        }
        System.out.printf("\n\n---Maior elemento---\nPosição: [%d]\nValor: %d\n", posicao, maiorElemento);
    }
}
