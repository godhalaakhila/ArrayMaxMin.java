public class ArrayMinMax {
    public static void main(String[] args) {
        // Initialize the array with some values
        int[] array = {5, 12, 3, 19, 8, 7};

        // Assume the first element is both the largest and smallest
        int largest = array[0];
        int smallest = array[0];

        // Traverse the array to find the largest and smallest elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
 
    

