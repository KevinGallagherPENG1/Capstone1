package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.util.Objects;

public class CPU extends ComputerPart implements Comparable<CPU>{
    private int mCores;
    private double mSpeed;

    public int getCores(){return mCores;}

    public void setCores(int cores){mCores = cores;}

    public double getSpeed(){return mSpeed;}

    public void setSpeed(int speed){mSpeed = speed;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CPU cpu = (CPU) o;
        return mCores == cpu.mCores && Double.compare(cpu.mSpeed, mSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mCores, mSpeed);
    }


    @Override
    public String toString() {
        return "CPU{" +
                "Cores=" + mCores +
                ", Speed=" + mSpeed +
                ", Name='" + mName + '\'' +
                '}';
    }

    public CPU(int cores, double speed) {
        mCores = cores;
        mSpeed = speed;
    }

    //TODO: COMPARISON
    public int compareTo(CPU o){
        int coreComp = this.mCores - o.mCores;
        if(coreComp != 0) return coreComp;

        return ((int)(this.mSpeed - o.mSpeed));
    }
}
