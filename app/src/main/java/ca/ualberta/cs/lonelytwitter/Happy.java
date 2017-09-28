package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by CBB on 2017/9/15.
 */

public class Happy extends Mood {
    /**
     * Constructs a Happy object
     * @param mood
     */
    public Happy(String mood){ super(mood);}

    /**
     * Constructs a Happy object
     * @param mood
     * @param date
     */
    public Happy(String mood, Date date){ super(mood, date);}

    @Override
    /**
     * Returns a TRUE on the boolean isHappy
     */
    public Boolean isHappy(){
        return Boolean.TRUE;
    }
}
