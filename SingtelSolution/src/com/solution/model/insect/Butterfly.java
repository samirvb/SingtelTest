package com.solution.model.insect;

import com.solution.model.animal.Insect;

public class Butterfly implements Insect
{

    private Insect state;

    public Butterfly(String stateInput)
    {
        if (stateInput.equalsIgnoreCase("butterFlyState"))
        {
            state = new ButterflyState();
        }
        else
        {
            state = new CaterpillarState();
        }
    }

    public boolean fly()
    {
        return state.fly();
    }

    public boolean walk()
    {
        return state.walk();
    }

    public boolean sound()
    {
        return state.sound();
    }

    void transform()
    {
        state = new ButterflyState();
    }

    private class ButterflyState implements Insect
    {

        private ButterflyState()
        {
            System.out.println("Transforming the caterpillar to Butterfly");
        }

        public boolean fly()
        {
            return true;
        }

        public boolean walk()
        {
            return false;
        }

        public boolean sound()
        {
            return false;
        }
    }

    private class CaterpillarState implements Insect
    {

        public boolean fly()
        {
            return false;
        }

        public boolean walk()
        {
            return true;
        }

        public boolean sound()
        {
            return false;
        }

    }
}
