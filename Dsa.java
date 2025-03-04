public class Dsa {
    // Recursive function to print the array in reverse order
    public static void reverseArray(int[] arr, int index) {
        if (index < 0) {
            return; // Base case: stop when index is out of bounds
        }
        System.out.print(arr[index] + " "); // Print the current element
        reverseArray(arr, index - 1); // Recursive call for the previous index
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        reverseArray(arr, arr.length - 1); // Start from the last index
    }
}
