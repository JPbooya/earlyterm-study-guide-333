import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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











    // ---- // 
    @Test
    void testForDifOddEvenNums() {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(3);
        intSet.add(5);
        intSet.add(7);
        int actual = Practice.countDifNums(intSet);
        assertEquals(4, actual);
    }

    @Test
    void testForEvenNums() {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(4);
        intSet.add(6);
        intSet.add(8);
        int actual = Practice.countDifNums(intSet);
        assertEquals(4, actual);
    }
    
     @Test
    void testForMixNums() {
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(4);
        intSet.add(6);
        intSet.add(7);
        intSet.add(9);
        int actual = Practice.countDifNums(intSet);
        assertEquals(0, actual);
    }

    // ----- // 

    @Test 
    void testForsecondLargestNum() {
        HashMap<String, Integer>intMap = new HashMap<>();
        intMap.put("curry", 8);
        intMap.put("lebron", 23);
        intMap.put("adamsilver", 13);
        intMap.put("durant", 12);
        int actual = Practice.secondLargestNum(intMap);
        assertEquals(13, actual);
    }

     @Test 
    void testForTwoNumsOnly() {
        HashMap<String, Integer>intMap = new HashMap<>();
        intMap.put("curry", 8);
        intMap.put("lebron", 23);
        int actual = Practice.secondLargestNum(intMap);
        assertEquals(8, actual);
    }

     @Test 
    void testForAllSameNums() {
        HashMap<String, Integer>intMap = new HashMap<>();
        intMap.put("curry", 5);
        intMap.put("lebron", 5);
        intMap.put("curry", 5);
        intMap.put("lebron", 5);
        intMap.put("curry", 5);
        intMap.put("lebron", 5);
        int actual = Practice.secondLargestNum(intMap);
        assertEquals(5, actual);
    }

    // TODO: Make tests for each problem you solve
    
}


