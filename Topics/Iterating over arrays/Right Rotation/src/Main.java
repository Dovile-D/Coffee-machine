import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int len = arr.length;

        // Handle cases where steps is greater than array length
        steps = steps % len;

        // Create a temporary array to store the rotated elements
        int[] temp = new int[steps];

        // Copy the last steps elements of the original array to temp
        for (int i = 0; i < steps; i++) {
            temp[i] = arr[len - steps + i];
        }

        // Shift the remaining elements of the array to the right
        for (int i = len - steps - 1; i >= 0; i--) {
            arr[i + steps] = arr[i];
        }

        // Copy the rotated elements from temp back to the original array
        for (int i = 0; i < steps; i++) {
            arr[i] = temp[i];
        }
    }


    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}