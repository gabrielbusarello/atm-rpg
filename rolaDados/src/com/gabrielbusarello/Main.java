package com.gabrielbusarello;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numeroDados = 0;
        ArrayList<Integer> numeroLados = new ArrayList<Integer>();
        ArrayList<String> tipoDado = new ArrayList<String>();
        ArrayList<Integer> numeroModificador = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao rolador de dados TC130");
        System.out.println("Quantos dados deseja rolar?");
        numeroDados = scanner.nextInt();
        for(int i = 0; i < numeroDados; i++) {
            System.out.println("Para o dado " + (i + 1) + ", quantos lados ele terá?");
            numeroLados.add(scanner.nextInt());
            System.out.println("Para o dado " + (i + 1) + ", será com letras (L) ou números (N)?");
            tipoDado.add(scanner.next());
            if (tipoDado.get(tipoDado.size() - 1).equals("N")) {
                System.out.println("Para o dado " + (i + 1) + ", qual o número de modificadores?");
                numeroModificador.add(scanner.nextInt());
            }
        }
        System.out.println("Rolando os dados... Reze para não ser uma falha crítica haha");
        System.out.println(numeroDados);
        System.out.println(numeroLados);
        System.out.println(tipoDado);
        System.out.println(numeroModificador);
    }
}
