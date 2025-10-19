package com.example.hostel;

import java.util.Scanner;

public class HostelApp {
    public static void main(String[] args) {
        Hostel hostel = new Hostel();
        hostel.addRoom(new Room(101, 2));
        hostel.addRoom(new Room(102, 3));

        Scanner sc = new Scanner(System.in);
        System.out.println("Hostel app demo. Commands: book <room>, checkout <room>, status, exit");
        while (true) {
            System.out.print("> ");
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("exit")) break;
            if (line.equalsIgnoreCase("status")) {
                System.out.println("Total rooms: " + hostel.totalRooms());
                continue;
            }
            String[] parts = line.split("\\s+");
            if (parts.length >= 2) {
                String cmd = parts[0];
                int room;
                try {
                    room = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid room number");
                    continue;
                }
                if (cmd.equalsIgnoreCase("book")) {
                    System.out.println(hostel.bookRoom(room) ? "Booked" : "Unable to book");
                } else if (cmd.equalsIgnoreCase("checkout")) {
                    System.out.println(hostel.checkoutRoom(room) ? "Checked out" : "Unable to checkout");
                } else {
                    System.out.println("Unknown command");
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        sc.close();
    }
}
