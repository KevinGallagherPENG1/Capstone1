package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.util.Objects;

public class Screen extends ComputerPart {
    private String mScreen;

    public String getScreen() {
        return mScreen;
    }

    public void setScreen(String screen) {
        mScreen = screen;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Screen screen = (Screen) o;
        return Objects.equals(mScreen, screen.mScreen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mScreen);
    }


    @Override
    public String toString() {
        return "Screen{" +
                "Maximum Refresh Rate='" + mScreen + '\'' +
                ", Name='" + mName + '\'' +
                '}';
    }

    public Screen(String screen) {
        mScreen = screen;
    }


    public int compareTo(Screen o){
        return(this.mScreen.compareToIgnoreCase(o.mScreen));
    }
}
