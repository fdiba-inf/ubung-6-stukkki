package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int reverse = 0;
        int a = n;
        while (a > 0) {
          int next = a % 10;
          reverse = reverse * 10 + next;
          a = a / 10;
        }
        boolean palindrome = n == reverse;
        System.out.println("Palindrome: " + palindrome);
    }
}

