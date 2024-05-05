import java.util.Scanner;

public class posned {

    public static void main(String[] args) {
        int i, neg = 0, pos = 0;
        Scanner scan = new Scanner(System.in);

        int a[] = new int[5];
        for (i = 0; i < a.length; i++) {
            System.out.print("\nEnter the numberrrr:");
            a[i] = scan.nextInt();
        }

        for (i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                neg++;
            } else {
                pos++;
            }
        }

        System.out.println("\nNegative No: " + neg);
        System.out.println("Positive No: " + pos);
    }
}
