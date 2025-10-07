import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        Help();
        Joe();
        Far();
    }


    public static void Help() {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int inputString = sc.nextInt();
        for (int i = 1; i < inputString; i++) {
            sum = sum * i;


        }
        System.out.println (sum);


    }


    public static void Joe() {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        int inte = sc.nextInt();
        for (int i = 1; i < inte; i += 2) {
            sum1 = sum1 + i;

        }
        System.out.println(sum1);
    }


    public static void Far (){
        Scanner sc = new Scanner(System.in);
    System.out.println("Problem 5");
        System.out.println("Enter a word or sentence: ");
    String inputword = sc.nextLine();
    String finalstring = "";
        for (int i = inputword.length()-1; i >= 0; i--) {
        finalstring = finalstring + inputword.charAt(i);
    }
        System.out.println(finalstring);
}
}
