package com.example.demo;

public class Jogador {
    private int pontos;
    private String nome;

    public Jogador(String nome) {
        pontos = 0;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void acumular(){
        this.pontos++;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
