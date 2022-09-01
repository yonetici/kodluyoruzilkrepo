import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  int heat;
  Scanner input = new Scanner(System.in);
  System.out.print("Sıcaklık Değeri: ");
  heat = input.nextInt();
  
  if(heat>25) {
      System.out.print("Yüzmeye gidebilirsin.");
  } else if(heat<=25 && heat>=5) {
      if(heat<=15) {
          System.out.print("Sinemaya gidebilirsin.");
      }
      if(heat>=10) {
          System.out.print("Pikniğe gidebilirsin.");
      }
  } else {
      System.out.print("Kayak için Uludağa gidebilirsin.");
  }
  
    
  }
}
