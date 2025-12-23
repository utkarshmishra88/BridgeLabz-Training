//program for Rock Paper scissor game

import java.util.Scanner;

public class RockPaperScissorsGame {

    // method to get computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // method to find winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    // method to calculate stats and percentage
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    // method to display results
    public static void displayResults(String[][] stats) {

        System.out.println("\nPlayer\tWins\tWinning %");
        System.out.println("---------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]
            );
        }
    }

    public static void main(String[] args) {

   
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        //initial the variable and take input from the user
        System.out.print("Enter number of games: ");
        int games = input.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= games; i++) {

            System.out.print("\nGame " + i + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = input.next().toLowerCase();

            String computerChoice = getComputerChoice();

            System.out.println("Computer choice: " + computerChoice);

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;

            System.out.println("Winner: " + winner);
        }

        String[][] stats = calculateStats(userWins, computerWins, games);

        displayResults(stats);

        //close the scanner
        input.close();
    }
}
