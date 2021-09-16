package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner textToTranslate = new Scanner(System.in);
        System.out.println("enter some text: ");
        String text = textToTranslate.next();
        System.out.println(textToTranslate);
        int textLength = text.length();
        System.out.println(textLength);
        int loopRunsLeft = textLength;
        while(loopRunsLeft>0) {
            loopRunsLeft=(loopRunsLeft-1);
            
            }


        }
    }

