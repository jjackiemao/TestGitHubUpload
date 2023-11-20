package FinalExam;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestClass {

    @Test
    public void testGetCounter() {
        counter testCounter = new counter();

        System.out.println("Start of Counter Test");

        testCounter.wordcounter("Testing word counter");
        testCounter.wordcounter("Testing line counter");


        int expectedChar = 40;
        int expectedLine = 2;
        int actualChar = testCounter.charcount;
        int actualLine = testCounter.linecount;

        assertEquals(expectedChar,actualChar, 4);
        assertEquals(expectedLine,actualLine, 5);


        System.out.println("Characters: " + actualChar);
        System.out.println("Lines: " + actualLine);

        System.out.println("End");
        System.out.println("                      ");




    }

    @Test
    public void testReader() {

        System.out.println("Start of Reader Test");
        reader testReader = new reader();
        reader.setWordArray("'Testing reader 123'", 0);
        reader.setWordArray("'Reader tested 321'", 1);

        reader.endResult();

        System.out.println("End");
        System.out.println("                   ");

    }



    @Test
    public void testMainClass () {
        MainClass testMainClass = new MainClass();

            counter testCounter = new counter();
            reader testReader = new reader();

            String testLine = "'Testing main class counter + reader'";
            String testLine2 = "'Please work'";

        System.out.println("Start of Main Test  ");

            testCounter.wordcounter(testLine);
            testCounter.wordcounter(testLine2);
            testCounter.getCounter();



            testReader.setWordArray(testLine, 0);
            testReader.setWordArray(testLine2, 1);
            testReader.endResult();

        System.out.println("End  ");
        System.out.println("                    ");


        }

        @Test
    public void TestLongestWord () {
        System.out.println("Start of longest word test");
            String TestSentence = "Hitta det längsta ordet Supercalifragilisticexpialidocious eller Floccinaucinihilipilification";
            String result = longestWordFinder.findLongestWord(TestSentence);
            System.out.println("Test sentence: " + TestSentence);
            System.out.println("Longest word in sentence is: " + result);
        System.out.println("End");
            System.out.println("                    ");


        }


}
