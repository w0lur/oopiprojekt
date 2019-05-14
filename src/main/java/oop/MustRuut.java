package oop;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MustRuut extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {

        FlowPane flow3 = new FlowPane();
        BorderPane border3 = new BorderPane();
        border3.setMinWidth(250);

        TextField tekst2 = new TextField("Sõiduki registrinumber");
        flow3.getChildren().add(tekst2);

        Scene stseen3 = new Scene(flow3, 250, 150, Color.SNOW);

        FlowPane flow2 = new FlowPane();
        BorderPane border2 = new BorderPane();
        border2.setMinWidth(250);

        Button nupp4 = new Button("Auto");
        border2.setLeft(nupp4);
        Button nupp5 = new Button("Buss");
        border2.setRight(nupp5);
        flow2.getChildren().addAll(nupp4,nupp5);

        TextField tekst = new TextField("Teie nimi");
        flow2.getChildren().add(tekst);

        TextField tekst1 = new TextField("Sõiduki registrinumber");
        flow2.getChildren().add(tekst1);

        Scene stseen2 = new Scene(flow2, 250, 150, Color.SNOW);

        FlowPane flow1 = new FlowPane();
        BorderPane border1 = new BorderPane();
        border1.setMinWidth(250);

        Button nupp2 = new Button("Alustan parkimist");
        border1.setLeft(nupp2);
        Button nupp3 = new Button("Lõpetan parkimise");
        border1.setRight(nupp3);

        flow1.getChildren().add(border1);

        Scene stseen1 = new Scene(flow1, 250, 150, Color.SNOW);


        FlowPane flow = new FlowPane();
        BorderPane border = new BorderPane();
        border.setMinWidth(250);

        Button nupp1 = new Button("Start");
        border.setRight(nupp1);

        HBox hbox = new HBox();
        Label silt1 = new Label("Tere tulemast kasutama parkimiskella!");
        hbox.getChildren().addAll(silt1);
        border.setCenter(hbox);

        flow.getChildren().add(border);

        Scene stseen = new Scene(flow, 250, 150, Color.SNOW);

        nupp1.setOnAction(actionEvent ->{
            peaLava.setScene(stseen1);
        });

        nupp2.setOnAction(actionEvent ->{
            peaLava.setScene(stseen2);
        });

        nupp3.setOnAction(actionEvent ->{
            peaLava.setScene(stseen3);
        });
        nupp4.setOnAction(actionEvent -> {

        });






        peaLava.setScene(stseen);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
