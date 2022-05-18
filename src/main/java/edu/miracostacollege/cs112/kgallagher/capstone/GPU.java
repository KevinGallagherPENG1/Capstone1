package edu.miracostacollege.cs112.kgallagher.capstone;

public class GPU extends ComputerPart{
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
    
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        GPU gpu = gpu
    }
}
