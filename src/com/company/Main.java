package com.company;
import java.util.Scanner;

/*
//while loop version, cur vs prev, index in string
public class Main {

    public static void main(String[] args) {
        int indPos = 0;
        int consecChar = 1;
        char prevChar =('a');
        Scanner textToTranslate = new Scanner(System.in);
        System.out.println("enter some text: ");
        String text = textToTranslate.next();
        System.out.println(textToTranslate);
        int textLength = text.length();
        System.out.println(textLength);
        int loopRunsLeft = textLength;
        //start while loop
        while(loopRunsLeft>0) {
            loopRunsLeft=(loopRunsLeft-1);
            char character = text.charAt(indPos);
            System.out.println(character);
            char currChar = character;
            if (indPos > 0) {
                if (currChar == prevChar) {
                    consecChar = consecChar + 1;
                }
                if (currChar != prevChar){
                    consecChar = 1;
                }
            }
            System.out.print(currChar);
            System.out.print(consecChar);
            consecChar = 1;
            prevChar = character;
            indPos = (indPos+1);
        //end while loop
        }



    }


}
*/
//for loop version, cur vs next, index in array
public class Main {
    public static void main(String[] args) {
        int consecChar = 1;
        int consecCharLengthTally = 0;
        Scanner textToTranslate = new Scanner(System.in);
        System.out.println("enter some text: ");
        String text = textToTranslate.next();
        int textLength = text.length();
        textLength = textLength-1; //adjusts for corect index positions
        System.out.println(textLength);
        char[] textToCompress = new char[text.length()]; //initialises list
        //start for loop
        for (int i = 0; i<textLength; i++){    // int made 0, runs loop if i is less then length of text and adds 1 to i per loop(what i++ does)
            textToCompress[i] = text.charAt(i);  // puts each char in list individually ie aaabbb becomes ['a','a','a','b','b','b']
        }
        //end for loop
        char currChar = textToCompress[0];
        //start for loop
        for (int i = 0; i<textLength; i++) {
            int currIndex = i;
            int nextIndex = i+1;
            currChar = textToCompress[currIndex];
            char nextChar = textToCompress[nextIndex];
            if (currChar == nextChar) {
                consecChar = consecChar + 1;
            }
            else {
                System.out.print(currChar);
                System.out.print(consecChar);
                int consecCharLength = String.valueOf(consecChar).length();
                consecCharLengthTally = (consecCharLengthTally + consecChar);
                consecChar = 1;
                }
            }
        //end for loop
        int finalTextLength = (consecCharLengthTally+1);
        //check for characters saved not saved or gained
        System.out.println(":");
        if (finalTextLength < textLength) {
            int charactersSaved = (textLength-finalTextLength);
            System.out.println("well done you saved " + (charactersSaved) + " characters");
        }
        if (finalTextLength == textLength) {
            System.out.println("you saved nothing, absolutely nothing....");
        }
        if (finalTextLength > textLength) {
            int charactersGained = (finalTextLength - textLength);
            System.out.println("RLW was useless you gained " + (charactersGained) + " characters!!! unless you wanted that...");
        }

    }
}