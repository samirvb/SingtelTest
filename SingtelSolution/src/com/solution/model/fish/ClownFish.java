package com.solution.model.fish;

import com.solution.model.animal.Fish;

public class ClownFish implements Fish
{

    @Override
    public boolean swim()
    {
        System.out.println("ClownFish Swimming");
        return true;
    }

    @Override
    public boolean colour()
    {
        System.out.println("ClownFish is Orange in Colour");
        return true;
    }

    @Override
    public boolean size()
    {
        System.out.println("ClownFish is Small Size");
        return true;
    }

    @Override
    public boolean eat()
    {
        System.out.println("ClownFish eats plants");
        return true;
    }

    // Custom method specific to ClownFish
    public boolean makesJokes()
    {
        System.out.println("ClownFish making Jokes");
        return true;
    }
}
