import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafe giriniz. (KM)");
        int a = input.nextInt();
        System.out.println(10 + (a * 2.20) > 20 ? 10 + (a * 2.20) : 20);

    }
}
