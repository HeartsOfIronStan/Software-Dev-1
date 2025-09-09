public class Main {
    public static void main(String[] args) {

        int var1 = 6;
        if (var1 > 4) {
            System.out.println("Var1 is greater than 4");
        } else {
            System.out.println("Var1 is less than 4");
        }

        int var2 = 5;
        if (var2 == 5) {
            System.out.println("Var2 is 5");
        } else if (var2 > 5) {
            System.out.println("Var2 is greater than 5");
        } else if (var2 < 5) {
            System.out.println("Var2 is less than 5");
        } else {
            System.out.println("Var2 is 6");
        }

        int var3 = 14;
        if (var3 == 10) {
            System.out.println("Var3 is 10");
        } else if (var3 < 10) {
        System.out.println("Var3 is 10");
    }else{
        System.out.println("Var3 is less than 10");
    }


    //for this section: why are we not entering the if statement?
    //We are not entering an if statement because
     if ("Marist" == "Marist"){
        System.out.println("Marist college!");
    }else{
        System.out.println("Not marist college!");
    }


}
}
