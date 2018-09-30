package test.solution.D;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * JUnit for question - 
 * Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)

 * 
 * */

import com.solution.model.insect.Butterfly;

/* JUnit for question - 
 * Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)

 * 
 * */

class SolutionTwoTest
{

    @Test
    void test()
    {
        Butterfly butterFly = new Butterfly("caterpillarState");
        assertFalse(butterFly.fly());
        assertTrue(butterFly.walk());
    }

}
