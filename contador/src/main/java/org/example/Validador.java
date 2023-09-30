package org.example;

import java.util.InputMismatchException;

public class Validador {

    public static boolean validar(int inicio, int fim){
        if(fim <= inicio) {
            throw new InputMismatchException("Erro: o valor inicial deve ser menor que o final");
        }
        return true;
    }
}
