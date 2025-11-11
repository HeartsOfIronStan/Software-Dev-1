import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        int count = 0;

        File inputfile = new File("C:\\Users\\histo\\IdeaProjects\\Software Development 1\\Assignment 8\\File.txt");
        String line = " ";

        try {
            Scanner sc = new Scanner(inputfile);
            while(sc.hasNext()){
                list.add(sc.nextLine());

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(list);

        for (int i = 1; i <= list.size(); i= i + 2){
            if(Double.parseDouble(list.get(i)) > 3.5){
                System.out.println(list.get(i-1));
                count++;
            }
        }
        System.out.println(count);
    }
}
// I had learned how to convert strings into doubles. This caused me to learn what parsing was when I have a parsing error from Java.//
