module com.example.multiplayer_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multiplayer_game to javafx.fxml;
    exports com.example.multiplayer_game;
}