import java.util.Scanner;

public class TravelCostCalculator {
    public static void main(String[] args){

        int distance,age,flightType;
        double price;

        Scanner inp = new Scanner(System.in);

        System.out.print("Distance: ");
        distance = inp.nextInt();

        System.out.print("Age: ");
        age = inp.nextInt();

        System.out.print("Flight type (1=> one-way 2=> round):");
        flightType = inp.nextInt();

        if((distance>0) && (age>0) && (flightType==1 || flightType==2)){

            price = distance*0.1;
            price = (age<12) ? price/2 : ((age>=12 && age<=24) ? price*0.9 : price*0.7);

              if (flightType==2) {
                  price=price*0.8;
              }
            System.out.println("Total Price: " +price+ "TRY");

        }else{
            System.out.println("hatalı giriş yaptınız!");

        }



    }
}
