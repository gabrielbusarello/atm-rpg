package com.gabrielbusarello;

import java.util.Random;

public class DadoNumero extends Dado {
    int numeroLados = 0;
    int numeroModificador = 0;

    public DadoNumero(int numeroLados, int numeroModificador) {
        super(numeroLados);
        this.numeroLados = numeroLados;
        this.numeroModificador = numeroModificador;
    }

    public int geraResultado() {
        Random ra = new Random();

        int inteiro = ra.nextInt(numeroLados);

        return inteiro + numeroModificador;
    }


}
