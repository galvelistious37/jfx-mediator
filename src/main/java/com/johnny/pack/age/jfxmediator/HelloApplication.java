package com.johnny.pack.age.jfxmediator;

import com.johnny.pack.age.jfxmediator.mediator.Label;
import com.johnny.pack.age.jfxmediator.mediator.Slider;
import com.johnny.pack.age.jfxmediator.mediator.TextBox;
import com.johnny.pack.age.jfxmediator.mediator.UIMediator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }

    @Override
    public void start(Stage stage) throws Exception {
        UIMediator mediator = new UIMediator();
        Slider slider = new Slider(mediator);
        TextBox box = new TextBox(mediator);
        Label label = new Label(mediator);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setPadding(new Insets(25,25,25,25));
        grid.add(label, 0, 0);
        grid.add(slider, 0,1);
        grid.add(box, 0,2);
        Scene scene = new Scene(grid, 500, 500);
        stage.setTitle("Mediator Pattern");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}