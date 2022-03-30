///////////////////////////////////////////////////////////////////////////////
//                 
// Files:              RedditDataPoint.java
// Quarter:            Winter 2022
//
// Author:             Devanshi Jain
// Email:              djain@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Pair Partner:        Cash Rice
// Email:               cmrice@ucsd.edu
// Instructors's Name:  Greg Miranda
// 
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * In the following class involves reading the dataset, generating an ArrayList,
 * and printing out the elements from the ArrayList.
 *
 * Bugs: None known
 *
 * @author Devanshi Jain
 **/

import java.util.Scanner;
import javax.swing.JSpinner.NumberEditor;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;


public class PA6 {
        // PROVIDED CONSTANT
    private static final String DELIMITER = ","; // CSV file delimiter
    private static final int NAME_INDEX = 0; // A
    private static final int TEXT_INDEX = 114; // DK
    private static final int LEX_LIWC_I_INDEX = 19; // T
    private static final int LEX_LIWC_WE_INDEX = 20; // U
    private static final int LEX_LIWC_SHEHE_INDEX = 22; // W
    public static ArrayList<RedditDataPoint> readData(String fileName, ArrayList<String> categories)
            throws IOException {
        ArrayList<RedditDataPoint> data = new ArrayList<RedditDataPoint>();
        FileReader inputFile = new FileReader(fileName);
        BufferedReader newReader = new BufferedReader(inputFile);
        String[] nextLine;
        RedditDataPoint item;
        newReader.readLine();

        String name;
        String text;
        double ICount; 
        double weCount;
        double sheheCount;

        while (newReader.ready()) {
            nextLine = newReader.readLine().split(DELIMITER);
            name = nextLine[NAME_INDEX];
            text = nextLine[TEXT_INDEX];
            ICount = Double.parseDouble(nextLine[LEX_LIWC_I_INDEX]);
            weCount = Double.parseDouble(nextLine[LEX_LIWC_WE_INDEX]);
            sheheCount = Double.parseDouble(nextLine[LEX_LIWC_SHEHE_INDEX]);

            item = new RedditDataPoint(name, text, ICount, weCount, sheheCount);

            data.add(item);

            if (!categories.contains(name)) {
                categories.add(name);
            }
        }

        newReader.close();
        return data;
    }

    // /**
    //  * Following method generates an ArrayList of RedditDataPoint objects
    //  *
    //  * @param (String fileName) : Name of given file
    //  * @param (ArrayList<String> categories) : array containing all the subreddit names from the dataset
    //  * @return data
    //  **/
    // public static ArrayList<RedditDataPoint> readData(String fileName, ArrayList<String> categories)
    //         throws IOException {
    //     ArrayList<RedditDataPoint> data = new ArrayList<RedditDataPoint>();
    //     BufferedReader buff = new BufferedReader(new FileReader(fileName));
    //     String name;
    //     String text;
    //     double lex_liwc_i;
    //     double lex_liwc_we;
    //     double lex_liwc_shehe;
    //     String[] data2;
    //     buff.readLine();
    //     RedditDataPoint pt;
    //     while(buff.ready()){
    //         data2 = buff.readLine().split(DELIMITER); 
    //         name = data2[NAME_INDEX];
    //         text = data2[TEXT_INDEX];
    //         lex_liwc_i = Double.parseDouble(data2[LEX_LIWC_I_INDEX]);
    //         lex_liwc_we = Double.parseDouble(data2[LEX_LIWC_WE_INDEX]);
    //         lex_liwc_shehe = Double.parseDouble(data2[LEX_LIWC_SHEHE_INDEX]);
    //         pt = new RedditDataPoint(name, text, lex_liwc_i, lex_liwc_we, lex_liwc_shehe);
    //         data.add(pt);
    //         if (!categories.contains(name)){
    //             categories.add(name);
    //         }
    //     }
    //     // data.add(data.getName);
    //     // subreddit,post_id,id,label,confidence
    //     buff.close();
    //     return data;
    //}

    /**
     * Following method prints out the subreddit name and the 
     * number of posts on this subreddit from the dataset.
     *
     * @param (ArrayList<RedditDataPoint> data) : ArrayList of RedditDataPoint objects
     * @param (ArrayList<String> categories) : array containing all the subreddit names from the dataset
     * @return None
     **/
    public static void printTotalPosts(ArrayList<RedditDataPoint> data, ArrayList<String> categories) {
        int num;
        String name_pst;
        int i; int j;
        String name;
        for(i = 0; i<categories.size();i++){
            num = 0;
            name_pst = categories.get(i);
            for(j = 0; j<data.size();j++){
                name = data.get(j).getName();
                if(name_pst.equals(name)){
                    num += 1;
                }
            }
            System.out.println("r/" + name_pst + " total posts: " + num);
        }
        System.out.println("");
    }

    /**
     * Following method prints out the subreddit name and the number of posts on this subreddit from the 
     * dataset, that use first person singular pronouns, e.g. I, me, mine in it.
     *
     * @param (ArrayList<RedditDataPoint> data) : ArrayList of RedditDataPoint objects
     * @param (ArrayList<String> categories) : array containing all the subreddit names from the dataset
     * @return None
     **/                                     
    public static void printTotalLexLiwcI(ArrayList<RedditDataPoint> data, ArrayList<String> categories) {
        int num;
        double lex_liwc_i;
        String name;
        String name_pst;
        int i; int j;
        for(i = 0; i<categories.size();i++){
            num = 0;
            name_pst = categories.get(i);
            for(j = 0; j<data.size();j++){
                name = data.get(j).getName();
                lex_liwc_i = data.get(j).getLexLiwcI();
                if(lex_liwc_i>0){
                    if(name_pst.equals(name)){
                        num += 1;
                    }
                }
            }
            System.out.println("r/" + name_pst + " total lex_liwc_i: " + num);
        }
        System.out.println("");
    }

    /**
     * Following method prints out the subreddit name and the number of posts on this subreddit from the 
     * dataset, that use first person plural pronouns e.g., we, us, ours in it.
     *
     * @param (ArrayList<RedditDataPoint> data) : ArrayList of RedditDataPoint objects
     * @param (ArrayList<String> categories) : array containing all the subreddit names from the dataset
     * @return None
     **/ 
    public static void printTotalLexLiwcWe(ArrayList<RedditDataPoint> data, ArrayList<String> categories) {
        int num;
        double lex_liwc_we;
        String name;
        String name_pst;
        int i; int j;
        for(i = 0; i<categories.size();i++){
            num = 0;
            name_pst = categories.get(i);
            for(j = 0; j<data.size();j++){
                name = data.get(j).getName();
                lex_liwc_we = data.get(j).getLexLiwcWe();
                if(lex_liwc_we>0){
                    if(name_pst.equals(name)){
                        num += 1;
                    }
                }
            }
            System.out.println("r/" + name_pst + " total lex_liwc_we: " + num);
        }
        System.out.println("");
    }
    
    /**
     * Following method prints out the subreddit name and the number of posts on this subreddit from the 
     * dataset, that use third person singular pronouns e.g. she, he, her, him in it.
     *
     * @param (ArrayList<RedditDataPoint> data) : ArrayList of RedditDataPoint objects
     * @param (ArrayList<String> categories) : array containing all the subreddit names from the dataset
     * @return None
     **/ 
    public static void printTotalLexLiwcShehe(ArrayList<RedditDataPoint> data, ArrayList<String> categories) {
        int num;
        double lex_liwc_shehe;
        String name;
        String name_pst;
        int i; int j;
        for(i = 0; i<categories.size();i++){
            num = 0;
            name_pst = categories.get(i);
            for(j = 0; j<data.size();j++){
                name = data.get(j).getName();
                lex_liwc_shehe = data.get(j).getLexLiwcShehe();
                if(lex_liwc_shehe>0){
                    if(name_pst.equals(name)){
                        num += 1;
                    }
                }
            }
            System.out.println("r/" + name_pst + " total lex_liwc_shehe: " + num);
        }
        System.out.println("");
    }

    /**
     * Following method prints out an ArrayList of RedditDataPoint objects
     * by calling all the print methods that you defined above
     * @param (String args[])
     * @return None
     **/
    public static void main(String args[]) throws IOException {
        ArrayList<String> categories = new ArrayList<>();
        ArrayList<RedditDataPoint> data = readData("Reddit_Data.csv", categories);
        printTotalPosts(data, categories);
        printTotalLexLiwcI(data, categories);
        printTotalLexLiwcWe(data, categories);
        printTotalLexLiwcShehe(data, categories);
    }
}