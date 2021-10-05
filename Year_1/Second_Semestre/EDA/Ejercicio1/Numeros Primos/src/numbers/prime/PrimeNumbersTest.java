package numbers.prime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumbersTest {

    @Test
    void testGetPrimeNumbersCollection(){
        int[] numbers = {-1,0,1,2,3,4,5,6,7,31,32,89,90};
        int[] expectedPrimes = {2, 3, 5, 7, 31, 89};
        int expectedMax = 89;
        int expectedMin = 2;


        var collection = PrimeNumbers.getPrimeCollection(numbers);

        assertArrayEquals(expectedPrimes, collection.getPrimeNumbers());
        assertEquals(expectedMax, collection.getMax());
        assertEquals(expectedMin, collection.getMin());
    }

    @Test
    void testCollectionWhenNoPrimeNumbers(){
        int[] numbers = {0, 1, 4, 6, 8, 100};
        var collection = PrimeNumbers.getPrimeCollection(numbers);
        assertArrayEquals(new int[0], collection.getPrimeNumbers());
        assertEquals(0, collection.getMax());
        assertEquals(0, collection.getMin());

    }
}
