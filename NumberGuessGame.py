import random

print("Welcome to the Number Guessing game")

PlayerRangeMin = int(input("Input minimum number ")) #User inputs a minimum number

PlayerRangeMax = int(input("Input maximum number ")) #User inputs a maximum number

guessNum = random.randint(PlayerRangeMin,PlayerRangeMax + 1) #PlayerRangeMin is minimum number and PlayerRangeMax is maximum number

#print("The rnadom number generated number: ", guessNum) #This line is for debugging purposes only, this line prints out the guess number

def numberGuessingGame():
    numberofGuessesUsed = 5
    guessesUsedUp = False
    guessedRightNumber = False

    while (guessesUsedUp == False | guessedRightNumber == False):

        print("You have ", numberofGuessesUsed, " tries")
        playerGuess = int(input("Guess the number chosen >>"))

        if playerGuess > guessNum:
            print(playerGuess, " is greater than the randon number")
            numberofGuessesUsed -=1

        elif playerGuess < guessNum:
            print(playerGuess, " is less than the random number")
            numberofGuessesUsed -=1

        elif playerGuess == guessNum:
            print(playerGuess, " is the random number, you have guessed the random number")
            guessedRightNumber = True
            break

        if numberofGuessesUsed == -1:
            print("You have exhausted all your guesses.")
            print(" The random number was ", guessNum)
            guessesUsedUp = True
            print("Game Exiting")
            break


numberGuessingGame()