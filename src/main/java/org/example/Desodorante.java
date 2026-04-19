package org.example;

public class Desodorante {
    private String marca;
    private int duracao; // Tipo int
    private int ml;      // Tipo int

    public Desodorante(String marca, int duracao, int ml){
        this.marca = marca;
        this.duracao = duracao;
        this.ml = ml;
    }

    public String protecao() { return marca + " garante " + duracao + "h de proteção."; }
}