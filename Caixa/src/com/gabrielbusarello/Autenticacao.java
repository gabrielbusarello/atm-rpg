package com.gabrielbusarello;

public class Autenticacao {
    public static String autenticaUsuario(String cpf, String senha) {
        if (cpf.equals("09180345905") && senha.equals("Gabriel")) {
            return "Gabriel Dezan Busarello";
        }
        return "";
    }
}
