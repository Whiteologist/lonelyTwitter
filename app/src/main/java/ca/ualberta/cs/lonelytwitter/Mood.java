package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by haoming3 on 9/13/17.
 */

public abstract class Mood  {
    private String mood;
    private Date date;

    /**
     * Constructs a Mood object
     * @param mood
     */
    public Mood(String mood){
        date = new Date();
        this.mood = mood;
    }

    /**
     * Constructs a Mood object
     * @param mood
     * @param date
     */
    public Mood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    /**
     * Gets the tweet mood.
     * @return
     */
    public String getMood(){
        return mood;
    }

    /**
     * Gets the current date.
     * @return
     */
    public Date getDate(){ return date;}

    /**
     * Decide the mood is happy or not
     * @return
     */
    public abstract Boolean isHappy();
}
