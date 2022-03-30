import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 * RedditDataPoint class
 * @author: Devanshi Jain
 * Date: February 28, 2021
 **/

public class RedditDataPoint {

    private String name = "";
    private String text = "";
    private double lex_liwc_i = 0.0;
    private double lex_liwc_we = 0.0;
    private double lex_liwc_shehe = 0.0;

    /**
     * Following constructor method initializes name, text and all lexical scores of a subreddit post.
     * @param (String name) : name of a subreddit from the dataset
     * @param (String text) : text of a subreddit post from the dataset
     * @param (double lex_liwc_i) : a lexical score of pronoun I in a post
     * @param (double lex_liwc_we) : a lexical score of pronoun we in a post
     * @param (double lex_liwc_shehe) : a lexical score of pronoun she/he in a post
     * @return None
     **/
    public RedditDataPoint(String name, String text, double lex_liwc_i, double lex_liwc_we, double lex_liwc_shehe) {
        this.name = name;
        this.text = text;
        this.lex_liwc_i = lex_liwc_i;
        this.lex_liwc_we = lex_liwc_we;
        this.lex_liwc_shehe = lex_liwc_shehe;
    }

    /**
     * A Getter method to return the name as stored in the RedditDataPoint object
     * @return (this.name)
     **/
    public String getName(){
        return this.name; // Change this value to return the correct value
    }

    /**
     * A Getter method to return the text as stored in the RedditDataPoint object
     * @return (this.text)
     **/
    public String getText(){
        return this.text; // Change this value to return the correct value
    }

    /**
     * A Getter method to return the lex_liwc_i as stored in the RedditDataPoint object
     * @return (this.lex_liwc_i)
     **/
    public double getLexLiwcI() {
        return this.lex_liwc_i; // Change this value to return the correct value
    }

    /**
     * A Getter method to return the lex_liwc_we as stored in the RedditDataPoint object
     * @return (this.lex_liwc_we)
     **/
    public double getLexLiwcWe() {
        return this.lex_liwc_we; // Change this value to return the correct value
    }

    /**
     * A Getter method to return the lex_liwc_shehe as stored in the RedditDataPoint object
     * @return (this.lex_liwc_shehe)
     **/
    public double getLexLiwcShehe() {
        return this.lex_liwc_shehe; // Change this value to return the correct values
    }
}