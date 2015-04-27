import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int weight, height, bmi;
        
        System.out.println("To calculate your BMI you must enter both your weight and height.");
        System.out.print("Eneter your weight in pounds: ");
        weight = value.nextInt(); //Assigns weight.
        System.out.print("Enter your height in inches: ");
        height = value.nextInt(); //Assigns height.
        
        bmi = (weight * 703) / (height * height);
        
        System.out.println("\nYour BMI value is " + bmi + ".");
        System.out.println("BMI VALUES\nUnderweight:\tless than 18.5\nNormal:\t\tbetween 18.5 and 24.9");
        System.out.println("Overweight:\tbetween 25 and 29.9\nObese:\t\t30 or greater");
    }
    
}
