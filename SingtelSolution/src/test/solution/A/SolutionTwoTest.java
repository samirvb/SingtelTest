package test.solution.A;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.solution.model.bird.Chicken;
import com.solution.model.bird.Duck;

/* JUnit for the question - 
 * 
 * Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
a. A duck says: “Quack, quack”
b. A duck can swim
c. A chicken says: “Cluck, cluck”
d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
 * 
 * */

class SolutionTwoTest
{

    @Test
    void test()
    {
        Duck duck = new Duck();
        assertTrue(duck.sing());
        assertTrue(duck.swim());

        Chicken chicken = new Chicken();
        assertTrue(chicken.sing());
        assertFalse(chicken.fly());
    }

}
