package com.example.hostel;

public class Room {
    private final int number;
    private final int capacity;
    private int occupants;

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.occupants = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupants() {
        return occupants;
    }

    public boolean addOccupant() {
        if (occupants < capacity) {
            occupants++;
            return true;
        }
        return false;
    }

    public boolean removeOccupant() {
        if (occupants > 0) {
            occupants--;
            return true;
        }
        return false;
    }
}
