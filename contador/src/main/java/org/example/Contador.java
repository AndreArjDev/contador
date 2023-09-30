package org.example;

public class Contador {
    private int inicio;
    private int fim;

    public Contador(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public void contar() {
        for(var i = this.inicio; i <= this.fim; i++ ) {
            System.out.println(i);
        }
    }
}
