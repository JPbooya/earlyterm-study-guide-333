import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
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
    // ------- //
    @Test
    void testForLongestStrFewWords() {
        HashMap<String, String> words = new HashMap<>();
        words.put("apple", "fruit");
        words.put("astronaunt", "person");
        words.put("adamsilver", "person");

        String actual = Practice.longestWord(words, 'a');

        assertEquals("adamsilver", actual);
    }

    @Test
    void testForLongestStrNoMatch() {
        HashMap<String, String> words = new HashMap<>();
        words.put("apple", "fruit");
        words.put("astronaunt", "person");
        words.put("adamsilver", "person");

        String actual = Practice.longestWord(words, 'z');

        assertEquals("", actual);
    }

    @Test
    void testForLongestStrNoVals() {
        HashMap<String, String> words = new HashMap<>();


        String actual = Practice.longestWord(words, 'z');

        assertEquals("", actual);
    }
    // ---- // 
    @Test
    void testForCountWordsInBetween() {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cat");
        words.add("bear");

        int actual = Practice.countWords(words, 1, 5);

        assertEquals(2, actual);
    }
    

    // TODO: Make tests for each problem you solve
    
}


