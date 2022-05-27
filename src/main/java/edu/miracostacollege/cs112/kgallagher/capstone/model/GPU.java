package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.util.Objects;

public class GPU extends ComputerPart implements Comparable<GPU>{
    private String mGPUType;
    private int mGPUFPS;


    public GPU(String GPUType)
    {
        mGPUType = GPUType;
    }

    public String getGPUType()
    {
        return mGPUType;
    }

    public void setGPUType(String GPUType){ mGPUType = GPUType;}

    public int getGPUFPS(){return mGPUFPS;}

    public void setGPUFPS(int GPUFPS){mGPUFPS = GPUFPS;}
    

   /* public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        GPU gpu = (GPU) o;
        return double.compare(gpu.mGPUType, mGPUType);
        }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GPU gpu = (GPU) o;
        return mGPUFPS == gpu.mGPUFPS && Objects.equals(mGPUType, gpu.mGPUType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mGPUType, mGPUFPS);
    }

    //TODO: clean up toString
    @Override
    public String toString() {
        return "GPU{" +
                "GPUType='" + mGPUType + '\'' +
                ", GPUFPS=" + mGPUFPS +
                ", Name='" + mName + '\'' +
                '}';
    }

    public GPU(String GPUType, int GPUFPS) {
        mGPUType = GPUType;
        mGPUFPS = GPUFPS;
    }

    //TODO: COMPARISON
    public int compareTo(GPU o){
        int GPUComp = this.mGPUType.compareToIgnoreCase(o.mGPUType);
        if(GPUComp != 0) return GPUComp;

        return (this.mGPUFPS - o.mGPUFPS);
    }
}
