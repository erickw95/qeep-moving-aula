package br.com.qm.aula06.carro;

public class Principal {
    public static void main(String[] args) {

        Carro gol = new Carro("Gol", 1200, "Volkswagen", "Preto", 50000);
        Carro polo = new Carro("Polo", 1350, "Volkswagen", "Prata", 70000);

        System.out.printf("\nA cor do %s é %s\n", gol.nome, gol.cor);
        System.out.printf("A cor do %s é %s\n", polo.nome, polo.cor);

        gol.pintar("Azul");
        polo.pintar("Vermelho");

        System.out.printf("\nA cor do %s é %s\n", gol.nome, gol.cor);
        System.out.printf("A cor do %s é %s\n", polo.nome, polo.cor);

        System.out.println("\n---------------\n");

        System.out.printf("\nO valor do %s é %.2f\n", gol.nome, gol.valor);
        System.out.printf("O Valor do %s é %.2f\n", polo.nome, polo.valor);

        gol.darDesconto(15);
        polo.darDescontoGerente(15);

        System.out.printf("\nO valor do %s é %.2f\n", gol.nome, gol.valor);
        System.out.printf("O Valor do %s é %.2f\n", polo.nome, polo.valor);
    }
}
