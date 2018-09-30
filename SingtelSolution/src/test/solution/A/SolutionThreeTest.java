package test.solution.A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.solution.model.bird.Bird;
import com.solution.model.bird.Rooster;

/* JUnit for the question - 
 * Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo”
b. How is the rooster related to the chicken?
c. Can you think of other ways to model a rooster without using inheritance?
 * */
class SolutionThreeTest
{

    @Test
    void test()
    {
        Bird rooster = new Rooster();
        assertTrue(rooster.sing());

    }

}
