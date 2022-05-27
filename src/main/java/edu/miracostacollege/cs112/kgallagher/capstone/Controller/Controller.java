package edu.miracostacollege.cs112.kgallagher.capstone.Controller;

import edu.miracostacollege.cs112.kgallagher.capstone.model.ComputerBuild;
import edu.miracostacollege.cs112.kgallagher.capstone.model.Model;
import javafx.collections.ObservableList;

public class Controller {
    private static Controller theInstance;
    private ObservableList<ComputerBuild> mList;

    private Controller(){}

    public static Controller getInstance() {
        if(theInstance == null){
            theInstance = new Controller();
            theInstance.mList = Model.populateListFromBinaryData();
        }
        return theInstance;
    }

    public ObservableList<ComputerBuild> getAllBuilds() {return mList;}

    public void saveData(){Model.writeDataToBinaryFile(mList);}
}
