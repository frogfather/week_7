package com.example.user.wordcount;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class TestWordCount {
    Wordcount wordcount;
    @Before
    public void Before(){
        this.wordcount = new Wordcount();
        }

    @Test
    public void testSplitString(){
        wordcount.splitString("The rain in spain falls mainly on the plain");
        String[] result = wordcount.getArray();
        assertEquals(9,result.length);
    }

    @Test
    public void testHashMap(){
        wordcount.splitString("a short short string");
        String[] result = wordcount.getArray();
        wordcount.makeHashMap(result);
        String resultString = wordcount.getWordDistribution();
        assertEquals("a: 1 string: 1 short: 2 ",resultString);
    }
}
