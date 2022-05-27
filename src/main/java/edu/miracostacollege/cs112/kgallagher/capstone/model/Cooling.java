package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.util.Objects;

public class Cooling extends ComputerPart implements Comparable<Cooling>{
    private String mCoolingType;

    public String getCoolingType() {
        return mCoolingType;
    }

    public void setCoolingType(String coolingType) {
        mCoolingType = coolingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cooling cooling = (Cooling) o;
        return Objects.equals(mCoolingType, cooling.mCoolingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCoolingType);
    }


    //TODO: Clean up toString for Cooling, constructor, review inheritance / comparison
    @Override
    public String toString() {
        return "Cooling{" +
                "CoolingType='" + mCoolingType + '\'' +
                ", Name='" + mName + '\'' +
                '}';
    }

    public Cooling(String coolingType) {
        mCoolingType = coolingType;
    }

    public int compareTo(Cooling o){
        return(mCoolingType.compareToIgnoreCase(o.mCoolingType));
    }
}
