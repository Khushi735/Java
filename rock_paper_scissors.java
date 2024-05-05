import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many turns do you want to play?");
        int numTurns = sc.nextInt();
        sc.nextLine(); // Consume newline

        int userScore = 0;
        int computerScore = 0;

        for (int i = 0; i < numTurns; i++) {
            String[] availableMoves = {"Rock", "Paper", "Scissors"};
            String computerMove = availableMoves[random.nextInt(availableMoves.length)];

            System.out.println("Computer has chosen its move.");
            System.out.println("Now it's your turn to choose a move.");

            String userMove;

            while (true) {
                System.out.println("Please choose your move from these available moves: 'Rock' 'Paper' 'Scissors'");
                System.out.print("Enter the move you chose: ");
                userMove = sc.nextLine();

                if (userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")) {
                    break;
                } else {
                    System.out.println("Invalid move!! Please enter one of the available moves only.");
                }
            }

            System.out.println("Computer chose: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a Tie!!");
            } else if (userMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Computer won!!");
                    computerScore++;
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Congrats! You won!!");
                    userScore++;
                }
            } else if (userMove.equals("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("Congrats! You won!!");
                    userScore++;
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("Computer won!!");
                    computerScore++;
                }
            } else if (userMove.equals("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("Congrats! You won!!");
                    userScore++;
                } else if (computerMove.equals("Rock")) {
                    System.out.println("Computer won!!");
                    computerScore++;
                }
            }
        }

        System.out.println("Game over!");
        System.out.println("Your score: " + userScore);
        System.out.println("Computer's score: " + computerScore);
        if (userScore > computerScore) {
            System.out.println("Congratulations! You win the game!");
        } else if (userScore < computerScore) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("It's a tie game!");
        }
    }
}
