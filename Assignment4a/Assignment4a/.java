public class Main {
    public static void main(String[] args) {

        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,93,17,10,2,87,267,3176,3,82};
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
    }

        int[] duplicates = {10,10,10,10,3,3,3,2,2,87,87,87,93,93};
        for (int i = 0; i < duplicates.length; i++) {
            for (int j = i + 1; j < duplicates.length; j++) {
                if (duplicates[i] == duplicates[j]) {
                    System.out.println(duplicates[i]);
                    //break;
                }
            }
        }

        for (int i = 0; i < duplicates.length; i++) {

            boolean duplicate = false;
            int j = 0;

            while (j < i){

                if ((i != j) && duplicates[i] == duplicates[j]) {
                    duplicate = true;
                }

                j++;
            }

            if (duplicate) {
                //System.out.print(duplicates[i] + " ");
            }
        }
    }
    }

    //I learned how to apply nested loops to arrays. I also learned to use the resources avaliable to me outside of the traditional lecture.//
