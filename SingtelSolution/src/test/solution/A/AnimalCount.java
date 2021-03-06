package test.solution.A;

import com.solution.model.animal.Animal;
import com.solution.model.animal.Dolphin;
import com.solution.model.animal.Fish;
import com.solution.model.animal.Insect;
import com.solution.model.bird.Bird;
import com.solution.model.bird.Chicken;
import com.solution.model.bird.Duck;
import com.solution.model.bird.KingFisher;
import com.solution.model.bird.Parrot;
import com.solution.model.bird.Rooster;
import com.solution.model.fish.ClownFish;
import com.solution.model.fish.Shark;
import com.solution.model.insect.Butterfly;

public class AnimalCount
{

    public static void main(String[] args)
    {
        Animal[] animals = new Animal[] { new Duck(), new Chicken(),
                new Rooster(), new Parrot(), new Shark(), new ClownFish(),
                new Dolphin(), new Butterfly("caterpillarState"),
                new KingFisher()};
        int flyCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int swimCount = 0;
        for (int i = 0; i < animals.length; i++)
        {
            // Find out the count of animals which can fly
            if (animals[i] instanceof Insect)
            {
                Insect insect = (Insect) animals[i];
                if (insect.fly())
                {
                    flyCount++;
                }
                if (insect.walk())
                {
                    walkCount++;
                }
            }
            else if (animals[i] instanceof Bird)
            {
                Bird bird = (Bird) animals[i];
                if (bird.fly())
                {
                    flyCount++;
                }
                if (bird.sing())
                {
                    singCount++;
                }
                if (bird.walk())
                {
                    walkCount++;
                }
                if (bird instanceof Duck)
                {
                    if (((Duck) bird).swim())
                    {
                        swimCount++;
                    }
                }
            }
            else if (animals[i] instanceof Fish)
            {
                Fish fish = (Fish) animals[i];
                if (fish.swim())
                {
                    swimCount++;
                }
            }

            // Special Condition for Dolphin since it doesn't implement the Fish
            // Interface
            else if (animals[i] instanceof Dolphin)
            {
                Dolphin dolphin = (Dolphin) animals[i];
                if (dolphin.swim())
                {
                    swimCount++;
                }
            }

        }
        System.out.println("All Counts");
        System.out.println("Animals which can fly : " + flyCount);
        System.out.println("Animals which can walk : " + walkCount);
        System.out.println("Animals which can sing : " + singCount);
        System.out.println("Animals which can swim : " + swimCount);

    }

}
