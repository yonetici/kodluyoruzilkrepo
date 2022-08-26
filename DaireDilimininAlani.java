import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçap giriniz");
        int a = input.nextInt();
        System.out.println("Açı Giriniz");
        int b = input.nextInt();
        System.out.println((3.14 * (a*a) * b) / 360);
    }
}
