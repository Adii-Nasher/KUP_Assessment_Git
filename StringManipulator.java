import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringManipulator {
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int index = str.length() - 1; index >= 0; index--) {
            reversed.append(str.charAt(index));
        }

        return reversed.toString();
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num) && !duplicates.contains(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] numbers = new int[length];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        List<Integer> duplicateNumbers = findDuplicates(numbers);
        System.out.println("Duplicate Numbers: " + duplicateNumbers);
    }
}
