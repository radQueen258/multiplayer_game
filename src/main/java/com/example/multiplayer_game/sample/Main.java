package com.example.multiplayer_game.sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Light;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = WIDTH;
    private static final int ROWS = 20;
    private static final int COLUMNS = ROWS;
    private static final int SQUARE_SIZE = WIDTH / ROWS;
    private static final String[] FOOD_IMAGE = new String[] {"/images/apple.png", "/images/cherry.png", "/images/strawberry.png"};


    private static final int RIGHT = 0;
    private static final int LEFT = 1;
    private static final int UP = 2;
    private static final int DOWN = 3;


    private GraphicsContext gc;
    private List<Light.Point> snakeBody = new ArrayList<>();
    private Light.Point snakeHead;
    private Image foodImage;
    private int foodX;
    private int foodY;
    private boolean gameOver;
    private int currentDirection;


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Snake");
        Group root = new Group();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
