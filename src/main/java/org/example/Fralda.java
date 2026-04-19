package org.example;

public class Fralda {
    public String marca;
    public String tamanho; // Na sua classe original era String
    public int quantidade; // Tipo int

    public Fralda(String marca, String tamanho, int quantidade) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
    }

    public String pacote() { return "Pacote " + marca + " com " + quantidade + " unidades."; }
}