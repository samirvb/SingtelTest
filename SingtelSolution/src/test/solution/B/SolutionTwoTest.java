package test.solution.B;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.solution.model.animal.Fish;
import com.solution.model.fish.ClownFish;
import com.solution.model.fish.Shark;

/* Can you specialize the fish as a Shark and as a Clownfish?
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish
 * 
 *  */
class SolutionTwoTest
{

    @BeforeEach
    void setUp() throws Exception
    {
    }

    @Test
    void test()
    {
        Fish fish = new Shark();
        assertTrue(fish.size());
        assertTrue(fish.colour());

        fish = new ClownFish();
        assertTrue(fish.size());
        assertTrue(fish.colour());
    }

}
