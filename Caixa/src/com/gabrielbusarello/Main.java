package com.gabrielbusarello;

import java.io.File;
import java.util.Scanner;
import org.json.*;

public class Main {
    public static void main(String[] args) {
        String nomeCliente;
        Scanner scanner = new Scanner(System.in);
        String cpf;
        String senha;

        System.out.println("***********************************");
        System.out.println("*                                 *");
        System.out.println("*  Organização Bancária Tabajara  *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
        System.out.print("Informe seu CPF: ");
        cpf = scanner.next();
        System.out.print("Informe sua Senha: ");
        senha = scanner.next();
        Autenticacao autenticacao = new Autenticacao();
        nomeCliente = autenticacao.autenticaUsuario(cpf, senha);
        if(!nomeCliente.equals("")) {
            System.out.println("Olá, " + nomeCliente + "!");
            System.out.println("+---------------------------------+");
            System.out.println("|  Olá                            |");
            System.out.println("+---------------------------------+");
        }
    }
}
