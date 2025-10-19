package com.example.hostel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HostelTest {

    private Hostel hostel;

    @BeforeEach
    void setUp() {
        hostel = new Hostel();
        hostel.addRoom(new Room(101, 1));
        hostel.addRoom(new Room(102, 2));
    }

    @Test
    void testAddAndTotalRooms() {
        assertEquals(2, hostel.totalRooms());
    }

    @Test
    void testBookingAndCheckout() {
        assertTrue(hostel.bookRoom(101));
        assertFalse(hostel.bookRoom(101)); // full
        assertTrue(hostel.checkoutRoom(101));
        assertFalse(hostel.checkoutRoom(101)); // already empty
    }

    @Test
    void testInvalidRoom() {
        assertFalse(hostel.bookRoom(999));
        assertFalse(hostel.checkoutRoom(999));
    }
}
