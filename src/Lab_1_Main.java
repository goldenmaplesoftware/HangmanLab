import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab_1_Main
{




    ///This is where all the action happens
    public static void main(String[] args)
    {
        ArrayList<Integer> sample = new ArrayList();
        sample.add(29);
        sample.add(28);
        sample.add(2);
        sample.add(0);
        Collections.sort(sample);
        System.out.println(sample);
        String[] wordBank = new String[]{"write", "that", "banana", "hollywood", "tinman"};
        String randomWord = wordBank[(int)(Math.random() * (double)wordBank.length)];
        System.out.println();
        System.out.println("___________________________");
        System.out.println("This word has " + randomWord.length() + " letters.");
        char[] letters = new char[randomWord.length()];
        Arrays.fill(letters, '*');
        System.out.println("****HANG MAN********");
        System.out.println("___________________________");
        System.out.println("JEAN JACOB COMTOIS--- A GAME OF HANGMAN 2021\n");
        System.out.println("Input a letter  to guess the word (lowercase only)");
        Scanner inputLetter = new Scanner(System.in);
    }













}
