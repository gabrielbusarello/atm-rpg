package com.gabrielbusarello;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroLados = 0;
        int numeroDados = 0;
        String tipoDado = "";
        int numeroModificador = 0;
        ArrayList<String> resultados = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao rolador de dados TC130");
        System.out.println("Quantos dados deseja rolar?");
        numeroDados = scanner.nextInt();
        for(int i = 0; i < numeroDados; i++) {
            System.out.println("Para o dado " + (i + 1) + ", quantos lados ele terá?");
            numeroLados = scanner.nextInt();
            System.out.println("Para o dado " + (i + 1) + ", será com letras (L) ou números (N)?");
            tipoDado = scanner.next();
            if (tipoDado.equals("N")) {
                System.out.println("Para o dado " + (i + 1) + ", qual o número de modificadores?");
                numeroModificador = scanner.nextInt();
                DadoNumero dado = new DadoNumero(numeroLados, numeroModificador);
                resultados.add(String.valueOf(dado.geraResultado()));
            } else {
                DadoLetra dado = new DadoLetra(numeroLados);
                resultados.add(dado.geraResultado());
            }
        }
        System.out.println("Rolando os dados... Reze para não ser uma falha crítica haha");

        for (int i = 0; i < resultados.size(); i++) {
            System.out.println("O resultado do dado " + (i + 1) + " é: " + resultados.get(i));
        }
    }
}
