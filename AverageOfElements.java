/* 1. Average of Elements
      Concept: First compute the sum, then divide by the number of elements.
       arr = [10, 20, 30, 40, 50]
       Average of array elements: 30.0 in java */



public class 
 {
 public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // Compute the sum of all elements
        for (int num : arr) {
            sum += num;
        }

       
        double average = (double) sum / arr.length;    // Compute average


        
        System.out.println("Average of array elements: " + average);  // Display result

    }
}
