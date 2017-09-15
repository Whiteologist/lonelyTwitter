package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by CBB on 2017/9/15.
 */

public class Happy extends Mood {
    public Happy(String mood){ super(mood);}

    public Happy(String mood, Date date){ super(mood, date);}

    @Override
    public Boolean isHappy(){
        return Boolean.TRUE;
    }
}
