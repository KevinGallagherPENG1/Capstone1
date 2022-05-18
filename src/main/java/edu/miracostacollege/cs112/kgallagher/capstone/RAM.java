package edu.miracostacollege.cs112.kgallagher.capstone;

import java.util.Objects;

public class RAM extends ComputerPart{
    private double mRAMGB;
    private int mRAMSpeed;

    public double getRAMGB() {
        return mRAMGB;
    }

    public void setRAMGB(double RAMGB) {
        mRAMGB = RAMGB;
    }

    public int getRAMSpeed() {
        return mRAMSpeed;
    }

    public void setRAMSpeed(int RAMSpeed) {
        mRAMSpeed = RAMSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RAM ram = (RAM) o;
        return Double.compare(ram.mRAMGB, mRAMGB) == 0 && mRAMSpeed == ram.mRAMSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mRAMGB, mRAMSpeed);
    }

    //TODO: Clean up toString for RAM, constructor, review inheritance / comparison
    @Override
    public String toString() {
        return "RAM{" +
                "mRAMGB=" + mRAMGB +
                ", mRAMSpeed=" + mRAMSpeed +
                ", mName='" + mName + '\'' +
                '}';
    }

    public RAM(double RAMGB, int RAMSpeed) {
        mRAMGB = RAMGB;
        mRAMSpeed = RAMSpeed;
    }
}
