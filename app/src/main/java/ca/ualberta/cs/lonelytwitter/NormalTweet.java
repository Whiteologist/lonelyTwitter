package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by haoming3 on 9/13/17.
 */

public class NormalTweet extends Tweet{
    /**
     * Constructs a NormalTweet object
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a NormalTweet object
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    /**
     * Returns a FALSE on the boolean isImportant
     */
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
