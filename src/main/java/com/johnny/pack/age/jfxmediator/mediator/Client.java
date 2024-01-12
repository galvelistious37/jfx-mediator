package com.johnny.pack.age.jfxmediator.mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {
    // NOTE: ****** To run this, module-info.java needs to have this classpath in the 'opens'
    // section, and it requires all the jfx dependencies needed to run the project. Future me will
    // hopefully appreciate this note. ****************************

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
