package com.gabrielbusarello;

import java.util.ArrayList;
import java.util.Random;

public class ContaCorrente {
    ArrayList<String> CPFConta = new ArrayList<String>();
    ArrayList<String> SenhaConta = new ArrayList<String>();
    ArrayList<Double> SaldoConta = new ArrayList<Double>();

    public double RetornaSaldo(String cpf) {
        for (int i = 0; i < CPFConta.size(); i++) {
            if (CPFConta.get(i).equals(cpf)){
                return SaldoConta.get(i).doubleValue();
            }
        }

        return 0;
    }

    public boolean ReduzSaldo(String cpf, double valor) {
        for (int i = 0; i < CPFConta.size(); i++) {
            if (CPFConta.get(i).equals(cpf)){
                double saldo = SaldoConta.get(i).doubleValue();

                if (saldo < valor) { return false; }

                SaldoConta.set(i, saldo - valor);

                return true;
            }
        }

        return false;
    }

    public boolean SomaSaldo(String cpf, double valor) {
        for (int i = 0; i < CPFConta.size(); i++) {
            if (CPFConta.get(i).equals(cpf)){
                double saldo = SaldoConta.get(i);

                SaldoConta.set(i, (saldo + valor));

                return true;
            }
        }

        return false;
    }

    public boolean TranfereSaldo(String cpf, double valor, String cpfDestino) {
        int foi = 0;
        for (int i = 0; i < CPFConta.size(); i++) {
            if (CPFConta.get(i).equals(cpf)){
                double saldo = SaldoConta.get(i);

                if (saldo >= valor) {
                    SaldoConta.set(i, (saldo - valor));
                    foi++;
                }
            }
            if (CPFConta.get(i).equals(cpfDestino)) {
                double saldo = SaldoConta.get(i);

                SaldoConta.set(i, (saldo + valor));

                foi++;
            }
        }

        return foi == 2;
    }

    public boolean EfetuaLogin(String cpf, String senha) {
        for (int i = 0; i < CPFConta.size(); i++) {
            if (CPFConta.get(i).equals(cpf) && SenhaConta.get(i).equals(senha)){
                return true;
            }
        }

        return false;
    }

    public boolean CriaContaCorrente(String cpf, String senha) {
        if (!ValidaExisteConta(cpf)) {
            return false;
        }

        CPFConta.add(cpf);
        SenhaConta.add(senha);
        SaldoConta.add(0.0);

        return true;
    }

    private boolean ValidaExisteConta(String cpf) {
        for (int i = 0; i < CPFConta.size(); i++) {
            if (CPFConta.get(i).equals(cpf)){
                return false;
            }
        }

        return true;
    }

}
