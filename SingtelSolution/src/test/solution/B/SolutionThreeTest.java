package test.solution.B;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.solution.model.animal.Dolphin;

/*
 * 3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class?
b. How do you avoid duplicating code or introducing unneeded overhead?
 * 
 * */
class SolutionThreeTest
{

    @Test
    void test()
    {
        Dolphin dolphin = new Dolphin();
        assertTrue(dolphin.swim());
    }

}
