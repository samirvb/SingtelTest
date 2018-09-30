package com.solution.model.fish;

import com.solution.model.animal.Fish;

public class Shark implements Fish
{

    @Override
    public boolean swim()
    {
        System.out.println("Shark Swimming");
        return true;
    }

    @Override
    public boolean colour()
    {
        System.out.println("Shark Colour is Grey");
        return true;
    }

    @Override
    public boolean size()
    {
        System.out.println("Shark is Large Size");
        return true;
    }

    @Override
    public boolean eat()
    {
        System.out.println("Shark eats other fish");
        return false;
    }

}
