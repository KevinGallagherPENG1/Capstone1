package edu.miracostacollege.cs112.kgallagher.capstone;

import java.util.Objects;

public class Storage extends ComputerPart{
    private String mStorage;
    private double mStorageAmount;

    public String getStorage() {
        return mStorage;
    }

    public void setStorage(String storage) {
        mStorage = storage;
    }

    public double getStorageAmount() {
        return mStorageAmount;
    }

    public void setStorageAmount(double storageAmount) {
        mStorageAmount = storageAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Storage storage = (Storage) o;
        return Double.compare(storage.mStorageAmount, mStorageAmount) == 0 && Objects.equals(mStorage, storage.mStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mStorage, mStorageAmount);
    }


    @Override
    public String toString() {
        return "Storage{" +
                "Storage Type='" + mStorage + '\'' +
                ", Storage Amount=" + mStorageAmount +
                ", Name='" + mName + '\'' +
                '}';
    }

    public Storage(String storage, double storageAmount) {
        mStorage = storage;
        mStorageAmount = storageAmount;
    }

    //TODO: COMPARISON
}
