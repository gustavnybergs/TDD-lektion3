package com.gustavnybergs.parprogrammering.compliments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomCompliment {

    private List<String> compliments;

    public RandomCompliment(List<String> compliments) {
        compliments = new ArrayList<>();
        compliments.add("You look nice today");
        compliments.add("Your hair is nice");
        compliments.add("You smell good today");
        compliments.add("You did good today");
    }

    public String generateCompliment() {
        Random random = new Random();

        int index = random.nextInt(compliments.size());

        return compliments.get(index);
    }

    public void addCompliment(String compliment) {
        compliments.add(compliment);
    }


}
