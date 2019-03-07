package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null)
            return Collections.emptyList();

        ArrayList<String> tailsList = new ArrayList<>();
        for (int i = 0; i <= value.length(); i++) {
            tailsList.add(value.substring(i));
        }
        return tailsList;
    }

}
