/* Q8. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
*/


public class CountInversions {
    public static void main(String[] args) {
        int[] arr = {1,9,6,4,5};
        int count = 0;

        System.out.print("The inversions are: ");

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                    count++;
                }
            }
        }

        System.out.println("\nTotal Inversions: " + count);
    }
}