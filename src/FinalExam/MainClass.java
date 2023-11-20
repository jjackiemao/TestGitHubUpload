package FinalExam;

import FinalExamPracticeTool.practiceLongestWordFinder;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write anything to start!");
        System.out.println("To exit type: 'stop'");

        counter textCounter = new counter();
        reader textReader = new reader();
        String longestWord = "";


        int i = -1;
        while (true) {

            i++;
            //System.out.println(i);
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            textCounter.wordcounter(line);
            textReader.setWordArray(line, i);


            String currentLongestWord = longestWordFinder.findLongestWord(line);
            if (currentLongestWord.length() > longestWord.length()) {
                longestWord = currentLongestWord;
            }

        }
        textCounter.getCounter();
        textReader.endResult();
        System.out.println("Longest word: " + longestWord);
        scanner.close();

    }
}