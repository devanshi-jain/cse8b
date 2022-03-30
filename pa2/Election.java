///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Main Class File:    ElectionTester.java
// File:               Candidate.java
// Quarter:            Winter 2022
//
// Author:             Devanshi Jain
// Email:              djain@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          Cash Rice, friend, cmrice@ucsd.edu, help with the scanner scan2 in ElectionTester.java
//
// Online sources:   None
//////////////////////////// 80 columns wide //////////////////////////////////
import java.util.Scanner;
/**
 * following is the Election class
 *
 * Bugs: None
 *
 * @author Devanshi Jain
 */
public class Election {
    private Candidate candidate1;
    private Candidate candidate2;
    private Candidate candidate3;

    /**
 * (Write a succinct description of this method here.)
 * assigns each member variable to a new Candidate object
 */
    public Election(){
        this.candidate1 = new Candidate("Heather Sanchez","Twilight Party");
        this.candidate2 = new Candidate("Sandra Hui", "Interstellar Party");
        this.candidate3 = new Candidate("Jasper Jones","Home Alone Party");
    }
    /**
 * following method runs the election
 *
 * @param (Scanner scan) (Scanner to take in inputs)
 * @return winner of the election
 */
    public void runElection(Scanner scan){
        System.out.println("Welcome to the election. We have 3 candidates:");
        System.out.println("1. " + candidate1.getName() + " from the " + candidate1.getParty());
        System.out.println("2. " + candidate2.getName() + " from the " + candidate2.getParty());
        System.out.println("3. " + candidate3.getName() + " from the " + candidate3.getParty());
        System.out.println("");
        int scan1 = scan.nextInt();
        while (scan1 != -1) {
            
            System.out.println("Enter the next vote: " + scan1 + ". Enter -1 if there are no more votes.");
            if (scan1 == 1){
                candidate1.incrementVotes();
                scan1 = scan.nextInt();
            }
            if (scan1 == 2){
                candidate2.incrementVotes();
                scan1 = scan.nextInt();
            }
            if (scan1 == 3){
                candidate3.incrementVotes();
                scan1 = scan.nextInt();
            }
        }
        
        System.out.println("The vote count is as follow: ");
        System.out.println(candidate1.getName() + ": " + candidate1.getVotes());
        System.out.println(candidate2.getName() + ": " + candidate2.getVotes());
        System.out.println(candidate3.getName() + ": " + candidate3.getVotes());
        System.out.println("");
        String winner;
        if (Math.max(Math.max(candidate1.getVotes(),candidate2.getVotes()),candidate3.getVotes()) == candidate1.getVotes()){
            winner = candidate1.getName();
        }
        else if (Math.max(Math.max(candidate1.getVotes(),candidate2.getVotes()),candidate3.getVotes()) == candidate2.getVotes()){
            winner = candidate2.getName();
        }
        else {
            winner = candidate3.getName();
        }
        System.out.println("The winner is " + winner);
        System.out.println("");
    }
    
}
