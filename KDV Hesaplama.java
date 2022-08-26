import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz");
        int a = input.nextInt();
        double tax;
        if (a>0 && a<1001) {
            tax = a * 0.18;
        } else {
            tax = a * 0.08;
        }
           System.out.println("KDV Tutarı: " + tax + "KDV dahil fiyat: " + (tax + a));

    }
}
