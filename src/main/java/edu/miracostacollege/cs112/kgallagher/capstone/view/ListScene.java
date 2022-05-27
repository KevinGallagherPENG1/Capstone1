package edu.miracostacollege.cs112.kgallagher.capstone.view;

import edu.miracostacollege.cs112.kgallagher.capstone.Controller.Controller;
import edu.miracostacollege.cs112.kgallagher.capstone.model.ComputerPart;
import edu.miracostacollege.cs112.kgallagher.capstone.view.MainScene;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class ListScene extends Scene {
    //this will be the scene where the builds are listed, one can delete and view builds
    private Button deleteButton = new Button("Remove Build");
    private Button goBackButton = new Button("Add Another Build");
    private ListView<ComputerPart> partsLV = new ListView<>();
    private ObservableList<ComputerPart> partsList;
    private ComputerPart selectedPart;
    private Controller controller = Controller.getInstance();
    public ListScene(){
        super(new GridPane(), 720, 720);

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(5);
        pane.setPadding(new Insets(5));


        pane.add(partsLV, 0, 0);
        HBox hBox = new HBox(deleteButton, goBackButton);
        pane.add(hBox, 0, 1);


        partsList = controller.getAllParts();
        partsLV.setItems(partsList);
        partsLV.setPrefWidth(780);
        this.setRoot(pane);

        goBackButton.setOnAction(event -> goBack());
        deleteButton.setOnAction(event -> removeBuild());

    }

    private void goBack(){
        ViewNavigator.loadScene("Computer Comparer", new MainScene());
    }

    private void removeBuild(){
        if(selectedPart == null) return;
        partsList.remove(selectedPart);
        partsLV.refresh();
    }
}
