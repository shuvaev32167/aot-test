package com.github.shuvaev;

import static com.github.demidko.aot.WordformMeaning.lookupForMeanings;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        var meanings = lookupForMeanings("люди");
        out.println(meanings.size());
        /* 1 */

        out.println(meanings.get(0).getMorphology());
        /* [С, мр, им, мн] */

        out.println(meanings.get(0).getLemma());
        /* человек */

        for (var t : meanings.get(0).getTransformations()) {
            out.println(t.toString() + " " + t.getMorphology());
        }
    }
}