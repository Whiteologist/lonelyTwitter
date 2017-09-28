package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by haoming3 on 9/13/17.
 */

public class ImportantTweet extends Tweet {
    /**
     * Constructs an ImportantTweet object
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs an ImportantTweet object
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    /**
     * Returns a TRUE on the boolean isImportant
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
