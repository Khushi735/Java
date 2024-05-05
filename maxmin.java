import java.util.Scanner;

public class maxmin {

    public static void main(String[] args) {
        
        int max, min, i;
        Scanner scan = new Scanner(System.in);
        
        int a[] = new int[10];
        
        for (i = 0; i < a.length; i++) {
            System.out.print("\nEnter the number:");
            a[i] = scan.nextInt();
        }

        max = a[0];
        
        for (i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        min = a[0];
        
        for (i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        
        System.out.print("\nMAX =" + max);
        System.out.print("\nMIN =" + min);
    }
}
