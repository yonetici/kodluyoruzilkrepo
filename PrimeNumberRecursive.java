import java.util.*;

public class PrimeNumberRecursive {
    public static void main(String[] args) {
        int number = 765;
        if(isPrime(number, 2))
            System.out.println(number + " is a prime number. ");
        else
            System.out.println(number + " is not a prime number. ");
    }


    public static boolean isPrime(int number, int i){

        if(number == 1)
            return false;

        if(number == 2)
            return true;

        if(number % i == 0)
            return false;

        if(i * i > number)
            return true;

        return isPrime(number, i + 1);


    }
}
