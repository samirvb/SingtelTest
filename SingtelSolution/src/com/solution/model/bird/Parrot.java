package com.solution.model.bird;

public class Parrot extends Bird
{

    @Override
    public boolean fly()
    {
        System.out.println("Parrot Flying");
        return true;
    }

    // Default Sing Method for Parrots

    @Override
    public boolean sing()
    {
        System.out.println("Parrot Singing");
        return true;
    }

    // Overloaded sing method
    public boolean sing(String typeOfParrot)
    {
        if (typeOfParrot.equals("houseWithDogs"))
        {
            System.out.println("Woof Woof");
        }
        else if (typeOfParrot.equals("houseWithCats"))
        {
            System.out.println("Meow");
        }
        else if (typeOfParrot.equals("farmParrot"))
        {
            System.out.println("Cock-a-doodle-doo");
        }

        // If there are more parrots in the future like parrot near a duck more
        // statements need to be added here.
        return true;
    }
}
