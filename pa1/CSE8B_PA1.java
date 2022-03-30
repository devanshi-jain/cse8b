import java.util.Scanner;
//Asks three questions (here listed) and increments value of "score" accordingly
//Topic: Radia Perlman. 
//Q1: What year did Perlman graduate from Ocean Township High School? ans: 1969
//Q2: What is considered Perlman's greatest invention? "The..." ans: Spanning Tree Protocol
//Q3: When did she device the Spanning Tree Protocol? ans: 1985

///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              CSE8B_PA1.java
// Files:              (list of source files)
// Quarter:            Winter 2022
//
// Author:             Devanshi Jain (partner included below)
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
// Lab Section:         A01
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
// N/A

public class CSE8B_PA1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int ans1;
        String ans2;
        int ans3;
        int score = 0;

        //Q1
        System.out.println("What is considered Perlman's greatest invention?");
        ans2 = scnr.nextLine();
        if (ans2.equals("Spanning Tree Protocol")) {
            System.out.println("Correct");
            score +=1;
        }
        else {
            System.out.println("Incorrect. Answer is : Spanning Tree Protocol");
        }

        //Q2
        System.out.println("What year did Perlman graduate from Ocean Township High School?");
        ans1 = scnr.nextInt();
        if (ans1 == 1969) {
            System.out.println("Correct");
            score += 1;
        }
        else {
            System.out.println("Incorrect. Answer is: 1969");
        }

        //Q3
        System.out.println("In what year did Perlman devise the Spanning Tree Protocol?");
        ans3 = scnr.nextInt();
        if (ans3 == 1985) {
            System.out.println("Correct");
            score += 1;
        }
        else {
            System.out.println("Incorrect. Answer is 1985");
        }

        //Final Message
        System.out.print("You answered " + score + " out of 3. ");
        if (score == 3) {
            System.out.println("Good Job!");
        }
        else if (score == 2) {
            System.out.println("One good turn deserves another?");
        }
        else if (score == 1) {
            System.out.println("Try again?");
        }
        else {
            System.out.println("Better luck next time :'(");
        }
        scnr.close();
    }
}
