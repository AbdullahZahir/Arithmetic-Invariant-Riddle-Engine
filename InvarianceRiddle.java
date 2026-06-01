/**
 * NumbersRiddle.java
 * A number riddle that turns any number, and through arithmetic, results
 * in the number equalling 3. 
 * 
 * This program meets the requirements by checking for valid and invalid
 * user input, processing this through the riddle to find the resulting 
 * number & furthermore, tests the riddle with 6 pre-defined values to 
 * ensure all cases are covered. The code is furthermore enhanced
 * with a new additional riddle at the end. 
 * 
 * @Abdullah Zahir
*/

import java.util.Scanner;
public class NumbersRiddle
{
    public static void main(String[] args)
    {
        // Defines a Scanner variable "input"
        Scanner input = new Scanner(System.in);
        
        // Runs the riddle with user input, prints out process and final result
        System.out.println("We have developed a riddle that no matter what number you put, it \nshould always equal 3 after running through a certain sequence!");
        System.out.println("Enter a number (can be integer or double) so that we can test it \nwith the riddle!: ");
        // Source for this: https://www.w3schools.com/java/ref_scanner_hasnextdouble.asp
        double userInputNum = 0.0;
        double initialUserInputNum = 0.0;
        if (input.hasNextDouble()) {
            userInputNum = input.nextDouble();
            initialUserInputNum = userInputNum;
            userInputNum*=2;
            System.out.println(initialUserInputNum + " * 2 = " + userInputNum);
            System.out.print(userInputNum + " + 6 = ");
            userInputNum+=6;
            System.out.println(userInputNum);
            System.out.print(userInputNum + "/ 2 = ");
            userInputNum/=2;
            System.out.println(userInputNum);
            System.out.print(userInputNum + " - " + initialUserInputNum + " = " );
            userInputNum-=initialUserInputNum;
            //Rounding value if needed
            int intUserInputNum = (int) (userInputNum+0.5);
            System.out.println(intUserInputNum);
        } else {
            System.out.println("Only double or integer values allowed!");
        }
        
        //Defining all the test cases as different variables to test them
        int num1 = 1;
        int num2 = 0;
        int num3 = 67;
        int num4 = -30;
        double num5 = 5.5;
        double num6 = -6.7;
        double num7 = 6.999999;
        
        //Defining variables that will be used as placeholders/final value holders
        int intInitialVal = 0;
        double doubleInitialVal = 0.0;
        int intNum5 = 0;
        int intNum6 = 0;
        int intNum7 = 0;
        
        //Prints all test cases to show to user
        System.out.println("\nNow, we will try and test this riddle with different number cases to determine if it works for everything!");
        System.out.println("The numbers are: \n" + num1 + "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + num5 + "\n" + num6 + "\n" + num7);
        
        //Tests first test case: 1 (int)
        intInitialVal = 1;
        System.out.println("\nStarting number: " + num1);
        System.out.print(num1 + " * 2 = ");
        num1*=2;
        System.out.println(num1);
        System.out.print(num1 + " + 6 = ");
        num1+=6;
        System.out.println(num1);
        System.out.print(num1 + " / 2 = ");
        num1/=2;
        System.out.println(num1);
        System.out.print(num1 + " - " + intInitialVal +" = " );
        num1-=intInitialVal;
        System.out.println(num1);
        
        //Tests second test case: 0 (int)
        intInitialVal = 0;
        System.out.println("\nStarting number: " + num2);
        System.out.print(num2 + " * 2 = ");
        num2*=2;
        System.out.println(num2);
        System.out.print(num2 + " + 6 = ");
        num2+=6;
        System.out.println(num2);
        System.out.print(num2 + " / 2 = ");
        num2/=2;
        System.out.println(num2);
        System.out.print(num2 + " - " + intInitialVal + " = " );
        num2-=intInitialVal;
        System.out.println(num2);
        
        //Tests third test case: 67 (int)
        intInitialVal = 67;
        System.out.println("\nStarting number: " + num3);
        System.out.print(num3 + " * 2 = ");
        num3*=2;
        System.out.println(num3);
        System.out.print(num3 + " + 6 = ");
        num3+=6;
        System.out.println(num3);
        System.out.print(num3 + " / 2 = ");
        num3/=2;
        System.out.println(num3);
        System.out.print(num3 + " - " + intInitialVal + " = " );
        num3-=intInitialVal;
        System.out.println(num3);
        
        //Tests fourth test case: -30  (int)
        intInitialVal = -30;
        System.out.println("\nStarting number: " + num4);
        System.out.print(num4 + " * 2 = ");
        num4*=2;
        System.out.println(num4);
        System.out.print(num4 + " + 6 = ");
        num4+=6;
        System.out.println(num4);
        System.out.print(num4 + " / 2 = ");
        num4/=2;
        System.out.println(num4);
        System.out.print(num4 + " - " + intInitialVal + " = " );
        num4-=intInitialVal;
        System.out.println(num4);
        
        //Tests fifth test case:5.5 (double)
        doubleInitialVal = 5.5;
        System.out.println("\nStarting number: " + num5);
        System.out.print(num5 + " * 2 = ");
        num5*=2;
        System.out.println(num5);
        System.out.print(num5 + " + 6 = ");
        num5+=6;
        System.out.println(num5);
        System.out.print(num5 + " / 2 = ");
        num5/=2;
        System.out.println(num5);
        System.out.print(num5 + " - " + doubleInitialVal + " = " );
        num5-=doubleInitialVal;
        intNum5 = (int) (num5 + 0.5);
        System.out.println(intNum5);
        
        //Tests sixth test case:-6.7 (double)
        doubleInitialVal = -6.7;
        System.out.println("\nStarting number: " + num6);
        System.out.print(num6 + " * 2 = ");
        num6*=2;
        System.out.println(num6);
        System.out.print(num6 + " + 6 = ");
        num6+=6;
        System.out.println(num6);
        System.out.print(num6 + " / 2 = ");
        num6/=2;
        System.out.println(num6);
        System.out.print(num6 + " - " + doubleInitialVal + " = " );
        num6-=doubleInitialVal;
        intNum6 = (int) (num6 + 0.5);
        System.out.println(intNum6);
        
        //Tests seventh test case: 6.999999 (double)
        doubleInitialVal = 6.999999;
        System.out.println("\nStarting number: " + num7);
        System.out.print(num7 + " * 2 = ");
        num7*=2;
        System.out.println(num7);
        System.out.print(num7 + " + 6 = ");
        num7+=6;
        System.out.println(num7);
        System.out.print(num7 + " / 2 = ");
        num7/=2;
        System.out.println(num7);
        System.out.print(num7 + " - " + doubleInitialVal + " = " );
        num7-=doubleInitialVal;
        intNum7 = (int) (num7 + 0.5);
        System.out.println(intNum7);
        
        //Introduces a new riddle for the enhancement to the code, the resulting number is always 7!
        System.out.println("Now, here is another cool number riddle that always results \n in the number 7!");
        System.out.println("Enter a number (can be integer or double) so that we can test it \nwith the riddle!: ");
        // Source for this: https://www.w3schools.com/java/ref_scanner_hasnextdouble.asp
        // Through reverse engineering the first riddle, I was able to find that this also works as well.
        if (input.hasNextDouble()) {
            userInputNum = input.nextDouble();
            initialUserInputNum = userInputNum;
            userInputNum*=3;
            System.out.println(initialUserInputNum + " * 3 = " + userInputNum);
            System.out.print(userInputNum + " + 21 = ");
            userInputNum+=21;
            System.out.println(userInputNum);
            System.out.print(userInputNum + "/ 3 = ");
            userInputNum/=3;
            System.out.println(userInputNum);
            System.out.print(userInputNum + " - " + initialUserInputNum + " = " );
            userInputNum-=initialUserInputNum;
            //Rounding value if needed
            int intUserInputNum = (int) (userInputNum+0.5);
            System.out.println(intUserInputNum);
        } else {
            System.out.println("Only double or integer values allowed!");
        }
    }
}
