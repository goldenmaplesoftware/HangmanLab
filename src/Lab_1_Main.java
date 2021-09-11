import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab_1_Main
{
    public static void wrongGuess1()
    {
        System.out.println("-----------|---------");
        System.out.println("       ___ |        |");
        System.out.println("     _[___]|        |");
        System.out.println("       ( ) |        |");
        System.out.println("        |--|        |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("____________________|");
        System.out.println("You have 5 more attempts");
    }

    public static void wrongGuess2()
    {
        System.out.println("-----------|---------");
        System.out.println("       ___ |        |");
        System.out.println("     _[___]|        |");
        System.out.println("       ( ) |        |");
        System.out.println("        |--|        |");
        System.out.println("        |           |");
        System.out.println("        |           |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("____________________|");
        System.out.println("You have 4 more attempts");
    }

    public static void wrongGuess3()
    {
        System.out.println("-----------|---------");
        System.out.println("       ___ |        |");
        System.out.println("     _[___]|        |");
        System.out.println("       ( ) |        |");
        System.out.println("        |--|        |");
        System.out.println("     l--|           |");
        System.out.println("        |           |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("____________________|");
        System.out.println("You have 3 more attempts");
    }

    public static void wrongGuess4()
    {
        System.out.println("------------|--------");
        System.out.println("       ___  |       |");
        System.out.println("     _[___] |       |");
        System.out.println("       (..) |       |");
        System.out.println("        |--|        |");
        System.out.println("     l--|--l        |");
        System.out.println("        |           |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("                    |");
        System.out.println("____________________|");
        System.out.println("You have 2 more attempts");
    }

    public static void wrongGuess5()
    {
        System.out.println("-----------|---------");
        System.out.println("       ___ |        |");
        System.out.println("     _[___]|        |");
        System.out.println("       (oo)|        |");
        System.out.println("        |--|        |");
        System.out.println("     l--|--l        |");
        System.out.println("        |           |");
        System.out.println("       /            |");
        System.out.println("      <             |");
        System.out.println("                    |");
        System.out.println("____________________|");
        System.out.println("You have 1 more attempt");
    }

    public static void wrongGuess6()
    {
        System.out.println("------------|--------");
        System.out.println("       ___  |       |");
        System.out.println("     _[___] |       |");
        System.out.println("       (xx) |       |");
        System.out.println("        |---|       |");
        System.out.println("     l--|--l        |");
        System.out.println("        |           |");
        System.out.println("       / l          |");
        System.out.println("      <   >         |");
        System.out.println("                    |");
        System.out.println("____________________|");
        System.out.println("You lose.  Game Over.");
        System.exit(0);
    }

    public static void Winning()
    {
        System.out.println("CONGRATS YOU GUESSED THE WORD PROPERLY,  I GUESS OUR LITTLE BUDDY GETS TO GO FREE! ");
        System.out.println("-----------|---------");
        System.out.println("                    |");
        System.out.println("       ___          |");
        System.out.println("     _[___]         |");
        System.out.println("       ('')         |");
        System.out.println("    L   |   L       |");
        System.out.println("     l--|---L       |");
        System.out.println("        |           |");
        System.out.println("       / l          |");
        System.out.println("      <   >         |");
        System.out.println("____________________|");
        System.exit(0);
    }

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
