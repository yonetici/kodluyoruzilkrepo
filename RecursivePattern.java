import java.util.Scanner;

public class RecursivePattern {
    static void pattern(int x) {
        if (x >= 0) {
            System.out.print(x + " {} ");
            pattern(x-5);
        }
        System.out.print(x + " [] ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int x = scan.nextInt();
        pattern(x);
    }
}
