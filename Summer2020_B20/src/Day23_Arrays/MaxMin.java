package Day23_Arrays;
/*
write a program that can return the min and maximum number from the array
 */
public class MaxMin {

    public static void main(String[] args) {

    int[] arr = {5,5,4,6,4,1, -100, 100, 200, 3000, -3000};
    int max = arr[0]; // 6

    int min = arr[0]; // 1

    for(int i = 1; i <= arr.length- 1; i++ ){ // i: 1,2,3,4,5,

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }


        System.out.println("Max number: "+ max);
        System.out.println("Min number: "+ min);








    }
}
