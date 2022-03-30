///////////////////////////////////////////////////////////////////////////////
// Title:              DataPoint.java
// Main Class File:    PA3Tester.java
// Files:              DataPoint.java, CovidCalculator.java, PA3Library.java, PA3Tester.java, COVID_19_Data.csv
// Quarter:            Winter 2022
//
// Author:             Devanshi Jain
// Email:              djain@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
//                  CHECK ASSIGNMENT PAGE TO see IF PAIR-PROGRAMMING IS ALLOWED
//                  If pair programming is allowed:
//                  1. Read PAIR-PROGRAMMING policy
//                  2. Choose a partner wisely
//                  3. Complete this section for each program file
//
// Pair Partner:        Cash Rice
// Email:               cmrice@ucsd.edu
// Instructors's Name:  Greg Miranda
// Lab Section:         A02
//
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * Following is the DataPoint Class with member variables, 
 * with a constructor method and getter methods
 *
 * Bugs: None
 *
 * @author Devanshi Jain
 */

public class DataPoint {
    // The number and races represented in this data point.  DO NOT CHANGE.
    public int numRaces = 8;
    private String[] races = {"White", "Black", "LatinX", "Asian", "AIAN",
                              "NHPI", "Multiracial", "Other"};
    private String date;
    private String state;
    private int totalCases;
    private int[] casesByRace;

    /**
 * Following constructor initializes all the member variables.
 *
 * @param (String dateIn) (refers to string of input date)
 * @param (String stateIn) (refers to string of input state)
 * @param (int totalCasesIn) (refers to int value of input totalCases)
 * @param (int[] casesByRaceIn) (an array of input casesByRace)
 */
    public DataPoint(String dateIn, String stateIn, int totalCasesIn,
                     int[] casesByRaceIn)
    {   this.date = dateIn;
        this.state = stateIn;
        this.totalCases = totalCasesIn;
        this.casesByRace = casesByRaceIn;
     }

       /**
 * Following constructor initializes all the member variables.
 *
 * @return implicit reference to date from object to heap
 */
    public String getDate() {
        return this.date;
    }

    /**
 * Following constructor initializes all the member variables.
 *
 * @return implicit reference to state from object to heap
 */
    public String getState() {
        return this.state;
    }

    /**
 * Following constructor initializes all the member variables.
 *
 * @return implicit reference to casesByRace from object to heap
 */
    public int getCasesByRace(int raceIndex) {
        return this.casesByRace[raceIndex];
    }

    /**
 * Following constructor initializes all the member variables.
 *
 * @return implicit reference to total cases from object to heap
 */
    public int getTotalCases() {
        return this.totalCases;
    }

    /**
    * Return the race name associated with the given index in this data point.
    * Preconditions: index is between 0 (inclusive) and numRaces (8) (exclusive)
    *
    * DO NOT CHANGE.
    *
    * @param index The index of the race.
    * @return The name of the race (e.g. "White" or "LatinX")
    */
    public String getRaceName(int index)
    {
        return this.races[index];
    }
}
