import java.util.Random;

public class Student {

    String name;
    String year;
    double gpa;
    int id;

    public Student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;


    }

    void HonorRoll(){

        if (this.gpa > 3.6){
            System.out.println(this.name + " is an Honor Roll student.");

        }else{
            System.out.println(this.name + " is not an Honor Roll student.");
        }


    }
     void freeLunch() {
         Random random = new Random();

         int randomInt = random.nextInt(9000000) + 1000000;
         System.out.print(randomInt);


         if (this.id == randomInt) {
             System.out.println(this.name + " does qualify for free lunch.");

         }else{
             System.out.println("This student does not qualify for free lunch.");
         }
     }
}
