package day29_CustomMethods;

    /*
     8. write a method that can print out the unique elements from an array of string
    */
public class UniqueElement {

        public static void main(String[] args) {
            String[] arr = {"A", "B", "B", "C"};
            uniques(arr);

            System.out.println("Hello");

            String[] arr2 = {"D","D","E","F","F"};
            uniques(arr2);

        }



        public static void uniques(String[] arr) {

            for (String a : arr) { // gets each of the elements

                int count = 0;

                for (String each : arr) { // ges the frequency of the element
                    if (a.equals(each)) {
                        count++;
                    }
                }

                if (count == 1) { // unigue
                    System.out.print(a + " ");

                }
            }
            System.out.println();
        }
    }