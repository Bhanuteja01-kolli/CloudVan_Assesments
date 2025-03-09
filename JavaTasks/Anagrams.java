package Java_progs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        String str2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            System.out.println("Output: false");
            return;
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        System.out.println("Output: " + Arrays.equals(charArray1, charArray2));
        scanner.close();
    }
}
