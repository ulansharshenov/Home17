package com.company;

import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String address;
    private Cow[] cows;
    private Sheep[] sheep;
    private Horse[] horses;

    public Farm(String ownerName, String address, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.ownerName = ownerName;
        this.address = address;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Owner name: " + ownerName + "\n" +
                "Address: " + address + "\n" +
                "Cows: " + Arrays.toString(cows) + "\n" +
                "Sheep: " + Arrays.toString(sheep) + "\n" +
                "Horses: " + Arrays.toString(horses);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }
}
