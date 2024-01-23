import java.util.Scanner;
class ranger{
    public int genrate(int max,int min)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }
}
public class Task2
{
    private static final int Max_round=3;
    private static final int Max_Attempts=5;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ranger rg = new ranger();
        int totalAttempts = 0;
       // for (int i = 1; i <=Max_round; i++)
        //{

            int win = 0;

            while (true)
            {
                System.out.println("Enter the maximum number ");
                int max = sc.nextInt();
                System.out.println("Enter the minimum number ");
                int min = sc.nextInt();
                sc.nextLine();

                int cnum = rg.genrate(max, min);
                int attempts = 0;

                while (true)
                {
                    System.out.println("Guess a number between " + max + " and " + min);
                    int gnum = sc.nextInt();
                    attempts++;
                    if (gnum > cnum) {
                        System.out.println("Its Greater ");
                    } else if (gnum < cnum) {
                        System.out.println("It lowest");
                    } else {
                        System.out.println("Correct Guess");
                        win++;
                        break;
                    }
                }
                totalAttempts += attempts;
                System.out.println("Attempts = " + attempts);
                System.out.println("Wins = " + win);

                double winrate = (double) (win / totalAttempts) + 100;
                // System.out.println("Your winrate is " + winrate);
                System.out.println("Do you want to paly again (yes/no) :- ");

                String playAgain = sc.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    sc.close();
                    System.exit(0);
                }
                sc.nextLine();
            }
    }
}
/*import java.util.Scanner;

class Ranger {
    public int generate(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

public class Task2 {
    private static final int MAX_ROUNDS = 3;
    private static final int MAX_ATTEMPTS = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ranger rg = new Ranger();

        int totalAttempts = 0;
        int totalWins = 0;

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            int win = 0;

            System.out.println("Round " + round);

            while (win < MAX_ATTEMPTS) {
                System.out.println("Enter the maximum number ");
                int max = sc.nextInt();
                System.out.println("Enter the minimum number ");
                int min = sc.nextInt();
                sc.nextLine();

                int cnum = rg.generate(max, min);
                int attempts = 0;

                while (true) {
                    System.out.println("Guess a number between " + min + " and " + max);
                    int gnum = sc.nextInt();
                    attempts++;

                    if (gnum > cnum) {
                        System.out.println("It's greater");
                    } else if (gnum < cnum) {
                        System.out.println("It's lower");
                    } else {
                        System.out.println("Correct Guess");
                        win++;
                        break;
                    }

                    if (attempts >= MAX_ATTEMPTS)
                    {
                        System.out.println("Out of attempts. The correct number was: " + cnum);
                        break;
                    }
                }

                System.out.println("Attempts = " + attempts);
                System.out.println("Wins = " + win);
                totalAttempts += attempts;
            }

            totalWins += win;
            double winRate = (double) totalWins / totalAttempts * 100;
            System.out.println("Round " + round + " Results:");
            System.out.println("Total Attempts = " + totalAttempts);
            System.out.println("Total Wins = " + totalWins);
            System.out.println("Win Rate = " + winRate + "%");

           // if (round < MAX_ROUNDS)
           // {
                System.out.println("Do you want to play another round (yes/no): ");
                String playAgain = sc.next();
                if (!playAgain.equalsIgnoreCase("yes"))
                {
                    sc.close();
                    System.exit(0);
                }
           // }
        }
       // sc.close();
    }
}*/
/* String playAgain = sc.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    sc.close();
                    System.exit(0);*/