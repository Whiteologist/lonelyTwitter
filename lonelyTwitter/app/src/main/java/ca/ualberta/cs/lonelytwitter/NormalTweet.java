package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by haoming3 on 9/13/17.
 */

public class NormalTweet extends Tweet{
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
