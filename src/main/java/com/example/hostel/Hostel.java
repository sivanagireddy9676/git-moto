package com.example.hostel;

import java.util.HashMap;
import java.util.Map;

public class Hostel {
    private final Map<Integer, Room> rooms = new HashMap<>();

    public void addRoom(Room room) {
        rooms.put(room.getNumber(), room);
    }

    public Room getRoom(int number) {
        return rooms.get(number);
    }

    public boolean bookRoom(int number) {
        Room r = rooms.get(number);
        if (r == null) return false;
        return r.addOccupant();
    }

    public boolean checkoutRoom(int number) {
        Room r = rooms.get(number);
        if (r == null) return false;
        return r.removeOccupant();
    }

    public int totalRooms() {
        return rooms.size();
    }
}
