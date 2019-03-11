package com.gabrielbusarello;

import java.util.Random;

public class DadoLetra extends Dado {
    int numeroLados = 0;

    public DadoLetra(int numeroLados) {
        super(numeroLados);
        this.numeroLados = numeroLados;
    }

    public String geraResultado() {
        Random ra = new Random();

        int inteiro = ra.nextInt(numeroLados);

        return String.format("%c", (33 + inteiro));
    }
}
