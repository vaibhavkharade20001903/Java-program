import java.util.Scanner;

// Take three numbers from the user and print the gretest number.
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int x = sc.nextInt(); // x = 97
        System.out.println("enter the second number");
        int y = sc.nextInt(); // y = 54
        System.out.println("enter the third number");
        int z = sc.nextInt(); // z = 101

        if (x > y) {
            if (x > z) {
                System.out.println("Gretest number:=" + x);
            } else {
                System.out.println("Gretest number:=" + z);
            }
        } else {
            if (y > z) {
                System.out.println("Gretest number:=" + y);
            } else {
                System.out.println("Gretest number:=" + z);
            }
        }
    }
}