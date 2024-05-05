import java.util.Scanner;
public class prac1 {
  public static void main(String[] args) {
    System.out.println("Name: Khushi P Prajapati");
    System.out.println("Enrollment No.: 220410107087");
    int div = 2;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Integer Value : ");
    int number = input.nextInt();
    while (number > 1) {
      if (number % div == 0) {
        System.out.print(div + ",");
        number = number / div;
      } else {
        div++;
      }
    }
  }
}
