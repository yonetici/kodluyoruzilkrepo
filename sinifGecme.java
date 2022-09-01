import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  int matematik, fizik, turkce, kimya, muzik, dersSayisi=0, notToplam=0;
  double avg;
  System.out.print("Notlarınızı giriniz\n");
  Scanner input = new Scanner(System.in);
  System.out.print("Matematik: ");
  
  matematik = input.nextInt();
  if ((matematik>0 && matematik<101)) {
  	dersSayisi++;
  	notToplam+=matematik;
  }
  System.out.print("Fizik: ");
  fizik = input.nextInt();
    if (fizik>0 && fizik<101) {
  	dersSayisi++;
  	notToplam+=fizik;
  }
  System.out.print("Turkce: ");
  turkce = input.nextInt();
    if (turkce>0 && turkce<101) {
  	dersSayisi++;
  	notToplam+=turkce;
  }
  System.out.print("Kimya: ");
  kimya = input.nextInt();
    if (kimya>0 && kimya<101) {
  	dersSayisi++;
  	notToplam+=kimya;
  }
  System.out.print("Muzik: ");
  muzik = input.nextInt();
    if (muzik>0 && muzik<101) {
  	dersSayisi++;
  	notToplam+=muzik;
  }
  avg = notToplam / dersSayisi; 
  if (avg>=55) {
  	System.out.print("Sınıf geçti. Ortalama: "+ avg);
  } else {
  System.out.print("Genel ortalama 55 altında olduğu için sınıf geçemedi. Ortalama: "+ avg);
  }
    
  }
}
