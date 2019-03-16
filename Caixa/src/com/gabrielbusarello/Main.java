package com.gabrielbusarello;

import java.util.Scanner;

public class Main {

    public static ContaCorrente cc = new ContaCorrente();

    public static void main(String[] args) {
        EfetuaCadastroLogin();
    }

    private static void EfetuaManutencaoCC(String cpf) {
        Scanner sc = new Scanner(System.in);

        int Opcao;

        boolean RetornoCC = false;

        while (true) {
            Opcao = 0;

            System.out.println("# -       Banco GR Solutions   - #");
            System.out.println("# ------------ MENU ------------ #");
            System.out.println("# 1 - Consultar saldo            #");
            System.out.println("# 2 - Sacar                      #");
            System.out.println("# 3 - Depositar                  #");
            System.out.println("# 4 - Transferencia              #");
            System.out.println("# ------------ MENU ------------ #");
            System.out.println("# 5 - Sair                       #");
            System.out.println("# ------------ MENU ------------ #");

            System.out.print("# Informe a opção escolhida: ");

            while (Opcao != 1 && Opcao != 2 && Opcao != 3 && Opcao != 4 && Opcao != 5) {
                Opcao = sc.nextInt();
            }

            if (Opcao == 1) {
                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.println("# - Saldo atual: " + cc.RetornaSaldo(cpf));

                try {Thread.sleep(5000);} catch (Exception e) {e.printStackTrace();}

                for (int i = 0; i < 100; i++) {System.out.println("");}
            } else if (Opcao == 2) {
                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.print("# - Informe o valor a ser sacado: ");

                RetornoCC = cc.ReduzSaldo(cpf, sc.nextDouble());

                for (int i = 0; i < 100; i++) {System.out.println("");}

                if (RetornoCC) {
                    System.out.println("# - Valor sacado com sucesso! - #");
                } else {
                    System.out.println("# - Falha ao sacar o valor! Saldo indisponível! - #");
                }

                try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                for (int i = 0; i < 100; i++) {System.out.println("");}
            } else if (Opcao == 3) {
                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.print("# - Informe o valor a ser depositado: ");

                cc.SomaSaldo(cpf, sc.nextDouble());

                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.println("# - Valor depositado com sucesso! - #");

                try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                for (int i = 0; i < 100; i++) {System.out.println("");}
            } else if(Opcao == 4) {
                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.print("# - Informe o valor a ser transferido: ");
                double valor = sc.nextDouble();

                System.out.print("# - Informe o cpf destino: ");

                RetornoCC = cc.TranfereSaldo(cpf, valor, sc.next());

                for (int i = 0; i < 100; i++) {System.out.println("");}

                if (RetornoCC) {
                    System.out.println("# - Valor transferido com sucesso! - #");
                } else {
                    System.out.println("# - Falha ao trasferir o valor! Saldo indisponível ou conta destino inexistente! - #");
                }

                try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                for (int i = 0; i < 100; i++) {System.out.println("");}
            } else {
                for (int i = 0; i < 100; i++) {System.out.println("");}

                EfetuaCadastroLogin();
            }
        }
    }

    private static void EfetuaCadastroLogin() {
        Scanner sc = new Scanner(System.in);

        int Opcao = 0;

        String cpf, senha = "";

        boolean RetornoCC = false;

        while (true) {
            RetornoCC = false;

            Opcao = 0;

            System.out.println("# -       Banco GR Solutions   - #");
            System.out.println("# ------------ MENU ------------ #");
            System.out.println("# 1 - Criação de conta corrente  #");
            System.out.println("# 2 - Entrar na conta corrente   #");
            System.out.println("# ------------ MENU ------------ #");
            System.out.print("# Informe a opção escolhida: ");

            while (Opcao != 1 && Opcao != 2) {
                Opcao = sc.nextInt();
            }

            for (int i = 0; i < 100; i++) {System.out.println("");}

            if (Opcao == 1) {
                System.out.println("# ------ Criação de conta ------ #");
                System.out.print("# Informe seu CPF: ");

                cpf = sc.next();

                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.println("# ------ Criação de conta ------ #");
                System.out.print("# Informe sua senha: ");

                senha = sc.next();

                for (int i = 0; i < 100; i++) {System.out.println("");}

                RetornoCC = cc.CriaContaCorrente(cpf, senha);

                if (RetornoCC) {
                    System.out.println("# - Conta corrente criada com sucesso - #");

                    try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                    for (int i = 0; i < 100; i++) {System.out.println("");}
                } else {
                    System.out.println("# - Falha ao criar conta corrente, tente novamente mais tarde - #");

                    try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                    for (int i = 0; i < 100; i++) {System.out.println("");}
                }
            } else {
                System.out.println("# ------ Entre em sua conta ------ #");
                System.out.print("# Informe seu CPF: ");

                cpf = sc.next();

                for (int i = 0; i < 100; i++) {System.out.println("");}

                System.out.println("# ------ Entre em sua conta ------ #");

                System.out.print("# Informe sua senha: ");

                senha = sc.next();

                for (int i = 0; i < 100; i++) {System.out.println("");}

                RetornoCC = cc.EfetuaLogin(cpf, senha);

                if (RetornoCC) {
                    System.out.println("# - Conectado em sua conta corrente com sucesso - #");

                    try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                    for (int i = 0; i < 100; i++) {System.out.println("");}

                    EfetuaManutencaoCC(cpf);
                } else {
                    System.out.println("# - Falha ao entrar na conta corrente, tente novamente mais tarde - #");

                    try {Thread.sleep(3000);} catch (Exception e) {e.printStackTrace();}

                    for (int i = 0; i < 100; i++) {System.out.println("");}
                }
            }
        }
    }
}
