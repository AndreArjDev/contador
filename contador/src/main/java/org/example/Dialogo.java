package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Dialogo {

    private int primeiroValor;
    private int segundoValor;
    private Scanner teclado;

    public void capturarValores(){
        teclado = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro valor:");
        this.primeiroValor = teclado.nextInt();

        System.out.println("Digite o segundo valor:");
        this.segundoValor = teclado.nextInt();
    }

    public int getPrimeiroValor() {
        return primeiroValor;
    }

    public int getSegundoValor() {
        return segundoValor;
    }
}
