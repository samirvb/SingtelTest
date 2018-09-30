package test.solution.A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.solution.model.bird.Bird;
import com.solution.model.bird.KingFisher;


/*JUnit for the question - 
 * 1. Can you implement the sing() method for the bird?
a. How did you unit test it?
b. How did you optimize the code for maintainability?
 * 
 * 
 * */
class SolutionOneTest
{

    @BeforeEach
    void setUp() throws Exception
    {
    }

    @Test
    void test()
    {
        Bird bird = new KingFisher();
        assertTrue(bird.walk());
        assertTrue(bird.fly());
        assertTrue(bird.sing());
    }

}
