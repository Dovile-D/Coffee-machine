class Main {
    public static void main(String[] args) {
        //write your code here
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        int i;
        String x;


        for (i = 0; i < numbers.length; i++) {

            // accessing each element of array
            x = numbers[i];
            if ((i + 1) % 3 == 0) {
                System.out.print( x+ "\n");
            }
            else {
                System.out.print(x + " ");
            }
        }

    }
}