import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo? : ");
        int a = input.nextInt();
        System.out.println("Elma Kaç Kilo? : ");
        int b = input.nextInt();
        System.out.println("Domates Kaç Kilo? : ");
        int c = input.nextInt();
        System.out.println("Muz Kaç Kilo? : ");
        int d = input.nextInt();
        System.out.println("Patlican Kaç Kilo? : ");
        int e = input.nextInt();
        System.out.println((a*armutFiyat) + (b*elmaFiyat) + (c*domatesFiyat) + (d*muzFiyat) + (e*patlicanFiyat));
    }
}
