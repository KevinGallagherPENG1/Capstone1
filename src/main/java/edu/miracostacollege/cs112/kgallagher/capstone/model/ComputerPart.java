package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.io.Serializable;
import java.util.Objects;

public class ComputerPart implements Serializable {

    protected String mName;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerPart that = (ComputerPart) o;
        return Objects.equals(mName, that.mName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName);
    }

    @Override //TOSTRING
    public String toString() {
        return "Computer Part { Name = " +mName;
    }

}
