package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by CBB on 2017/9/15.
 */

public class Sad extends Mood {
    /**
     * Constructs a Sad object
     * @param mood
     */
    public Sad(String mood){
        super(mood);
    }

    /**
     * Constructs a Sad object
     * @param mood
     * @param date
     */
    public Sad(String mood, Date date){ super(mood, date);}

    @Override
    /**
     * Returns a FALSE on the boolean isHappy
     */
    public Boolean isHappy(){
        return Boolean.FALSE;
    }
}
