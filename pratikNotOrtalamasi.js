import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ders 1");
        int a = input.nextInt();
        System.out.println("Ders 2");
        int b = input.nextInt();
        System.out.println("Ders 3");
        int c = input.nextInt();
        System.out.println("Ders 4");
        int d = input.nextInt();
        System.out.println("Ders 5");
        int e = input.nextInt();
        System.out.println("Ders 6");
        int f = input.nextInt();
        System.out.println("Ders 7");
        int g = input.nextInt();

        int total= (a + b + c + d + e + f +g )/7;

        String result = total >60 ? "Geçti": "Kaldı";

        System.out.println("Ortalama" + total + " Sonuç: " + result);

    }
}
