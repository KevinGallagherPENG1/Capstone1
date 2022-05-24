package edu.miracostacollege.cs112.kgallagher.capstone.view;

import edu.miracostacollege.cs112.kgallagher.capstone.Controller.Controller;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class View extends Application {

    public void start(Stage primaryStage) throws Exception{
        primaryStage.getIcons().add(new Image("computer.png"));
        ViewNavigator.setStage(primaryStage);
        ViewNavigator.loadScene("Computer Configurator", new MainScene()); //use this to open new scene, (title,  newSecondScene());
    }

    public  void stop() { Controller.getInstance().saveData();}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
