package edu.miracostacollege.cs112.kgallagher.capstone.view;

import edu.miracostacollege.cs112.kgallagher.capstone.Controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class View extends Application {

    public void start(Stage primaryStage) throws Exception{
        ViewNavigator.setStage(primaryStage);
        ViewNavigator.loadScene("Computer Configurator", new MainScene());
    }

    public  void stop() { Controller.getInstance().saveData();}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
