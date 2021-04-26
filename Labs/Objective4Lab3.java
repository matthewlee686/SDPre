import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);


    //User Input
    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("What is the current year?");
    currentYear = input.nextInt();

    //Calculation
    birthYear = (currentYear - age);

    //Output
    System.out.println("You were born in " + birthYear);

    input.close();
  }
}
