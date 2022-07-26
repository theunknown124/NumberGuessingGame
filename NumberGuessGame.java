import java.util.Random;
import java.util.Scanner;

//@author Warren Cheng

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the range minimum number: "); //user input the range minimum number
        int PlayerRangeMin = input.nextInt();

        System.out.println("Input the range maximum number"); //user input the range maximum number
        int PlayerRangeMax = input.nextInt();

        Random randomNum = new Random(); //initializing randomized object for generating a number

        int guessNum = randomNum.nextInt(PlayerRangeMax) + PlayerRangeMin; //random generated number ranging from player range max to player range min

        //System.out.println("The random generated number: " + guessNum);//This line shows the generated number, meant debugging and testing purposes only

        System.out.println("A number is chosen ");

        int numberofGuessesUsed = 5; //The player gets five guesses to input the right random number
        int playerGuess;

        boolean guessesUsedUp = false;
        boolean guessedRightNumber = false;

        while (guessesUsedUp == false || guessedRightNumber == false)
        {

            System.out.println("You have " + numberofGuessesUsed + " tries");

            System.out.println("Guess the number chosen:");
            playerGuess = input.nextInt(); //PLayer input for number guess


                if (playerGuess > guessNum)
                {
                    System.out.println(playerGuess + " is greater than the random number");
                    numberofGuessesUsed--;
                    //continue;
                }
                else if (playerGuess < guessNum)
                {
                    System.out.println(playerGuess + " is less than the random number");
                    numberofGuessesUsed--;
                    //continue;
                }
                else if (playerGuess == guessNum){
                    System.out.println(playerGuess + " is the random number, you have guessed the random number!!");
                    guessedRightNumber = true;
                    break;
                }

                if(numberofGuessesUsed == -1)
                {
                    System.out.println("You have exhausted all your guesses" +
                            "\nThe random number was " + guessNum);
                    guessesUsedUp = true;
                    System.out.println("Game exiting");
                    break;
                }


        }

    }



}