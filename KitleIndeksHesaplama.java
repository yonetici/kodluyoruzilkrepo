import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz");
        double a = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        int b = input.nextInt();
        System.out.println(b / (a * a));
    }
}
