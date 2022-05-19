package edu.miracostacollege.cs112.kgallagher.capstone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    //TODO: URGENT: CONFIGURE ALL COMBOBOXES!!!

    //fields
    private Label GUITitle = new Label("Computer Comparer");

    private TextField CPUTF = new TextField();                       //name
    private Label CPUL = new Label("CPU");                         //label for cpu
    private ComboBox<Integer> CPUCoreCB = new ComboBox<>();  //core count cpu
    private Slider CPUSpeedS = new Slider(1, 10, 4.5);                           //double clockspeed, min, max, default  =  v, v1, v2

    private TextField RAMTF = new TextField();                      //name
    private Label RAML = new Label("RAM");                       //label for ram
    private Slider RAMGBSlider = new Slider(8, 64, 16);                          //slider for Ram GB
    private TextField RAMSpeedTF = new TextField();             // ram speed

    private Label GPUL = new Label("GPU");                            //label for GPU
    private ComboBox<String> GPUTypeCB = new ComboBox<>();   //type of GPU / name

    private TextField StorageNameTF = new TextField();                      //name
    private ComboBox<String> StorageCB = new ComboBox<>();      //m.2, hdd, ssd
    private Label StorageL = new Label("Storage");              //label for ssd
    private TextField StorageTF = new TextField();                      //storage amount


    private Label CoolingL = new Label("Cooling");                      //label for cooling
    private ComboBox<String> CoolingTypeCB = new ComboBox<>(); //air, liquid, It will be the name

    private TextField ScreenNameTF = new TextField();               //name
    private Label ScreenHZL = new Label("Screen");                 //label for screen
    private TextField ScreenTF = new TextField();                          //screen hz

    private Button addToButton = new Button("Publish Build");
    private Button tierListButton = new Button("Compare to Other Builds");






    public void start(Stage stage) throws IOException {
        //Slider config
        RAMGBSlider.setShowTickMarks(true);
        RAMGBSlider.setShowTickLabels(true);
        RAMGBSlider.setBlockIncrement(2);
        RAMGBSlider.setSnapToTicks(true);
        RAMGBSlider.setMajorTickUnit(2);

        CPUSpeedS.setShowTickMarks(true);
        CPUSpeedS.setShowTickLabels(true);
        CPUSpeedS.setBlockIncrement(.1);
        CPUSpeedS.setSnapToTicks(true);
        CPUSpeedS.setMajorTickUnit(1);

        addToButton.isFocused();

        //comboBox config
        //TODO: COMBOBOX!!!


        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(5);


        Scene scene = new Scene(pane, 1000, 1000);
        stage.setTitle("PC COMPARISON");
        stage.setScene(scene);
        stage.show();


        //add stuff to the gridPane
        pane.add(GUITitle, 1,0);
        //cpu
        pane.add(CPUL, 0, 2);
        pane.add(CPUTF, 1, 1);
        CPUTF.setPromptText("Name of CPU");
        pane.add(CPUCoreCB, 1, 2);
        pane.add(CPUSpeedS, 1, 3);
        //ram
        pane.add(RAML, 0, 5);
        pane.add(RAMTF, 1, 4);
        RAMTF.setPromptText("Name of RAM");
        pane.add(RAMGBSlider, 1, 5);
        pane.add(RAMSpeedTF, 1, 6);
        RAMSpeedTF.setPromptText("Speed of RAM in GHz");
        //gpu
        pane.add(GPUL, 0, 8);
        pane.add(GPUTypeCB, 1, 8);
        //storage
        pane.add(StorageL, 0, 11);
        pane.add(StorageNameTF, 1, 10);
        StorageNameTF.setPromptText("Name of Storage");
        pane.add(StorageCB, 1, 11);
        pane.add(StorageTF, 1, 12); //AMOUNT OF STORAGE
        StorageTF.setPromptText("Amount of Storage in GB");
        //cooling
        pane.add(CoolingL, 0, 14);
        pane.add(CoolingTypeCB, 1, 14);
        //screen
        pane.add(ScreenHZL, 0, 17);
        pane.add(ScreenNameTF, 1,17);
        ScreenNameTF.setPromptText("Name of Display");
        pane.add(ScreenTF, 1, 18);
        ScreenTF.setPromptText("Maximum Refresh Rate in Hz");

        //two buttons
        HBox hBox = new HBox(addToButton, tierListButton);
        pane.add(hBox, 1, 19);

    }

    public static void main(String[] args) {
        launch();
    }
}