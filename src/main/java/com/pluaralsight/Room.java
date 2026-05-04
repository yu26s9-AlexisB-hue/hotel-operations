package com.pluaralsight;

public class Room {
    private int getNumberOfBeds;
    private double getPrice;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int getNumberOfBeds, double getPrice, boolean occupied, boolean isDirty, boolean isAvailable) {
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
        this.isOccupied = occupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getGetNumberOfBeds() {
        return getNumberOfBeds;
    }

    public void setGetNumberOfBeds(int getNumberOfBeds) {
        this.getNumberOfBeds = getNumberOfBeds;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
