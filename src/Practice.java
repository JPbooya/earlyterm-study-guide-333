import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int smallestNum = nums[0];
        int biggestNum = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > biggestNum ) {
                biggestNum = nums[i];
            }
            if(nums[i] < smallestNum) {
            smallestNum = nums[i];
            }
        }
        return biggestNum - smallestNum;
    }

    public static String longestWord(HashMap<String, String> words, char letter) {
        String longestStr = "";
        for(String word : words.keySet()) {
            if(word.startsWith(String.valueOf(letter)) 
            &&
            word.length() > longestStr.length()) {
            longestStr = word;
            }
        }
        return longestStr;
    }

    public static int countWords (ArrayList<String> wordLists, int n, int m) {
        int count = 0;
        for(int i = 0; i < wordLists.size(); i++) {
            if(wordLists.get(i).length() > n 
            && 
            wordLists.get(i).length() < m) {
                count++;
            }
        }
        return count;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
