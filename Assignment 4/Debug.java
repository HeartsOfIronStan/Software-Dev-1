//I commented as much as I did to make the veiwer of the code understand exactly what is happening in the code.//
//I tried to explain the important parts of the code such as the "for" and "else" statements. I did not want to comment on every single line because that would be redundant.//

import java.util.Scanner;
class Debug {
    public static void main(String[] args) {
      
      // The "Scanner" allows the user to give the code an input.//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt();
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt();
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();
      
// This loop is a "for" loop. This loop automatically calculates what the tax reduction you need for your take home pay. The loop begins with a value of 0.//
        int additionalTaxReduction = 0;
      
      // This step of the loop says if the number of people is greater than or equal to 0, then the incriment is increased by 1.//
      //The additional tax reduction is then applied for every person equal to or above a total of 2.//
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }
//The tax reduction is at a default of 0//
        int taxReduction = 0;
      
      //This part of the loop sets the condition that the salary must be under $50,000. It is a strict value. The value cannot even equal a perfect 50,000. It must be below that value.//
        taxReduction += additionalTaxReduction;
        if(salary > 50000 && people > 3){
            taxReduction += 10;
          
          //This part of the loop tells the veiwer exactly what percentage of your income is reduced based on your tax obligations.
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
          
          //The rest of the loops are carbon copies of the previous loop. The only difference is the value of the loops.//
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");

          //This "else" statement is printed only when you put in a value under 3//
        } else {
            System.out.println("No applicable reduction on taxes found.");
        }

    }
}
