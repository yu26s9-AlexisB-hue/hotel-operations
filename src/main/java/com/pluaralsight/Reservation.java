package com.pluaralsight;

import static java.lang.Math.round;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public int getPrice(){
        if (roomType.equals("double")){
            return 124;
        }else if(roomType.equals("king")){
            return 139;
        }else{
            return 0;
        }

    }

    public double getReservationTotal(){
        double pricePerNight = getPrice();

        if (isWeekend){
            double tenPercentOfPrice = pricePerNight * .10;
            double increasedPrice = pricePerNight + tenPercentOfPrice;
            double totalPrice = increasedPrice * numberOfNights;
            double roundedTotal = round(totalPrice);

            return roundedTotal;
        }else if(!isWeekend){
            double totalPrice = pricePerNight * numberOfNights;
            return totalPrice;
        }else{
            return 0;
        }

    }
}
