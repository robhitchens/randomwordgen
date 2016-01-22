package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/22/16.
 */
public class RandomWordGenerator {
    public static String makeWord(char input){
        String wordToReturn = input+"";
        int randomLength = (int)(Math.random() *10);
        for(int i =0; i<randomLength; i++){
            int randLetterValue = (int)(Math.random()*26)+'a';
            char randomChar = (char)randLetterValue;
            wordToReturn+= randomChar;
        }

            return wordToReturn;
    }
}
