public class Tabuleiro {
    private final int N = 3;
    private int tabuleiro[][];
    private int jogadorAtual;
    public Tabuleiro() {
        jogadorAtual = 1;
        this.tabuleiro = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                this.tabuleiro[i][j] = 0;
            }
        }
    }

    private char caracterEscolhido(int x){
        switch (x){
            case 0: return '*';
            case 1: return 'X';
        }
        return 'O';
    }

    public void exibirTabuleiro(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(caracterEscolhido(this.tabuleiro[i][j])+"\t");
            }
            System.out.println();
        }
    }
    public boolean jogada(int x, int y){
        if(tabuleiro[x][y]!=0)
            return false;
        tabuleiro[x][y] = jogadorAtual;
        if(jogadorAtual==1)
            jogadorAtual = 2;
        else jogadorAtual = 1;
        return true;
    }
}
