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
 * Following class provides different statistics about 
 * given dataset, here: DataPoint[] points
 *
 * Bugs: None
 *
 * @author Devanshi Jain
 */
class CovidCalculator {
    private DataPoint[] points;  // The data points to use in the calculations

    /**
 * Constructor method to initializes the member variable (the array of DataPoints)
 *
 * @param (DataPoint[] input) (refers to given input : the array of DataPoints)
 */
    public CovidCalculator(DataPoint[] input)
    {
        // method to make a new array for points and copies the entries from input
        // into points.
        //CHECK FOR DEEP COPY
        this.points = new DataPoint[input.length];
        for(int i=0;i<input.length;++i){
            this.points[i] = input[i]; 
        }
    }
    /**
 * Return the average number of total cases/infections (as a double) 
 * across all states on the specified date
 *
 * @param (String date) (Describe the first parameter here)
 * @return average number of total cases/infections
 */

    public double findAverageCases(String date)
    {   double total = 0.0;
        double num_states = 0.0;
        // first for loop to get an array of input data
        for(int i=0; i< this.points.length;++i){
            // for particular index with given date
            if ((this.points[i].getDate()).equals(date)){
                // 
                total += this.points[i].getTotalCases();
                num_states = num_states + 1.0;
            }
        }
        if (num_states == 0.0){
            return 0.0;
        }
        double averageCases = total/num_states;
        // return answer.toLocaleString('en-US');
        return averageCases;
    }

    /**
 * Following method returns the String representing the name of the race that has the 
 * highest number of infections on the given date in the given state.
 *
 * @param (String date) (refers to string of input date)
 * @param (String state) (refers to string of input state)
 * @return the String representing the name of the race that has the highest number of infections
 */
    public String findRaceWithHighestCases(String date, String state)
    {   int highestNum = -1;
        String nameRace = "";
        // first for loop to get an array of input data
        for(int i=0; i<this.points.length;++i){
            // second for loop to iterate through race indices
            for(int index=0; index<8; ++index){
                // for particular index with given date and state
                if ((this.points[i].getDate()).equals(date) && (this.points[i].getState()).equals(state)){
                    // finding highest number of infections
                    if (highestNum < this.points[i].getCasesByRace(index)){
                        highestNum = this.points[i].getCasesByRace(index);
                        // race corresponding to the highest number of infections
                        nameRace = this.points[i].getRaceName(index);
                    }
                }
            }
        }
        return nameRace;
    }

        /**
 * Following method calculates the state with the fewest total cases in the data.
 * 
 * @return state corresponding to the fewest cases across the data
 */
    public String stateFewestCases()
    {   int fewestCases = 1000000000;
        String state = ""; 
        // first for loop to get an array of input data
        for(int i = 0 ; i < this.points.length ; ++i ){
            // if initialised (and subsequent) value of fewest cases greater than iterated value
            if (fewestCases > this.points[i].getTotalCases()){
                // fewest cases is equal to the smaller iterated value
                fewestCases = this.points[i].getTotalCases();
                // required state is the state corresponding to the fewest cases
                if (fewestCases == this.points[i].getTotalCases()){
                    state = this.points[i].getState();
                }
            }
        }
        return state;
    }
    // How to differentiate bw var name and method name

}