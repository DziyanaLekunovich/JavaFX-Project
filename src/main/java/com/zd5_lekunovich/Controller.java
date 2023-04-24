package com.zd5_lekunovich;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.shape.Rectangle;

public class Controller{

    public MenuButton xButton;
    public MenuButton yButton;
    public Canvas kanwa;
    public Rectangle redColor;
    public Rectangle greenColor;
    public Rectangle blueColor;
    public RadioButton redB;
    public RadioButton greenB;
    public RadioButton blueB;


    public void changeX(ActionEvent actionEvent){
        MenuItem sourse = (MenuItem) actionEvent.getSource();
        xButton.setText(sourse.getText());
    }

    public void changeY(ActionEvent actionEvent) {
        MenuItem sourse = (MenuItem) actionEvent.getSource();
        yButton.setText(sourse.getText());
    }

    public void wsatwKwadrat(ActionEvent actionEvent) {
        GraphicsContext g2D = kanwa.getGraphicsContext2D();
        if(redB.isSelected())
        {
            g2D.setFill(redColor.getFill());
            g2D.fillRect(Double.parseDouble(xButton.getText()) * 40, Double.parseDouble(yButton.getText()) * 40, 40, 40);
            return;
        }
        if(greenB.isSelected())
        {
            g2D.setFill(greenColor.getFill());
            g2D.fillRect(Double.parseDouble(xButton.getText()) * 40, Double.parseDouble(yButton.getText()) * 40, 40, 40);
            return;
        }
        if(blueB.isSelected())
        {
            g2D.setFill(blueColor.getFill());
            g2D.fillRect(Double.parseDouble(xButton.getText()) * 40, Double.parseDouble(yButton.getText()) * 40, 40, 40);
        }
    }
}