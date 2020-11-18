package com.hz;

import java.util.Arrays;

public class MainAdapterImp {

    @Override
    public boolean equals(Object obj) {
        String[] yesValues = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        return Arrays.asList(yesValues).contains(this);
    }
}
