public class Main {
    public static void main(String[] args) {
        Tabuleiro tb = new Tabuleiro();
        tb.exibirTabuleiro();
        System.out.println();
        tb.jogada(0, 0);
        System.out.println("Hello World");
        tb.exibirTabuleiro();
        System.out.println();
        tb.jogada(1, 1);
        tb.exibirTabuleiro();
    }
}
