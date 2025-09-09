import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This part starts the quiz program. It starts the score at 0.
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is 15 + 15? ");
        String input = sc.nextLine();
        if (input.equals("30")) {

            System.out.println("Correct!");
            //This is where the score gets calculated.
            score = score + 1;
            System.out.println("You got 1/3 correct!");

        } else {
            System.out.println("The answer is incorrect!");

            System.out.println("0/3 correct!");
        }

        System.out.println("What is the movie that Tom Cruise Starred in that had navy planes? ");
        input = sc.nextLine();
        if (input.equals("Top Gun")) {
            System.out.println("Correct!");
            //This section calculates the score when you answer the question.
            score = score + 1;
            System.out.println("You got " + score + " /3 correct!");
            // This is where the code tells you that the answer is wrong.
        } else {
            System.out.println("The answer is incorrect!");
        }

        System.out.println("How old is John Williams? ");
        input = sc.nextLine();
        // This section checks if you are right. If it is wrong, the section will go to the else statement.
        if (input.equals("93")){
            System.out.println("Correct!");
            score = score + 1;
            System.out.println("You got " + score + " correct!");
        }else{
            System.out.println("The answer is incorrect!");

            System.out.println(score + " correct!");
        }
    System.out.println("You finished the quiz! You got " + score + "/3 correct!");
    }}

// What I learned was how to use variables to keep track of quiz scores. I also learned how to use the "equal.()" code.
