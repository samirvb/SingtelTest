package com.solution.model.bird;

public class Rooster extends Bird
{

    @Override
    public boolean fly()
    {
        // Assuming Rooster cannot fly , hence returning false
        return false;
    }

    @Override
    public boolean sing()
    {
        System.out.println("Rooster says : Cock-a-doodle-doo");
        return true;
    }

}
