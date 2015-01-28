import java.util.Scanner;

public class LCMCalculator {

    public static void main(String[] args) {
        Scanner numScan = new Scanner(System.in); //Scanner initialized to numScan
        int num1, num2, max, min, euc, lcm;
        
        System.out.println("What two numbers do you want to find the LCM of? ");
        System.out.print("Eneter your first number: ");
        num1 = numScan.nextInt(); //Assigns first number to num1 entered by user
        System.out.print("Enter your second number: ");
        num2 = numScan.nextInt(); //Assigns second number to num2 entered by user
        //The following if else statements are used to allow the user no enter a number of any size
        //either in ther first position or second
        if (num1 > num2){
            max = num1;
            min = num2;
        }
        else {
            max = num2;
            min = num1;
        }
        
        int maxEuc = max, minEuc = min;
        do {
            euc = maxEuc % minEuc;
            maxEuc = minEuc;
            minEuc = euc;
        } while (euc != 0); 
        //As long as euc is not equal to 0 the loop will run, as soon as eul=0 the value of your GCD is maxEuc.
        //In Euclid's Algorithm you find the LCD by dividing the product of Number 1 and Number 2 by your GCD.
        
        lcm = (max * min) / maxEuc;
        System.out.print("Your Lowest Common Multiple is: ");
        System.out.println(lcm);
    }
}
