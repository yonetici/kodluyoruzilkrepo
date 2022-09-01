import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    char operator;
    String errorMsg = "Invalid operator!";
    int number1, number2, result;
    Scanner input = new Scanner(System.in);
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);
    System.out.println("Enter first number");
    number1 = input.nextInt();
    System.out.println("Enter second number");
    number2 = input.nextInt();
    System.out.println("Result: ");
    switch (operator) {
      case '+':
        System.out.println(result = number1 + number2);
        break;
      case '-':
       System.out.println( result = number1 - number2);
        break;
      case '*':
        System.out.println(result = number1 * number2);
        break;
      case '/':
        System.out.println(result = number1 / number2);
        break;
      default:
        System.out.println(errorMsg);
        break;
    }
    
  }
}
