package com.solution.model.bird;

public class Duck extends Bird
{

    @Override
    public boolean fly()
    {
        // Assuming Duck cannot fly , hence returning false
        return false;
    }

    @Override
    public boolean sing()
    {
        System.out.println("Duck Saying - Quack,Quack");
        return true;
    }

    public boolean swim()
    {
        System.out.println("Duck Swmming");
        return true;
    }

}
