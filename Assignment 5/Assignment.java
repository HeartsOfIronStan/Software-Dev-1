import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Don();

    }


    public static void Don(){
    Scanner sc = new Scanner(System.in);
    int miles = 0;
    int time = 0;
    System.out.println("Give me the distance in miles of how far away your destination is.");
    miles = sc.nextInt();
    System.out.println("Give me the time it takes to get to the destintiation in minutes.");
    time = sc.nextInt();

    System.out.println( "The ticket fare for the taxi is $" + miles * time + ".");

}
}
