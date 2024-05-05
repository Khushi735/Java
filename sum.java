public class sum {

    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // Calculate the sum
        int sum = x + y;
        System.out.println("Sum: " + sum);

        // Calculate the power
        int i = 1, p = 1;
        while (i <= y) {
            p = p * x;
            i++;
        }
        System.out.println("Power: " + p);

        // Reverse the first number
        int a = Integer.parseInt(args[0]);
        int rev = 0, r;
        while (a != 0) {
            r = a % 10;
            rev = rev * 10 + r;
            a = a / 10;
        }
        System.out.println("Reverse: " + rev);
    }
}
