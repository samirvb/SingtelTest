package com.solution.model.bird;

public class Chicken extends Bird
{

    private Rooster rooster = new Rooster();

    @Override
    public boolean fly()
    {
        // Returning false since Chicken cannot fly
        return false;
    }

    @Override
    public boolean sing()
    {
        if (this instanceof Chicken)
        {
            System.out.println("Chicken says Cluck,cluck");
            return true;
        }
        else
        {
            rooster.sing();
            return true;
        }
    }

}
