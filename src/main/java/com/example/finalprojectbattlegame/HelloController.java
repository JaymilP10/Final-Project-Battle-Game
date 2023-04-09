package com.example.finalprojectbattlegame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.Effect;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;

    ImageView[][] map = new ImageView[200][100];

    @FXML
    private GridPane board;

    ColorAdjust c = new ColorAdjust();

    @FXML
    private void initialize(){
        c.setBrightness(0.2); // setting the brightness of the color.
        c.setContrast(0.1); // setting the contrast of the color
        c.setHue(0.3); // setting the hue of the color
        c.setSaturation(0.45);
        for (int i = 0; i < map.length; i++) {
            // square
            // btn[0] for rectangle
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = new ImageView();
                map[i][j].setEffect(c);
                map[i][j].setFitHeight(70);
                map[i][j].setFitWidth(70);
                board.add(map[i][j], j, i);

            }
        }
    }


}