package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want the factorial for : ");

        int input = sc.nextInt();
        int factorial1 = recursivefact(input);
        int factorial2 = iterativefact(input);
        System.out.println("Recursive Factorial " + factorial1);
        System.out.println("Recursive Factorial " + factorial2);
    }
    static int recursivefact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = recursivefact(n-1)* n;
        return output;


    }
    static int iterativefact(int n)
    {
        int fact =1;
        for(int i = 1;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
}
