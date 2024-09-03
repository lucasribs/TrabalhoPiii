package com.example.demo;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

public class HelloController {
    @FXML
    private Label welcomeText;

    private boolean acabou = false;
    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");

    }

    @FXML
    private Button bt1;

    @FXML
    protected void onOutraCoisa() {
        //bt1.setText("Hello Stranger");
        //welcomeText.setText("Welcome to JavaFX Application!");

    }


    @FXML
    protected void JogadaMouse(MouseEvent event) {
        if(!acabou) {
            ImageView imageView = (ImageView) event.getSource();
            String caminho = imageView.getImage().getUrl();
            System.out.println(caminho);
            int fimUrl = caminho.lastIndexOf("/");
            String path = caminho.substring(0, fimUrl + 1);
            System.out.println(path);
            System.out.println(imageView.getId());
            GridPane gridPane = (GridPane) imageView.getParent();
            int x = gridPane.getRowIndex(imageView);
            int y = gridPane.getColumnIndex(imageView);
            System.out.println("Coluna: " + x);
            System.out.println("Linha: " + y);
            if (imageView.getImage().getUrl().endsWith("vazio.png")) {
                try {
                    String jogadorAtual = Jogo.getJogo().jogar(x, y);
                    imageView.setImage(new Image(path + jogadorAtual + ".png"));
                    acabou = Jogo.getJogo().encerrouJogo();
                    if(acabou)
                        welcomeText.setText("Fim");
                } catch (Exception e) {
                    System.out.println(e);
                }


            }
        }

    }
}