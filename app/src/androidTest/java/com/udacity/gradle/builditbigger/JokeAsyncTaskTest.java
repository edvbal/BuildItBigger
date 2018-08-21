package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokeAsyncTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testNonEmptyString() {
        Context applicationContext = activityRule.getActivity().getApplicationContext();
        JokeAsyncTask asyncTask = new JokeAsyncTask(applicationContext);

        asyncTask.execute();
        String result = null;
        try {
            result = asyncTask.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }
}
