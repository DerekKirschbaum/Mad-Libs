/*
1.2 Mad Libs Project

Author: Evan A. and Derek K.
Date: Sept. 22, 2022
Course: APCSA

Description: 
Writes a program that incorporates the Java concepts we have learned to allow a user to create a unique story.
*/

//Imports the Scanner for User Input, then sets class and sets a main method
import java.util.Scanner;
public class Madlib{
    public static void main(String[]args){
        //Actually sets the scanner to a variable to be used later when called
        Scanner scan = new Scanner(System.in);
        //The original madLib story board
        String madLib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        
        //A while loop that for every < in the code runs through and changs the <part of speech> to what you input
        while(madLib.indexOf("<") != -1){
            int firstIndex = madLib.indexOf("<");
            int secondIndex = madLib.indexOf(">");
            System.out.println("Enter a " + madLib.substring(firstIndex + 1, secondIndex) + ":");
            String word1 = scan.nextLine();
            madLib = madLib.replaceFirst(madLib.substring(firstIndex, secondIndex + 1), word1);
        }
        //Prints final madLib
        System.out.println(madLib);
        System.out.println("End of Story 1\n");

        //The original madLib story board
        madLib = "I love eating <plural_noun>, today I <adverb> ate a <noun>.";
        
        //A while loop that for every < in the code runs through and changs the <part of speech> to what you input
        while(madLib.indexOf("<") != -1){
            int firstIndex = madLib.indexOf("<");
            int secondIndex = madLib.indexOf(">");
            System.out.println("Enter a " + madLib.substring(firstIndex + 1, secondIndex) + ":");
            String word1 = scan.nextLine();
            madLib = madLib.replaceFirst(madLib.substring(firstIndex, secondIndex + 1), word1);
        }
        //Prints final madLib
        System.out.println(madLib);
        System.out.println("End of Story 2\n");

        //The original madLib story board
        madLib = "I enjoy <verb ending in -ing> with a <noun> because it is so <adjective>.";
        
        //A while loop that for every < in the code runs through and changs the <part of speech> to what you input
        while(madLib.indexOf("<") != -1){
            int firstIndex = madLib.indexOf("<");
            int secondIndex = madLib.indexOf(">");
            System.out.println("Enter a " + madLib.substring(firstIndex + 1, secondIndex) + ":");
            String word1 = scan.nextLine();
            madLib = madLib.replaceFirst(madLib.substring(firstIndex, secondIndex + 1), word1);
        }
        //Prints final madLib
        System.out.println(madLib);
        System.out.println("End of Story 3\n");
        scan.close();
    }
}