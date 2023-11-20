package FinalExam;

public class counter {

    public int linecount = 0; //
    public int charcount = 0; //
    reader textReader = new reader();
    public counter () {

    }
    public void wordcounter (String counting) {
        charcount += counting.length();
        linecount++;
    }

    public void getCounter (){
        textReader.getTotalLines(linecount);
        textReader.getTotalChar(charcount);
    }

}
