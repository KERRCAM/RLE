package com.company;
import java.util.Scanner;
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
            //rle print code to go here.
            prevChar = character;
            indPos = (indPos+1);
        }



    }


}


