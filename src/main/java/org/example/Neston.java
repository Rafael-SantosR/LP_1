package org.example;

public class Neston {
    public String sabor;
    public String cor;
    public int tamanho; // Tipo int

    public Neston (String sabor, String cor, int tamanho){
        this.sabor = sabor;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String vitamina() { return "Vitamina de " + sabor + " preparada!"; }
}