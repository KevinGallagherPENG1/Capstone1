package edu.miracostacollege.cs112.kgallagher.capstone.model;

import java.io.Serializable;
import java.util.Objects;

public class ComputerBuild implements Serializable {
  private CPU mCPU;
  private RAM mRAM;
  private GPU mGPU;
  private Storage mStorage;
  private Cooling mCooling;
  private Screen mScreen;

  public CPU getCPU() {
    return mCPU;
  }

  public void setCPU(CPU CPU) {
    mCPU = CPU;
  }

  public RAM getRAM() {
    return mRAM;
  }

  public void setRAM(RAM RAM) {
    mRAM = RAM;
  }

  public GPU getGPU() {
    return mGPU;
  }

  public void setGPU(GPU GPU) {
    mGPU = GPU;
  }

  public Storage getStorage() {
    return mStorage;
  }

  public void setStorage(Storage storage) {
    mStorage = storage;
  }

  public Cooling getCooling() {
    return mCooling;
  }

  public void setCooling(Cooling cooling) {
    mCooling = cooling;
  }

  public Screen getScreen() {
    return mScreen;
  }

  public void setScreen(Screen screen) {
    mScreen = screen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ComputerBuild computerBuild = (ComputerBuild) o;
    return Objects.equals(mCPU, computerBuild.mCPU) && Objects.equals(mRAM, computerBuild.mRAM) && Objects.equals(mGPU, computerBuild.mGPU) && Objects.equals(mStorage, computerBuild.mStorage) && Objects.equals(mCooling, computerBuild.mCooling) && Objects.equals(mScreen, computerBuild.mScreen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mCPU, mRAM, mGPU, mStorage, mCooling, mScreen);
  }

  @Override
  public String toString() {
    return "Computer{" +
            "CPU=" + mCPU +
            ", RAM=" + mRAM +
            ", GPU=" + mGPU +
            ", Storage=" + mStorage +
            ", Cooling=" + mCooling +
            ", Screen=" + mScreen +
            '}';
  }
}
