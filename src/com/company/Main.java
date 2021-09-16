package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int indPos = 0;
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

            indPos = (indPos+1);


            }


        }
    }

