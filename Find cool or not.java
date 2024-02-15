import java.util.Scanner;

public class CoolNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isCoolNumber(number)) {
            System.out.println(number + " is a cool number!");
        } else {
            System.out.println(number + " is not a cool number.");
        }
    }

    // Function to check if a number is cool
    private static boolean isCoolNumber(int num) {
        String numString = String.valueOf(num);
        int length = numString.length();

        for (int i = 0; i < length; i++) {
            int digitSum = 0;

            for (int j = 0; j < length; j++) {
                if (i != j) {
                    digitSum += Character.getNumericValue(numString.charAt(j));
                }
            }

            if (digitSum == Character.getNumericValue(numString.charAt(i))) {
                return true; // Found a cool digit
            }
        }

        return false; // No cool digit found
    }
}
