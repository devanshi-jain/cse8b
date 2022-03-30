///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              ElectionTester.java
// Files:              Election.java, ElectionTEster.java, Candidate.java
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
 * following is the ElectionTester class
 *
 * Bugs: None
 *
 * @author Devanshi Jain
 */
public class ElectionTester {
    /**
 * following is the main method of ElectionTester
 */
    public static void main(String[] args){
        Candidate candidate1 = new Candidate("Tring Butterfield","Revelle");
        Candidate candidate2 = new Candidate("Xixi Huang", "Muir");
        System.out.println(candidate1.getName());
        System.out.println(candidate1.getParty());
        System.out.println(candidate1.getVotes());
        System.out.println(candidate2.getName());
        System.out.println(candidate2.getParty());
        System.out.println(candidate2.getVotes());
        candidate1.setParty("Warren");
        candidate1.incrementVotes();
        candidate1.incrementVotes();
        System.out.println(candidate1.getName());
        System.out.println(candidate1.getParty());
        System.out.println(candidate1.getVotes());

        Scanner scan2 = new Scanner(System.in);

        // Creates two new Election objects and stores them in two different variables.
        Election canDo1 = new Election();
        Election canDo2 = new Election();
        // Calls runElection once on each Election object.
        
        canDo1.runElection(scan2);
        canDo2.runElection(scan2);
        scan2.close();
    }
}
