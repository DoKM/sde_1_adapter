package com.hz;
import java.util.List;
import java.util.Arrays;

public class Adapter {
    public boolean contains(String answer) {

        String[] positiveAnswers = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
//
        return Arrays.asList(positiveAnswers).contains(answer);


    }
}