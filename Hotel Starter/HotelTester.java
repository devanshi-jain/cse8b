import java.util.Arrays;

///////////////////////////////////////////////////////////////////////////////
// Title:              HotelTester
// Files:              HotelTester.java, Hotel.java, Room.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             Devanshi Jain
// Email:              djain@ucsd.edu
// Instructor's Name:  Greg Miranda
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class to test the Hotel and Room class.
 *
 * Bugs: None known
 *
 * @author Devanshi Jain
 */
public class HotelTester {
    /**
     * Execution point of testing code for the Hotel and Room class.
     *
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) {
        Room r1 = new Room(101, new String[] {"Benson", "Jack"}, false);
        Room r2 = new Room(121, new String[] {"Prajwala", "Sasya"},false);
        Room r3 = new Room(90);
        Room[] roomList = new Room[] {r1, r2, r3};
        Hotel h1 = new Hotel("Marriott", roomList);
        String[] guestList = new String[] {"Bao", "James"};
        System.out.println(h1.bookRoom(guestList));

        // Room room1 = new Room(1, new String[] {"John", "Mary"}, false);
        // Room room2 = new Room(2); //creates a free room
        // Room room3 = new Room(room1);
        // Room room4 = new Room(3, new String[] {"Adi", "Parsh", "Oliver", "Mirabel"}, true);

        // Room[] roomList = new Room[] {room1, room2, room3, room4};
        // System.out.println("First room: " + room1.getRoomNumber());
        // System.out.println("Second room: " + room2.getIsAvailable());
        // System.out.println("Fourth room: " + Arrays.toString(room4.getGuestNames()));

        // // System.out.println("Roomlist: " + roomList);
        // // System.out.println("First room: " + roomList[0]);
        // // System.out.println("First room number: " + roomList[0].getRoomNumber());
        // // System.out.println("First room's guest list: " + roomList[0].getGuestNames());

        // // System.out.println("Second room: " + roomList[1]);
        // // System.out.println("Second room number: " + roomList[1].getRoomNumber());
        // System.out.println("Second room's guest list: " + Arrays.toString(roomList[1].getGuestNames()));


        // Hotel hotel1 = new Hotel("Hotel California", roomList);

        // // Testing for simple assignment within constructor.
        // // We do NOT want a shallow copy - we want a deep copy.
        // // As such, if both arrays have the same reference, then this test fails.
        // if (hotel1.getRooms() == roomList) {
        //     System.out.println("Test Failed! Shallow copy detected.");
        // }
        // else{
        //     System.out.println("Rooms in " + hotel1.getName() + ": " + Arrays.toString(hotel1.getRooms())));
        // }

        // // Testing `bookRoom()` for `hotel1`.
        // int output = hotel1.bookRoom(new String[] {"Paul", "Mark"});
        // int expected = 2;
        // if (output != expected) {
        //     System.out.println("Test Failed! Booking status does not match.");
        // }

        // // You should write more tests to ensure deep copy (and copy constructor) work properly,
        // // and to test `bookRoom()` and `bookRoom(int roomNumber)`.
    }
}
