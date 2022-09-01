import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay,gun;
        String result;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğdunuz ayı girin: ");
        ay = inp.nextInt();

        System.out.print("Doğduğunuz günü girin: ");
        gun = inp.nextInt();

        if(ay == 1){
            result = (gun<22) ? "Oğlak Burcu" : "Kova Burcu";
            System.out.print(result);
        }else if(ay == 2){
            result = (gun<20) ? "Kova Burcu" : "Balık Burcu";
            System.out.print(result);
        }else if(ay == 3){
            result = (gun<21) ? "Balık Burcu" : "Koç Burcu";
            System.out.print(result);
        }else if(ay == 4){
            result = (gun<21) ? "Koç Burcu" : "Boğa Burcu";
            System.out.print(result);
        }
        else if(ay == 5){
            result = (gun<21) ? "Boğa Burcu" : "İkizler Burcu";
            System.out.print(result);
        }
        else if(ay == 6){
            result = (gun<23) ? "İkizler Burcu" : "Yengeç Burcu";
            System.out.print(result);
        }
        else if(ay == 7){
            result = (gun<23) ? "Yengeç Burcu" : "Aslan Burcu";
            System.out.print(result);
        }else if(ay == 8){
            result = (gun<23) ? "Aslan Burcu" : "Başak Burcu";
            System.out.print(result);
        }else if(ay == 9){
            result = (gun<23) ? "Başak Burcu" : "Terazi Burcu";
            System.out.print(result);
        }else if(ay == 10){
            result = (gun<23) ? "Terazi Burcu" : "Akrep Burcu";
            System.out.print(result);
        }else if(ay == 11){
            result = (gun<22) ? "Akrep Burcu" : "Yay Burcu";
            System.out.print(result);
        }else if(ay == 12){
            result = (gun<23) ? "Yay Burcu" : "Oğlak Burcu";
            System.out.print(result);
        }
    }
}
