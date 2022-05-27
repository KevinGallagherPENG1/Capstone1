package edu.miracostacollege.cs112.kgallagher.capstone.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;

public class Model {
    public static final String BINARY_FILE = "ComputerBuilds.dat";

    public static boolean binaryFileHasData(){
        File binaryFile = new File(BINARY_FILE);
        return binaryFile.exists() && binaryFile.length() >= 5L;
    }

    public static ObservableList<ComputerBuild> populateListFromBinaryData(){
        ObservableList<ComputerBuild> allBuilds = FXCollections.observableArrayList();
        if(binaryFileHasData()){
            try{
                ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream(BINARY_FILE));
                ComputerBuild[] temp = (ComputerBuild[]) fileReader.readObject();
                allBuilds.addAll(temp);
                fileReader.close();
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return allBuilds;
    }

    public static boolean writeDataToBinaryFile(ObservableList<ComputerBuild> allBuildsList){
        if (allBuildsList.size() > 0){
            ComputerBuild[] temp = new ComputerBuild[allBuildsList.size()];
            for (int i = 0; i < temp.length; i++) temp[i] = allBuildsList.get(i);

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
