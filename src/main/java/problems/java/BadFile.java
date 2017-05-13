package problems.java;

public class BadFile {

    public void open(){
        throw new RuntimeException("exception while opening file");
    }

    public void close(){
        throw new RuntimeException("exception while closing file");
    }


}
