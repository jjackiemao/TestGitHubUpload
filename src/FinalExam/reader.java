package FinalExam;

public class reader {

    private static int totalLines = 0;
    private static int totalChar = 0;
    private static String[] words = new String[100];
    public reader () {

    }

    public static void setWordArray(String input, int pos){
        int o = pos;
        words[o] = input;
    }

    public static void getTotalLines(int getTotalLines) {
        totalLines = getTotalLines;
        System.out.println("Total lines: " + totalLines);
    }
    public static void getTotalChar(int getTotalChar) {
        totalChar = getTotalChar;
        System.out.println("Total characters: " + totalChar);
    }

    public static void endResult() {
        for (int i = 0; words[i]!=null ;i++){

                System.out.println(words[i]);
            }
        }
    }
