package dec3;

public class Te {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("pragra");
                continue; // Skip printing the number for multiples of 5
            }
            System.out.println(i); // Print the number only if it's not a multiple of 5
        }
    }
}
