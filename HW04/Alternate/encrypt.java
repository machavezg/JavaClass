// Exercise 4.38 Enforcing Privacy and Cryptography
// Program encrypt data for transmission
import java.util.Scanner;

public class encrypt
{
    public static void main(String[] args)
    {
//Declare variables
        Scanner num = new Scanner(System.in);
        int num1, num2, num3, num4, length, number;
        String value;
//Get Input and check user input
        System.out.print("Enter a 4-digit number you would like to encrypt? ");
//Checks to see if its a word
        while (!num.hasNextInt()){
            System.out.println("Thats not a number");
            System.out.print("Please enter a valid 4-digit number: ");
            num.next();                
            }
        value = num.next();
        length = value.length();
//Checks to see if value entered is 4-digits long
        while(length != 4){
            System.out.println("The number you entered is not 4-digits long.");
            System.out.print("Please enter a 4-digit number to encrypt: ");
            value = num.next();
            length = value.length();
        }
            number = Integer.parseInt(value);
// get the digits
        int digit1 = number / 1000;
        int digit2 = number % 1000 / 100;
        int digit3 = number % 100 / 10;//number % 10000 % 1000 % 100 / 10;
        int digit4 = number % 10; //% 10000 % 1000 % 100 % 10;
//encrypt the data
//Swap 1 with 3 and 2 with 4
        num1 = (digit3 + 7) % 10;
        num2 = (digit4 + 7) % 10;
        num3 = (digit1 + 7) % 10;
        num4 = (digit2 + 7) % 10;
//output the encrypted data
        System.out.printf("Your number:" + digit1 + digit2 + digit3 + digit4 + "\n");
        System.out.printf("Your encrypted number:" + num1 + num2 + num3 + num4 + "\n");
   } 
} // end class Encrypt
