package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.util.Objects;

public class RAM extends ComputerPart implements Comparable<RAM> {
    private double mRAMGB;
    private double mRAMSpeed;

    public double getRAMGB() {
        return mRAMGB;
    }

    public void setRAMGB(double RAMGB) {
        mRAMGB = RAMGB;
    }

    public double getRAMSpeed() {
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


    @Override
    public String toString() {
        return "RAM{" +
                "RAM GB=" + mRAMGB +
                ", RAM Speed=" + mRAMSpeed +
                ", Name='" + mName + '\'' +
                '}';
    }

    public RAM(double RAMGB, double RAMSpeed) {
        mRAMGB = RAMGB;
        mRAMSpeed = RAMSpeed;
    }


    public int compareTo(RAM o){
        int GBComp =(int)( this.mRAMGB - o.mRAMGB);
        if(GBComp != 0) return GBComp;

        return ((int)(this.mRAMSpeed - o.mRAMSpeed));
    }
}
