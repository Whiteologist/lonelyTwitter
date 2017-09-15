package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by CBB on 2017/9/15.
 */

public class Sad extends Mood {
    public Sad(String mood){
        super(mood);
    }

    public Sad(String mood, Date date){ super(mood, date);}

    @Override
    public Boolean isHappy(){
        return Boolean.FALSE;
    }
}
