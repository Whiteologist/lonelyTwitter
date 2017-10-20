package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TweetList tweets = new TweetList();
    private Tweet tweet;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        index = intent.getIntExtra("index", 0);
        tweet = tweets.getTweet(index);

        final TextView message = (TextView) findViewById(R.id.tweetText);
        final TextView date = (TextView) findViewById(R.id.dateText);

        message.setText(tweet.getMessage());
        date.setText(tweet.getDate().toString());
    }
}

