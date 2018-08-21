package com.telesoftas.androidjokelib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public static final String KEY_JOKE = "key.joke";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        String joke = getIntent().getStringExtra(KEY_JOKE);
        TextView jokeText = findViewById(R.id.jokeTextView);
        jokeText.setText(joke);
    }
}
