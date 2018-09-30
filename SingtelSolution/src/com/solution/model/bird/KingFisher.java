package com.solution.model.bird;

public class KingFisher extends Bird
{

    @Override
    public boolean fly()
    {
        System.out.println("KingFisher Flying");
        return true;

    }

    @Override
    public boolean sing()
    {
        System.out.println("KingFisher Singing");
        return true;
    }

}
