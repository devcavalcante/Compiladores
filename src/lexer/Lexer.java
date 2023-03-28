package lexer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Lexer {
    private static final char EOF_CHAR = (char) -1;
    private static int line = 1;
    private BufferedReader reader;
    private char peek;

    public Lexer(File file){
        try{
            this.reader = new BufferedReader(new FileReader(file));
        }catch(Exception e){
            e.printStackTrace();
        }
        this.peek = ' ';
    }
}
