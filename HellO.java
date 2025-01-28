import java.util.Scanner;
public class HellO{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the first number:");
    int firstNumber= scanner.nextInt();
    System.out.println("enter the second number:");
    int secondNumber= scanner.nextInt();
    int sum=firstNumber + secondNumber;
    System.out.println("The sum of"+ firstNumber + "and" + secondNumber + "is:" +sum);
    scanner.close();
  }
}