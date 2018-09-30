package test.solution.A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.solution.model.bird.Bird;
import com.solution.model.bird.Parrot;

/* JUnit for the question - 
 * Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently?
 * 
 * */
class SolutionFourTest
{

    @Test
    void test()
    {
        Parrot parrot = new Parrot();
        assertTrue(parrot.sing("houseWithDogs"));
        assertTrue(parrot.sing("houseWithCats"));
        assertTrue(parrot.sing("farmParrot"));
        
    }

}
