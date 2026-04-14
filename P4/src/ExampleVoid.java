public class ExampleVoid {
    public static void main(String[] args) {
        methodRankPoints(85);
    }

    public static void methodRankPoints(int points) {
        if (points >= 90) {
            System.out.println("Grade: A");
        } else if (points >= 80) {
            System.out.println("Grade: B");
        } else if (points >= 70) {
            System.out.println("Grade: C");
        } else if (points >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
