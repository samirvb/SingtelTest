package test.solution.D;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
/* JUnit for the question - 
 * 1. Can you model a butterfly?
a. A butterfly can fly
b. A butterfly does not make a sound
 * 
 * */

import com.solution.model.insect.Butterfly;

class SolutionOneTest
{

    @Test
    void test()
    {
        Butterfly butterFly = new Butterfly("butterFlyState");
        assertTrue(butterFly.fly());
        assertFalse(butterFly.sound());
    }

}
