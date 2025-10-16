import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> newList = new ArrayList<Integer>();
        //newList.add([][]);
        System.out.println(newList);


        //This is the array for the cases and their values pertaining to each.//
        int[][] myArray = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26},
                {2, 100000, 10, 5, 75, 10000, 750, 500, 400, 200, 50, 5000, 500000, 1000, 750000, 200000, 1, 25, 400000, 300, 75000, 100, 50000, 25000, 300000, 1000000}};

        //This is for choosing the first case to keep for the game//
        //RemCase is the variable for the number of remaining cases left to choose from.//
        System.out.println("Choose first case: ");
        int Case = sc.nextInt();
        int caseValue = myArray[1][Case - 1];
        int RemCase = 25;
        RemCase = RemCase - 1;

        //This is for choosing a case and all subsequent cases for the remainder of the round//
        for (int i = 0; i <= 5; i++) {

            //This is for choosing the first case of the round.//
            //Casenum is the variable for the amount of cases you have currently chosen for the round and/or whole game.//
            int Casenum = 0;
            System.out.println("Choose 1 case: ");
            int inputint = sc.nextInt();
            Casenum = Casenum + 1;
            RemCase = RemCase - 1;


            if (newList.contains(inputint)) {
                System.out.println("case exists :(");
                i--;
            } else {
                System.out.println(myArray[0][inputint - 1]);
                System.out.println(myArray[1][inputint - 1]);
                newList.add(inputint);
            }


        }

        int sum = 0;
        for (int j = 0; j < myArray[1].length; j++) {
            // System.out.println(myArray[1][j] + " ");
            sum = myArray[1][j];

        }

        System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
        System.out.println("Do you accept the offer?");
        sc.nextLine();
        String inputScanner = sc.nextLine();
        if (inputScanner.equals("yes")) {
            System.exit(0);
        } else {


        }

        //for loop 5 times
        //banker
        for (int i = 0; i <= 4; i++) {
            int Casenum = 0;
            System.out.println("Choose 1 case: ");
            int inputint = sc.nextInt();
            Casenum = Casenum + 1;
            RemCase = RemCase - 1;


            if (newList.contains(inputint)) {
                System.out.println("case exists :(");
                i--;
            } else {
                System.out.println(myArray[0][inputint - 1]);
                System.out.println(myArray[1][inputint - 1]);
                newList.add(inputint);
            }


        }

        // int sum = 0;
        for (int j = 0; j < myArray[1].length; j++) {
            // System.out.println(myArray[1][j] + " ");
            sum = myArray[1][j];

        }

        System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
        System.out.println("Do you accept the offer?");
        sc.nextLine();
        inputScanner = sc.nextLine();

        if (inputScanner.equals("yes")) {
            System.exit(0);

        } else {


            for (int i = 0; i <= 3; i++) {
                int Casenum = 0;
                System.out.println("Choose 1 case: ");
                int inputint = sc.nextInt();
                Casenum = Casenum + 1;
                RemCase = RemCase - 1;


                if (newList.contains(inputint)) {
                    System.out.println("case exists :(");
                    i--;
                } else {
                    System.out.println(myArray[0][inputint - 1]);
                    System.out.println(myArray[1][inputint - 1]);
                    newList.add(inputint);
                }


            }

            sum = 0;
            for (int j = 0; j < myArray[1].length; j++) {
                // System.out.println(myArray[1][j] + " ");
                sum = myArray[1][j];

            }

            System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
            System.out.println("Do you accept the offer?");
            sc.nextLine();
            inputScanner = sc.nextLine();
            if (inputScanner.equals("yes")){
                System.exit(0);

            } else {


                for (int i = 0; i <= 2; i++) {
                    int Casenum = 0;
                    System.out.println("Choose 1 case: ");
                    int inputint = sc.nextInt();
                    Casenum = Casenum + 1;
                    RemCase = RemCase - 1;


                    if (newList.contains(inputint)) {
                        System.out.println("case exists :(");
                        i--;
                    } else {
                        System.out.println(myArray[0][inputint - 1]);
                        System.out.println(myArray[1][inputint - 1]);
                        newList.add(inputint);
                    }


                }

                sum = 0;
                for (int j = 0; j < myArray[1].length; j++) {
                    // System.out.println(myArray[1][j] + " ");
                    sum = myArray[1][j];

                }

                System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
                System.out.println("Do you accept the offer?");
                sc.nextLine();
                inputScanner = sc.nextLine();
                if (inputScanner.equals("yes")){
                    System.exit(0);

                } else {


                    for (int i = 0; i <= 1; i++) {
                        int Casenum = 0;
                        System.out.println("Choose 1 case: ");
                        int inputint = sc.nextInt();
                        Casenum = Casenum + 1;
                        RemCase = RemCase - 1;


                        if (newList.contains(inputint)) {
                            System.out.println("case exists :(");
                            i--;
                        } else {
                            System.out.println(myArray[0][inputint - 1]);
                            System.out.println(myArray[1][inputint - 1]);
                            newList.add(inputint);
                        }


                    }

                    sum = 0;
                    for (int j = 0; j < myArray[1].length; j++) {
                        // System.out.println(myArray[1][j] + " ");
                        sum = myArray[1][j];

                    }

                    System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
                    System.out.println("Do you accept the offer?");
                    sc.nextLine();
                    inputScanner = sc.nextLine();
                    if (inputScanner.equals("yes")){
                        System.exit(0);

                    } else {


                            int Casenum = 0;
                            System.out.println("Choose 1 case: ");
                            int inputint = sc.nextInt();
                            Casenum = Casenum + 1;
                            RemCase = RemCase - 1;


                            if (newList.contains(inputint)) {
                                System.out.println("case exists :(");
                            } else {
                                System.out.println(myArray[0][inputint - 1]);
                                System.out.println(myArray[1][inputint - 1]);
                                newList.add(inputint);
                            }




                        sum = 0;
                        for (int j = 0; j < myArray[1].length; j++) {
                            // System.out.println(myArray[1][j] + " ");
                            sum = myArray[1][j];

                        }

                        System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
                        System.out.println("Do you accept the offer?");
                        sc.nextLine();
                        inputScanner = sc.nextLine();
                        if (inputScanner.equals("yes")){
                            System.exit(0);

                        } else {



                                //This is for choosing the first case of the round.//
                                //Casenum is the variable for the amount of cases you have currently chosen for the round and/or whole game.//
                                Casenum = 0;
                                System.out.println("Choose 1 case: ");
                                inputint = sc.nextInt();
                                Casenum = Casenum + 1;
                                RemCase = RemCase - 1;


                                if (newList.contains(inputint)) {
                                    System.out.println("case exists :(");

                                } else {
                                    System.out.println(myArray[0][inputint - 1]);
                                    System.out.println(myArray[1][inputint - 1]);
                                    newList.add(inputint);
                                }



                            sum = 0;
                            for (int j = 0; j < myArray[1].length; j++) {
                                // System.out.println(myArray[1][j] + " ");
                                sum = myArray[1][j];

                            }

                            System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
                            System.out.println("Do you accept the offer?");
                            sc.nextLine();
                            inputScanner = sc.nextLine();
                            if (inputScanner.equals("yes")){
                                System.exit(0);

                            } else {



                                    //This is for choosing the first case of the round.//
                                    //Casenum is the variable for the amount of cases you have currently chosen for the round and/or whole game.//
                                    Casenum = 0;
                                    System.out.println("Choose 1 case: ");
                                    inputint = sc.nextInt();
                                    Casenum = Casenum + 1;
                                    RemCase = RemCase - 1;


                                    if (newList.contains(inputint)) {
                                        System.out.println("case exists :(");

                                    } else {
                                        System.out.println(myArray[0][inputint - 1]);
                                        System.out.println(myArray[1][inputint - 1]);
                                        newList.add(inputint);
                                    }



                                sum = 0;
                                for (int j = 0; j < myArray[1].length; j++) {
                                    // System.out.println(myArray[1][j] + " ");
                                    sum = myArray[1][j];

                                }

                                System.out.println("This is what the banker is offering: " + sum / RemCase + " ");
                                System.out.println("Do you accept the offer?");
                                sc.nextLine();
                                inputScanner = sc.nextLine();
                                if (inputScanner.equals("yes")){
                                    System.exit(0);

                                } else {


                                        //This is for choosing the first case of the round.//
                                        //Casenum is the variable for the amount of cases you have currently chosen for the round and/or whole game.//
                                        Casenum = 0;
                                        System.out.println("Choose 1 case: ");
                                        inputint = sc.nextInt();
                                        Casenum = Casenum + 1;
                                        RemCase = RemCase - 1;


                                        if (newList.contains(inputint)) {
                                            System.out.println("case exists :(");

                                        } else {
                                            System.out.println(myArray[0][inputint - 1]);
                                            System.out.println(myArray[1][inputint - 1]);
                                            newList.add(inputint);
                                        }




                                    //sum = 0;
                                    //for (int j = 0; j < myArray[1].length; j++) {
                                      //   System.out.println(myArray[1][j] + " ");
                                        //sum = myArray[1][j];

                                    //}

                                    //System.out.println("This is what the banker is offering: " + sum  + " ");
                                    //System.out.println("Do you accept the offer?");
                                    //sc.nextLine();
                                    //inputScanner = sc.nextLine();
                                    //if (inputScanner.equals("yes")){


                                       // System.exit(0);

                                    //} else {
                                   // }
                                }
                            }
                        }
                    }
                }
            }
        }

        //This is when there are 2 cases left. The one you chose at the beginning, and the last one you did not choose.
        //This is also at the end of the game//
        for (int i = 0; i <= 1; i++); {
            System.out.println("There are two cases left. Choose one: " + Case + " or " + RemCase + " ");
            int inputint = sc.nextInt();

            if (inputScanner.equals(Case)) {
                System.out.println(" You won $" + myArray[1][inputint - 1]);
                System.exit(0);


            } else {
                System.out.println(" You won $" + RemCase + "! ");


            }

        }
    }
}
