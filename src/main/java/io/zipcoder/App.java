package io.zipcoder;

/**
 * Created by roberthitchens3 on 1/22/16.
 */
import java.util.Scanner;
import java.util.Arrays;
public class App {
    private char[] startLetters;
    private String[] wordCollection;

    public static void main(String[] args){
        App app = new App();
        app.start(null);
        System.out.println(Arrays.toString(app.getWordCollection()));
    }
    public void start(String[] source){//assuming string array as user input
       int length;
        if(source == null) {//user input without junit tests
           startLetters = promptUserForString("please enter a sequence of characters: ").toCharArray();
           length = promptUserForInt("Please enter the number of words: ");
           wordCollection = new String[length];
            collectionGenerator();
       }else{//using junit to perform tests.
           startLetters = source[0].toCharArray();
           length = Integer.parseInt(source[1]);
           wordCollection = new String[length];
            collectionGenerator();
       }
    }
    public String promptUserForString(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String user_in = input.next();
        return user_in;
    }
    public int promptUserForInt(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        int collectionSize = input.nextInt();
        return collectionSize;
    }
    private void collectionGenerator(){
        RandomWordGenerator randWord = new RandomWordGenerator();
        for(int i =0; i<wordCollection.length; i++){
            wordCollection[i] = randWord.makeWord(startLetters[i%startLetters.length]);
        }

    }
    public String[] getWordCollection(){
        return wordCollection;
    }
}
