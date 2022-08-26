import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kenar 1 Ölçüsü");
        int a = input.nextInt();
        System.out.println("Kenar 2 Ölçüsü");
        int b = input.nextInt();
        System.out.println("Kenar 3 Ölçüsü");
        int c = input.nextInt();
        double u = (a+b+c)/2;

        System.out.println(Math.sqrt(u*(u-a)*(u-b)*(u-c)));

    }
}
