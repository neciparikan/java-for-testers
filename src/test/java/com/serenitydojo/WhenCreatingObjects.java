package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_cat(){
        Cat felix = new Cat("Felix", "Tuna", 4);

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavouriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(),4);
      }

    @Test
    public void cat_makes_noise(){
        Cat felix = new Cat("Felix", "Tuna", 4);
        Cat spot = new Cat("Spot", "Salmon", 3);

        felix.makeNoise();
        felix.feed("Tuna");

        felix.groom();
    }

}
