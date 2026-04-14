public class ExampleMinNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int min = findMin(a, b, c);
        System.out.println("The minimum number is: " + min);
    }

    public static int findMin(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }
}
