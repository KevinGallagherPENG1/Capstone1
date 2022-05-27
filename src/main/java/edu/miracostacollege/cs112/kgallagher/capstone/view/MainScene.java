package edu.miracostacollege.cs112.kgallagher.capstone.view;

import edu.miracostacollege.cs112.kgallagher.capstone.Controller.Controller;
import edu.miracostacollege.cs112.kgallagher.capstone.model.*;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class MainScene extends Scene {


    //fields
    private Label GUITitle = new Label("Computer Comparer");

    private Label errLabel = new Label("All fields must be filled!");

    private Label numberErrLabel1 = new Label("Please format as an Arabic Numeral (1, 2, 3, etc) ");
    private Label numberErrLabel2 = new Label("Please format as an Arabic Numeral (1, 2, 3, etc) ");

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
    private Label StorageCBLabel = new Label("Type of Storage");


    private Label CoolingL = new Label("Cooling");                      //label for cooling
    private ComboBox<String> CoolingTypeCB = new ComboBox<>(); //air, liquid, It will be the name

    private TextField ScreenNameTF = new TextField();               //name
    private Label ScreenHZL = new Label("Screen");                 //label for screen
    private TextField ScreenTF = new TextField();                          //screen hz

    private Button addToButton = new Button("Publish Build");
    private Button tierListButton = new Button("Compare to Other Builds");


    //images
    private ImageView computerIV = new ImageView();

    //needed for list
    private Controller controller =  Controller.getInstance();

    private ObservableList<ComputerBuild> buildsList;

    private ComputerBuild selectedBuild;

    public ListView<ComputerBuild> buildsLV = new ListView<>();




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

        CPUCoreCB.getItems().addAll(1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        CPUCoreCB.getSelectionModel().select(2);
        CoolingTypeCB.getItems().addAll("Heat Sink", "Liquid Cooling");





        GPUTypeCB.getItems().addAll("1050", "1060", "1070", "1080", "2060", "2070", "2080", "2090", "3060", "3070", "3080", "3090");



        StorageCB.getItems().addAll("HDD", "SSD", "M.2 SSD");



        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(5);


        //hbox
        HBox cpuHBox = new HBox(CPUCoreCB, CPUCBLabel);
        cpuHBox.setSpacing(15);
        cpuHBox.setAlignment(Pos.BASELINE_LEFT);
        HBox gpuHBox = new HBox(GPUTypeCB, GPUCBLabel);
        gpuHBox.setSpacing(15);
        gpuHBox.setAlignment(Pos.BASELINE_LEFT);
        HBox storageHBox = new HBox(StorageCB, StorageCBLabel);
        storageHBox.setSpacing(15);
        storageHBox.setAlignment(Pos.BASELINE_LEFT);

        //add stuff to the gridPane
        pane.add(GUITitle, 1,0);
        //cpu
        pane.add(CPUL, 0, 2);
        pane.add(CPUTF, 1, 1);
        CPUTF.setPromptText("Name of CPU");
        pane.add(cpuHBox, 1, 2);
        //pane.add(CPUCoreCB, 1, 2);
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
        //pane.add(GPUTypeCB, 1, 8);
        pane.add(gpuHBox, 1, 8);
        //storage
        pane.add(StorageL, 0, 11);
        pane.add(StorageNameTF, 1, 10);
        StorageNameTF.setPromptText("Name of Storage");
        pane.add(storageHBox, 1, 11);
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
        pane.add(errLabel, 2, 19);
        errLabel.setVisible(false);
        errLabel.setTextFill(Color.RED);
        pane.add(numberErrLabel1, 2, 12);
        pane.add(numberErrLabel2, 2, 6);
        numberErrLabel1.setVisible(false);
        numberErrLabel2.setVisible(false);
        numberErrLabel1.setTextFill(Color.RED);
        numberErrLabel2.setTextFill(Color.RED);



        //method time (almost)
        buildsList = controller.getAllBuilds();
        buildsLV.setItems(buildsList);
        buildsLV.getSelectionModel().selectedItemProperty().addListener((obsVal, oldVal, newVal) -> selectBuild(newVal));


        tierListButton.setOnAction(event -> changeScene());
        addToButton.setOnAction(event -> addComputer());


        this.setRoot(pane); //this makes scene visible for some goddamned reason
    }

    private void selectBuild(ComputerBuild newVal){
        selectedBuild = newVal;
        //removeButton.setDisable(selectedInfluencer == null);
    }

    private void changeScene(){
        ViewNavigator.loadScene("Computer List", new ListScene());
    }

    private void addComputer(){
        String nameCPU, nameRAM, nameGPU, nameStorage, nameScreen, nameCooling, screenHZ, storageType;
        int cores;
        double speedCPU, GBRAM, storageAmount, speedRAM;

        nameCPU = CPUTF.getText();
        errLabel.setVisible(nameCPU.isEmpty());
        nameRAM = RAMTF.getText();
        errLabel.setVisible(nameRAM.isEmpty());
        nameGPU = GPUTypeCB.getSelectionModel().getSelectedItem();
        errLabel.setVisible(nameGPU.isEmpty());
        nameStorage = StorageNameTF.getText();
        errLabel.setVisible(nameStorage.isEmpty());
        nameCooling = CoolingTypeCB.getSelectionModel().getSelectedItem();
        errLabel.setVisible(nameCooling.isEmpty());
        nameScreen = ScreenNameTF.getText();
        errLabel.setVisible(nameScreen.isEmpty());

        screenHZ = ScreenTF.getText();
        errLabel.setVisible(screenHZ.isEmpty());
        storageType = StorageCB.getSelectionModel().getSelectedItem();
        errLabel.setVisible(storageType.isEmpty());
        cores = CPUCoreCB.getSelectionModel().getSelectedItem();
        speedRAM = Double.parseDouble(RAMSpeedTF.getText());
        numberErrLabel1.setVisible(speedRAM == 0.00d);
        storageAmount = Double.parseDouble(StorageTF.getText());
        numberErrLabel2.setVisible(storageAmount==0.00d);
        speedCPU = CPUSpeedS.getValue();
        GBRAM = RAMGBSlider.getValue();

        //TODO: Kev - I made a new class ComputerBuild, which has all
        // the parts (CPU, RAM, GPU, Storage, Cooling, Screen) as fields.
        ComputerBuild build = new ComputerBuild();
        build.setCPU(new CPU(cores, speedCPU));
        // TODO: Use the setters to instantiate new RAM, GPU, Storage, Cooling, Screen objects
        // TODO: just like setCPU is used here


        // Adds the new build to the list
        buildsList.add(build);

        buildsLV.refresh();
    }



}
