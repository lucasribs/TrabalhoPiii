package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {

    private static Jogo jogo = null;
    //Singleton
    public static Jogo getJogo() {
        if(jogo == null)
            jogo = new Jogo();
        return jogo;
    }

    private int tabuleiro[][];
    private List<Jogador> jogadores;
    private int jogadorAtual;
    private boolean jogada1;

    private Jogo() {
        jogadorAtual = 1;
        jogada1 = true;
        tabuleiro = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = 0;
            }

        }
        jogadores = new ArrayList<Jogador>();
    }

    public boolean encerrouJogo(){
        if(diagonal()){
            return true;
        }
        //linhas
        for (int i = 0; i < 3; i++) {
            if(tabuleiro[i][0]>0) {
                if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] == tabuleiro[i][2])
                    return true;
            }
            if(tabuleiro[0][i]>0){
                if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[0][i] == tabuleiro[2][i])
                    return true;
            }
        }
        return false;
    }

    private boolean diagonal() {
        return (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0]==tabuleiro[2][2])||
                (tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[0][0]==tabuleiro[0][2]);
    }

    public String jogar(int x, int y) throws Exception {
        Jogada jogada = new Jogada(x, y, jogada1);
        if(tabuleiro[x][y] != 0)
            throw new Exception("Jah jogaram aqui");
        tabuleiro[x][y] = jogadorAtual;
        int jogadorAntigo = jogadorAtual;
        jogadorAtual = (jogadorAtual)%jogadores.size()+1;
        return jogadores.get(jogadorAntigo-1).getNome();
    }

    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(String nome){
        jogadores.add(new Jogador(nome));
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
