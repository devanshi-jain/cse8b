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

/**
 * following is the Candidate class
 *
 * Bugs: None
 *
 * @author Devanshi Jain
 */
public class Candidate {
    private String name;
    private String party;
    private int voteCount;

    /**
 * Constructor method initializes the member variables
 *
 * @param (String candidateName) (Describe the first parameter here)
 * @param (String candidateParty) (Do the same for each additional parameter)
 * @return this.name, this.party, this.voteCount
 */
    public Candidate(String candidateName, String candidateParty){
        this.name = candidateName;
        this.party = candidateParty;
        this.voteCount = 0;
    }

    /**
 * getter method to return the candidate’s name.
 * @return this.name
 */
    public String getName() {
        return this.name;
    }

    /**
 * getter method to return the candidate’s party.
 * @return this.party
 */
    public String getParty(){
        return this.party;
    }
      
    /**
 * getter method to return the candidate’s vote count.
 * @return this.voteCount
 */
    public int getVotes(){
        return this.voteCount;
    }

    /**
 * setter method to set the candidate’s party to the value of the parameter newParty.
 * @param (String newParty) (Describe the first parameter here)
 * @return this.party
 */
    public void setParty(String newParty){
        this.party = newParty;
    }

    /**
 * setter method increments the number of votes the candidate currently has by 1
 * @return this.voteCount
 */
    public void incrementVotes(){
        this.voteCount += 1;
    }
}