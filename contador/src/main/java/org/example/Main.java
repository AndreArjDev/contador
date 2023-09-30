package org.example;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {


        try{
            Dialogo dialogo = new Dialogo();
            dialogo.capturarValores();
            boolean valoresOk = Validador.validar(dialogo.getPrimeiroValor(), dialogo.getSegundoValor());
            if(valoresOk){
                Contador contador = new Contador(dialogo.getPrimeiroValor(), dialogo.getSegundoValor());
                contador.contar();
            }
        }catch(InputMismatchException ie){
            System.out.println("Identificado" + ie.getMessage());
        }
    }
}