package edu.miracostacollege.cs112.kgallagher.capstone.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;

public class Model {
    public static final String BINARY_FILE = "ComputerParts.dat";

    public static boolean binaryFileHasData(){
        File binaryFile = new File(BINARY_FILE);
        return binaryFile.exists() && binaryFile.length() >- 5L;
    }

    public static ObservableList<ComputerPart> populateListFromBinaryData(){
        ObservableList<ComputerPart> allParts = FXCollections.observableArrayList();
        if(binaryFileHasData()){
            try{
                ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream(BINARY_FILE));
                ComputerPart[] temp = (ComputerPart[]) fileReader.readObject();
                allParts.addAll(temp);
                fileReader.close();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return allParts;
    }

    public static boolean writeDataToBinaryFile(ObservableList<ComputerPart> allPartsList){
        if (allPartsList.size() > 0){
            ComputerPart[] temp = new ComputerPart[allPartsList.size()];
            for (int i = 0; i < temp.length; i++) temp[i] = allPartsList.get(i);

            try{
                ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream(BINARY_FILE));
                fileWriter.writeObject(temp);
                fileWriter.close();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                return false;
            }
            return true;
        }
        return false;
    }


}
