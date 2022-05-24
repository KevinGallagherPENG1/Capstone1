package edu.miracostacollege.cs112.kgallagher.capstone.Controller;

import edu.miracostacollege.cs112.kgallagher.capstone.model.ComputerPart;
import edu.miracostacollege.cs112.kgallagher.capstone.model.Model;
import javafx.collections.ObservableList;

public class Controller {
    private static Controller theInstance;
    private ObservableList<ComputerPart> mList;

    private Controller(){}

    public static Controller getInstance() {
        if(theInstance == null){
            theInstance = new Controller();
            theInstance.mList = Model.populateListFromBinaryData();
        }
        return theInstance;
    }

    public ObservableList<ComputerPart> getAllParts() {return mList;}

    public void saveData(){Model.writeDataToBinaryFile(mList);}
}
