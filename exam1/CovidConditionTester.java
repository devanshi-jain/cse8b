///////////////////////////////////////////////////////////////////////////////
// Main Class File:    CovidConditionTester.java
// File:               CovidCondition.java
// Quarter:            CSE 8B Winter 2022
//
// Author:             (YOUR NAME)
// Email:              (YOUR EMAIL ADDRESS)
// Instructor's Name:  (NAME OF YOUR INSTRUCTOR)
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * A class to test the CovidCondition class.
 *
 * Bugs: None known
 *
 * @author (YOUR NAME)
 */
public class CovidConditionTester {
    /**
     * Execution point of testing code for the CovidCondition class.
     * DO NOT MODIFY METHOD DECLARATION.
     */
    public static void main(String[] args) {
        CovidCondition state1 = new CovidCondition("California", 120);
        CovidCondition state2 = new CovidCondition("Utah", 10);
        System.out.println(state1.getDetails());
        System.out.println(state2.checkTier());
    }
    
}
