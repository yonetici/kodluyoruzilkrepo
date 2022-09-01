import java.util.Scanner;
    
public class LeapYear {

    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year!");
        year = scanner.nextInt();
        if(year%4 == 0){
            if(year%100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("Leap Year!");
                    return;
                }
            } else { 
                System.out.print("Leap Year!");
                return;
            }
        }
        System.out.print("Not Leap Year!");
    }
}
