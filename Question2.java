import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner heightqn = new Scanner(System.in);
    System.out.println("Enter your height in meters: ");
    double height = heightqn.nextDouble();
    System.out.println("Enter your weight in kg: ");
    double weight = heightqn.nextDouble();
    double bmi = weight / (height * height);
    System.out.println("Your BMI is " + bmi);
  }
}
