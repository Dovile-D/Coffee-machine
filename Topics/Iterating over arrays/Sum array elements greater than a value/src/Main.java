import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int lenght = scanner.nextInt();
        int [] array  = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();

        int sum = 0;

        for (int integer : array) {
            if (integer > n) {
                sum += integer;
            }

        }
        System.out.println(sum);

    }
}