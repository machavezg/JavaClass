import java.util.Scanner;

public class LCMCalculatorAlt {

    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in); //Scanner initialized to numScan
        int num1, num2, max, min, lcm;
        System.out.println("What two numbers do you want to find the LCM of? ");
        System.out.print("Eneter your first number: ");
        num1 = numScan.nextInt(); //Assigns first number to num1 entered by user
        System.out.print("Enter your second number: ");
        num2 = numScan.nextInt(); //Assigns second number to num2 entered by user
        
        max = (num1 > num2) ? num1 : num2;
        min = (num1 > num2) ? num2 : num1;
        for (int i = 1; i <= min ; i++){
            lcm = max * i;
            if (lcm % min == 0){
                System.out.print("Your Lowest Common Multiple is: ");
                System.out.println(lcm);
                break;
            }
        }
    }
}
