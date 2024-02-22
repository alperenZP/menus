package com.example.menus2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Scene scene;
        VBox root;
        FlowPane flowPane;
        Label label1, label2, label3, label4;
        Circle cirkel;
        MenuBar menubalk;
        Menu menuBestand, menuBewerken;
        MenuItem menuItemOpenen, menuItemVeggie, menuItemLasagna, menuItemTajine, menuItemVerlaten;
        MenuItem menuItemKopieren, menuItemKnippen, menuItemPlakken;

        root = new VBox(10);
        flowPane = new FlowPane();
        flowPane.setHgap(25);
        menubalk = new MenuBar();
        menuBestand = new Menu("Bestand");
        menuItemOpenen = new MenuItem("Openen");
        menuItemVeggie = new MenuItem("Veggie");
        menuItemLasagna = new MenuItem("Lasagna");
        menuItemTajine = new MenuItem("Tajine");
        menuItemVerlaten = new MenuItem("Verlaten");
        menuBestand.getItems().addAll(menuItemOpenen, new SeparatorMenuItem(), menuItemVeggie, menuItemLasagna, menuItemTajine, new SeparatorMenuItem(), menuItemVerlaten);
        menuBewerken = new Menu("Bewerken");
        menuItemKopieren = new MenuItem("Kopiëren");
        menuItemKnippen = new MenuItem("Knippen");
        menuItemPlakken = new MenuItem("Plakken");
        menuBewerken.getItems().addAll(menuItemKopieren, menuItemKnippen, menuItemPlakken);
        menubalk.getMenus().addAll(menuBestand, menuBewerken);
        menuItemVerlaten.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit();
            }
        });
        label1 = new Label("Mohamed");
        label2 = new Label("6IF");
        label3 = new Label("Jan");
        label4 = new Label("5IF");
        cirkel = new Circle();
        cirkel.setRadius(5);
        flowPane.getChildren().addAll(label1, label2, label3, label4, cirkel);
        root.getChildren().addAll(menubalk, flowPane);
        scene = new Scene(root, 320, 240);
        primaryStage.setTitle("Demo FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}