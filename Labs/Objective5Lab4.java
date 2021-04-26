import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    //Initialize Int Variable
    int num;

    //Scanner Create
    Scanner input = new Scanner(System.in);

    //User Input
    System.out.println("Please enter a number:");
    num = input.nextInt();

    //Conditional and Output
    if(num % 2 == 0) {
      System.out.println("The number is even");
    }
    else {
      System.out.println("The number is odd");
    }


  }
}
