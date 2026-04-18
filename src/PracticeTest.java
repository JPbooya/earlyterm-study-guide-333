import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffSameValues() {
        int[] numbers = {5, 5, 5};
        int actual = Practice.maxDiff(numbers);
        assertEquals(0, actual);
    }

     @Test
    void testMaxDiffSortedValues() {
        int[] numbers = {1, 2, 3, 4, 5};
        int actual = Practice.maxDiff(numbers);
        assertEquals(4, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
}


