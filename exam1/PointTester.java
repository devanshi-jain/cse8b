///////////////////////////////////////////////////////////////////////////////
// Main Class File:    PointTester.java
// File:               Point.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             DEVANSHI JAIN
// Email:              djain@ucsd.edu
// Instructor's Name:  GREG MIRANDA
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class to test the Point class.
 *
 * Bugs: None known
 *
 * @author DEVANSHI JAIN
 */
public class PointTester {
    /**
     * Execution point of testing code for the point class.
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) {
        Point home = new Point(1, 20, "Home");
        Point store1 = new Point(55, 30, "Store");
        Point store2 = new Point(200, 10, "Store");

        // Checking `home.getX()` is equal to 1.
        if (home.getX() != 1) {
            System.out.println("Test 1 Failed!");
        }
        else {
            System.out.println("Knocked it out of the park señor");
        } // `return` early so we do not run any subsequent tests. 
        

        // Calculating Manhattan Distance between `store1` and `store2`.
        // Expecting 165, so fail test if result is not 165.
        if (store1.manhattanDistance(store2) != 165) {
            System.out.println("Test 2 Failed");
        }
        else{
            System.out.println("Knocked it out of the park señorita");
        }
        

        // You should write more tests to ensure proper functionality of your code.
    }
}
