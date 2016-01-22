package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/22/16.
 */
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppSpec {

    App appTest = new App();
    /*@Test
    public void testUserPromptString(){
        String strTest = appTest.promptUserForString("y");
        assertNotNull("promptUserForString should not return null", strTest);

    }
    @Test
    public void testUserPromptInt(){
        int intTest = appTest.promptUserForInt("");
        assertNotNull("promptUserForInt should not return null", intTest);
    }*/
    @Test
    public void testStart(){
        String[] input = {"abcde", "24"};
        appTest.start(input);
        System.out.println(Arrays.toString(appTest.getWordCollection()));
        assertNotNull("the word collection should not be null", appTest.getWordCollection());

    }
}
