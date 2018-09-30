package com.solution.model.bird;

import com.solution.model.animal.Animal;

public abstract class Bird implements Animal
{

    public boolean walk()
    {
        System.out.println("I am walking");
        return true;
    }

    public abstract boolean fly();

    public abstract boolean sing();
}
