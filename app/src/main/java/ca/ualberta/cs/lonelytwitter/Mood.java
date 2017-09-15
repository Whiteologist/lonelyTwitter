package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by haoming3 on 9/13/17.
 */

public abstract class Mood  {
    private String mood;
    private Date date;

    public Mood(String mood){
        date = new Date();
        this.mood = mood;
    }

    public Mood(String mood, Date date){
        this.date = date;
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
    public Date getDate(){ return date;}
    public abstract Boolean isHappy();
}
