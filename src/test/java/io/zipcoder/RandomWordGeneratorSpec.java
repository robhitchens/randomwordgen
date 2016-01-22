package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/22/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class RandomWordGeneratorSpec {

    RandomWordGenerator rwg = new RandomWordGenerator();
    char inputLetter = 'a';
    String testWord = rwg.makeWord(inputLetter);
    @Test
    public void makeWordTest(){

        assertNotNull("test failed: String is null", testWord);
        assertEquals("test failed first letter is not the same", inputLetter, testWord.charAt(0));


    }
    @Test
    public void testEachCharacter(){
        for ( int x =1; x< testWord.length();x++ ){
            assertTrue("character value beyond range", testWord.charAt(x) >='a' && testWord.charAt(x) <= 'z');
        }
    }
    @Test
    public void testExpectedLength(){
        assertTrue("length is beyond range: ", testWord.length()>=1 && testWord.length()<=10);
    }

}
