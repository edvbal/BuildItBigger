package com.telesoftas.jokeslib;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class Joker {
    private Joker() {
    }

    private static final List<String> JOKES = Arrays.asList(
            "What do you get when you wake up on a workday and realize you ran out of coffee?\n" +
                    "-\n" +
                    "A depresso.\n" +
                    "\n",
            "Google request: \n" +
                    "\n" +
                    "How to disable autocorrect in wife?\n" +
                    "\n",
            "A man drops his phone on a concrete floor. The phone is fine, no damage. How come?\n" +
                    "-\n" +
                    "He had it on airplane mode.\n" +
                    "\n"
    );

    private static final Random random = new Random();

    public static String getJoke() {
        return JOKES.get(random.nextInt(JOKES.size()));
    }
}
