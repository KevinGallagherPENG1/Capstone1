package edu.miracostacollege.cs112.kgallagher.capstone.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class MainScene extends Scene {
    //TODO: URGENT: CONFIGURE ALL COMBOBOXES!!!

    //fields
    private Label GUITitle = new Label("Computer Comparer");

    private Label errLabel = new Label("All fields must be filled!");

    private TextField CPUTF = new TextField();                       //name
    private Label CPUL = new Label("CPU");                         //label for cpu
    private ComboBox<Integer> CPUCoreCB = new ComboBox<>();  //core count cpu
    private Slider CPUSpeedS = new Slider(1, 6, 4.5);                           //double clockspeed, min, max, default  =  v, v1, v2

    private Label CPUSLabel = new Label("Maximum Clockspeed (MHz)");
    private Label CPUCBLabel = new Label("Cores");

    private TextField RAMTF = new TextField();                      //name
    private Label RAML = new Label("RAM");                       //label for ram
    private Slider RAMGBSlider = new Slider(8, 32, 16);                          //slider for Ram GB
    private TextField RAMSpeedTF = new TextField();             // ram speed
    private Label RAMGBSLabel = new Label("Amount of RAM (GB)");

    private Label GPUL = new Label("GPU");                            //label for GPU
    private ComboBox<String> GPUTypeCB = new ComboBox<>();   //type of GPU / name
    private Label GPUCBLabel = new Label("GPU Name");

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




    public MainScene(){
        super(new GridPane(), 720, 720);
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
        CPUCoreCB.getItems().addAll(1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20);




        /*TODO: IMPLEMENT GPU COMBOBOX ONCE CSV IS IMPLEMENTED
        GPUTypeCB.getItems.addAll();

         */

        StorageCB.getItems().addAll("HDD", "SSD", "M.2 SSD");



        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(5);


        //hbox
        //hbox
        HBox cpuHBox = new HBox(CPUCoreCB, CPUCBLabel);
        cpuHBox.setSpacing(15);
        cpuHBox.setAlignment(Pos.BASELINE_LEFT);

        //add stuff to the gridPane
        pane.add(GUITitle, 1,0);
        //cpu
        pane.add(CPUL, 0, 2);
        pane.add(CPUTF, 1, 1);
        CPUTF.setPromptText("Name of CPU");
        pane.add(cpuHBox, 1, 2);
        pane.add(CPUCoreCB, 1, 2);
        pane.add(CPUSpeedS, 1, 3);
        pane.add(CPUSLabel, 2, 3);
        //ram
        pane.add(RAML, 0, 5);
        pane.add(RAMTF, 1, 4);
        RAMTF.setPromptText("Name of RAM");
        pane.add(RAMGBSlider, 1, 5);
        pane.add(RAMSpeedTF, 1, 6);
        RAMSpeedTF.setPromptText("Speed of RAM in GHz");
        pane.add(RAMGBSLabel, 2, 5);
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




        this.setRoot(pane); //this makes scene visible for some goddamned reason
    }
}
