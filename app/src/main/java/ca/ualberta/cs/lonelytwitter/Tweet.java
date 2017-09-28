/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms of conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact contact@abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet implements Tweetable {

    /*
     *  the tweet object
     */
    private String message;
    private Date date;

    /**
     * Constucts a Tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Gets the tweet message.
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Decide the tweet is important or not
     *
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Gets the current date
     *
     * @return
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets the current date
     * @param date
     */
    public void setDate(Date date) { this.date = date; }

    @Override
    /**
     * Returns a string of the message
     */
    public String toString(){
        return date.toString() + "\n" + message;
    }
}
