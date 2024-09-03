package com.example.demo;

public class Jogada {
    private int x;
    private int y;
    private boolean primeiraJogada;

    public Jogada(int x, int y, boolean primeiraJogada) {
        this.x = x;
        this.y = y;
        this.primeiraJogada = primeiraJogada;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isPrimeiraJogada() {
        return primeiraJogada;
    }

    public void setPrimeiraJogada(boolean primeiraJogada) {
        this.primeiraJogada = primeiraJogada;
    }
}
