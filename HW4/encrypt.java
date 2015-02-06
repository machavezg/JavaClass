// Exercise 4.38 Enforcing Privacy and Cryptography
// Program encrypt data for transmission
import java.util.Scanner;

public class encrypt
{
    public static void main(String[] args)
    {
//Declare variables
        Scanner num = new Scanner(System.in);
        int number, num1, num2, num3, num4;
//Get Input
        System.out.print("Enter a 4-digit number you would like to encrypt: ");
        number = num.nextInt();
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
        System.out.printf("Your number:" + digit1 + digit2 + digit3 + digit4 + "\n"); //this is only needed to verify
        System.out.printf("Your encrypted number:" + num1 + num2 + num3 + num4 + "\n");
   } 
} // end class Encrypt
