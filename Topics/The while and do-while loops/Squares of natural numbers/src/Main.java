import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int N = scanner.nextInt();
        int startingPoint = 1;
        while(startingPoint <= N) {

            int x = (int) Math.sqrt(startingPoint);
            if(Math.pow(x,2) == startingPoint) {
                System.out.println(startingPoint);
            }
            startingPoint++;

        }
    }
}