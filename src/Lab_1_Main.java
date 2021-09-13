import java.io.File;
import java.io.FileNotFoundException;
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


    public static String[] readStringContentFromFile(String file)
    {

        ///Create and populate the array from the file

        int lines=0;
        try
        {
            Scanner inputFileContentRead=new Scanner(new File(file));  ///Content to be read
            while (inputFileContentRead.hasNextLine()) ///How many elements are in the file/lines (one word per line)
            {
                lines++; ///Itterates based on the lines in the text file
                inputFileContentRead.next(); ///Breaks the infinite loop
            }

            String[] wordBank=new String[lines]; ///This is the word bank that gets retrieved

            Scanner inputFileContentWrite=new Scanner(new File(file));  ///Writes the content from the text file

            for (int i=0;i<lines;i++) ///writing loop
            {
                wordBank[i]=inputFileContentWrite.next();
            }

            return wordBank;

        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found ERROR!");
        }
        return null;


    }

    ///GAME 1
    public static void GameControl_Topic_1()
    {
        ArrayList<Integer> sample = new ArrayList();
        sample.add(29);
        sample.add(28);
        sample.add(2);
        sample.add(0);
        Collections.sort(sample);

        String filePath="src/WordListMcDonalds.txt";  ///Note when reading the files there CANNOT BE BLANKSPACES!!!!!

        String[] wordBank = readStringContentFromFile(filePath); ///Only line that changes based on the game mode selected


        assert wordBank != null;
        /* DEBUGGING FEATURE TO MAKE SURE THE WORD BANKS ARE WORKING
        for (String s : wordBank)
        {
            System.out.println(s);
        }
        */
        String randomWord = wordBank[(int)(Math.random() * (double)wordBank.length)];
        System.out.println();
        System.out.println("___________________________");
        System.out.println("This word has " + randomWord.length() + " letters.");
        char[] letters = new char[randomWord.length()];
        Arrays.fill(letters, '*');
        System.out.println("___________________________");
        System.out.println("Input a letter  to guess the word (lowercase only)");
        Scanner inputLetter = new Scanner(System.in);

        boolean wonGame = false;
        int mistakes = 6;

        while(mistakes > 0) {
            System.out.println("Input: ");
            String input = inputLetter.nextLine();
            char letter = input.charAt(0);
            boolean guess = false;

            int i;
            for(i = 0; i < randomWord.length(); ++i) {
                char w = randomWord.charAt(i);
                if (w == letter) {
                    letters[i] = w;
                    guess = true;
                }
            }

            if (!guess) {
                --mistakes;
            }

            wonGame = true;

            for(i = 0; i < letters.length; ++i) {
                if (letters[i] == '*') {
                    wonGame = false;
                }

                System.out.print(letters[i]);
            }

            System.out.println("\n");
            if (!guess) {
                if (mistakes == 6) {
                    wrongGuess1();
                } else if (mistakes == 5) {
                    wrongGuess2();
                } else if (mistakes == 4) {
                    wrongGuess3();
                } else if (mistakes == 3) {
                    wrongGuess4();
                } else if (mistakes == 2) {
                    wrongGuess5();
                } else if (mistakes == 1) {
                    wrongGuess6();
                }
            }

            if (wonGame) {
                Winning();
            }
        }

    }

    ///GAME 2
    public static void GameControl_Topic_2()
    {
        ArrayList<Integer> sample = new ArrayList();
        sample.add(29);
        sample.add(28);
        sample.add(2);
        sample.add(0);
        Collections.sort(sample);

        ///This is the only section that changes between game modes
        String filePath="src/WordListRapperName.txt";
        String[] wordBank = readStringContentFromFile(filePath); ///Only line that changes based on the game mode selected


        assert wordBank != null;
        /* DEBUGGING FEATURE TO MAKE SURE THE WORD BANKS ARE WORKING
        for (String s : wordBank)
        {
            System.out.println(s);
        }*/

        String randomWord = wordBank[(int)(Math.random() * (double)wordBank.length)];
        System.out.println();
        System.out.println("___________________________");
        System.out.println("This word has " + randomWord.length() + " letters.");
        char[] letters = new char[randomWord.length()];
        Arrays.fill(letters, '*');
        System.out.println("___________________________");
        System.out.println("Input a letter  to guess the word (lowercase only)");
        Scanner inputLetter = new Scanner(System.in);

        boolean wonGame = false;
        int mistakes = 6;

        while(mistakes > 0) {
            System.out.println("Input: ");
            String input = inputLetter.nextLine();
            char letter = input.charAt(0);
            boolean guess = false;

            int i;
            for(i = 0; i < randomWord.length(); ++i) {
                char w = randomWord.charAt(i);
                if (w == letter) {
                    letters[i] = w;
                    guess = true;
                }
            }

            if (!guess) {
                --mistakes;
            }

            wonGame = true;

            for(i = 0; i < letters.length; ++i) {
                if (letters[i] == '*') {
                    wonGame = false;
                }

                System.out.print(letters[i]);
            }

            System.out.println("\n");
            if (!guess) {
                if (mistakes == 6) {
                    wrongGuess1();
                } else if (mistakes == 5) {
                    wrongGuess2();
                } else if (mistakes == 4) {
                    wrongGuess3();
                } else if (mistakes == 3) {
                    wrongGuess4();
                } else if (mistakes == 2) {
                    wrongGuess5();
                } else if (mistakes == 1) {
                    wrongGuess6();
                }
            }

            if (wonGame) {
                Winning();
            }
        }

    }

    ///GAME 3
    public static void GameControl_Topic_3()
    {
        ArrayList<Integer> sample = new ArrayList();
        sample.add(29);
        sample.add(28);
        sample.add(2);
        sample.add(0);
        Collections.sort(sample);

        ///This is the only section that changes between game modes
        String filePath="src/WordListConsoles.txt";
        String[] wordBank = readStringContentFromFile(filePath); ///Only line that changes based on the game mode selected


        assert wordBank != null;
        /* DEBUGGING FEATURE TO MAKE SURE THE WORD BANKS ARE WORKING
        for (String s : wordBank)
        {
            System.out.println(s);
        }
        */

        String randomWord = wordBank[(int)(Math.random() * (double)wordBank.length)];
        System.out.println();
        System.out.println("___________________________");
        System.out.println("This word has " + randomWord.length() + " letters.");
        char[] letters = new char[randomWord.length()];
        Arrays.fill(letters, '*');
        System.out.println("___________________________");
        System.out.println("Input a letter  to guess the word (lowercase only)");
        Scanner inputLetter = new Scanner(System.in);

        boolean wonGame = false;
        int mistakes = 6;

        while(mistakes > 0) {
            System.out.println("Input: ");
            String input = inputLetter.nextLine();
            char letter = input.charAt(0);
            boolean guess = false;

            int i;
            for(i = 0; i < randomWord.length(); ++i) {
                char w = randomWord.charAt(i);
                if (w == letter) {
                    letters[i] = w;
                    guess = true;
                }
            }

            if (!guess) {
                --mistakes;
            }

            wonGame = true;

            for(i = 0; i < letters.length; ++i) {
                if (letters[i] == '*') {
                    wonGame = false;
                }

                System.out.print(letters[i]);
            }

            System.out.println("\n");
            if (!guess) {
                if (mistakes == 6) {
                    wrongGuess1();
                } else if (mistakes == 5) {
                    wrongGuess2();
                } else if (mistakes == 4) {
                    wrongGuess3();
                } else if (mistakes == 3) {
                    wrongGuess4();
                } else if (mistakes == 2) {
                    wrongGuess5();
                } else if (mistakes == 1) {
                    wrongGuess6();
                }
            }

            if (wonGame) {
                Winning();
            }
        }

    }




    ///This is where all the action happens
    public static void main(String[] args)
    {
        System.out.println("****HANG MAN********");
        System.out.println("___________________________");
        System.out.println("JEAN JACOB COMTOIS--- A GAME OF HANGMAN 2021\n");
        System.out.println("Please make a selection of which game you would like to play: Please enter the corresponding number\n");

        Scanner gameSelection = new Scanner(System.in); ///This controls which element is going to be picked in the list
        int gamePicked = gameSelection.nextInt(); ///Element that is picked in the below conditional

        switch (gamePicked)
        {
            case 1:
                System.out.println("****HANG MAN GAME 1- MCDONALDS WORD GAME********");
                GameControl_Topic_1();
                break;
            case 2:
                System.out.println("****HANG MAN GAME 2- RAPPER NAME WORD GAME********");
                GameControl_Topic_2();
                break;

            case 3:
                System.out.println("****HANG MAN GAME 3- CONSOLE NAME WORD GAME********");
                GameControl_Topic_3();
                break;

            default:
                System.out.println("Error");
                break;
        }

    }
}