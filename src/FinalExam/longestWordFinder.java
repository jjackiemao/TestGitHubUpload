package FinalExam;

public class longestWordFinder {
    public static String findLongestWord(String input) {
        String[] words = input.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }  

        return longestWord;
    }
}
