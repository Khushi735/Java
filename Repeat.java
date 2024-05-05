//WAP to enter the the 5 number and check the repeated number that how many times it repeats

import java.util.Scanner;

public class Repeat {

    public static void main(String[] args) {
        int i, r;
        try (Scanner scan = new Scanner(System.in)) {
			int a[] = new int[5];
			for (i = 0; i < a.length; i++) {
			    System.out.print("\nEnter the number:");
			    a[i] = scan.nextInt();
			}

			System.out.print("\nEnter the number to find occurrences: ");
			r = scan.nextInt();

			int count = 0;
			for (i = 0; i < a.length; i++) {
			    if (a[i] == r) {
			        count++;
			    }
			}

			System.out.println("Number " + r + " occurs " + count + " times in the array.");
		}
    }
}