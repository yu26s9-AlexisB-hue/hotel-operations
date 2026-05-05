package com.pluaralsight;

public class Room {
    private int getNumberOfBeds;
    private double getPrice;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int getNumberOfBeds, double getPrice, boolean occupied, boolean isDirty) {
        this.getNumberOfBeds = getNumberOfBeds;
        this.getPrice = getPrice;
        this.isOccupied = occupied;
        this.isDirty = isDirty;
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
        if (!isDirty && !isOccupied){
            return true;
        }else if (isDirty || isOccupied){
            return false;
        }else{
            //Nothing
            return false;
        }
    }

    public static void checkIn(){
        //once checked in the room should be marked as occupied and dirty
    }

    public static void checkOut(){
        //once checked out room must be cleaned by housekeeping before making it available
    }

    public static void cleanRoom(){
        //called when a room has been checked out
    }
}
