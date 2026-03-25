/*3.Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
 Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times 
Element 5 occurs 2 times 
Element 6 occurs 1 time 
Element 7 occurs 1 time  */



public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 5, 7, 4};
        boolean[] visited = new boolean[arr.length];  // to track counted elements

        for (int i = 0; i < arr.length; i++) {

  // If this element is already visited (counted before), skip it
            if (visited[i] == true) {
                continue;
            }

            int count = 1;  // start counting current element

            // Check remaining elements for duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;  // mark duplicate as visited
                }
            }

            // Print the frequency
            System.out.println("Element " + arr[i] + " occurs " + count + " time" + (count > 1 ? "s" : ""));
        }
    }
}
