public class Dsa {
    public static void SortString(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j + 1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"Banana", "Orange", "Apple", "Mango"};
        
        SortString(arr); // Sort the array manually

        System.out.println("Sorted Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}
