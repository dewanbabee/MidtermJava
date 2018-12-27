package math.problems;


import org.testng.Assert;
import org.testng.annotations.Test;
import string.problems.Palindrome;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static org.testng.Assert.assertEquals;

public class UnitTestingMath {

        //Apply Unit testing into each classes and methods in this package.
        static PrintStream save_out;
        static final ByteArrayOutputStream out = new ByteArrayOutputStream();

        public static void main(String[] args) {
            save_out = System.out;
            System.setOut(new PrintStream(out));
            testPrime();
            testLowestNumber();
            testFindMissingNumber();
            testFibonacci();


            System.setOut(save_out);
            System.out.println("Test Passed");

    }

        @Test
        public static void testPrime(){
            try {
                PrimeNumber.prime(2, 10);

                assertEquals(out.toString(), "2\r\n3\r\n5\r\n7\r\n","Test fails..Expected result has not been met");
            }catch(Exception ex) {
                              ex.getMessage();
            }
            finally {
                out.reset();
            }

        }

/* This method only test if the program fins the lowest number. Does not check for database connectivity. So please
comment the code that deals with database connectivity and console output before testing
 */
    @Test
    public static void testLowestNumber() {

        String[] args = {};
        LowestNumber.main(args);

       try {
           assertEquals(out.toString(), "Lowest number in this array is  5\r\n", "Test failed");
       }catch(Exception ex){
           ex.getMessage();
       }
       finally {
           out.reset();
       }

    }

    @Test
    public static void testFindMissingNumber(){
        try {
            int[] a = {2,3,4,5};
            int n = a.length+1;

            int result = FindMissingNumber.findmissing(a, n);

            assertEquals(result, 1,"Test fails..Expected result has not been met");
        }catch(Exception ex) {
            ex.getMessage();
        }


    }
    @Test
    public static void testFibonacci(){
        String[] args = {};
        Fibonacci.main(args);

        try {
            assertEquals(out.toString(), "First 5 numbers: 0  1  1  2  3  ", "Test failed");
        }catch(Exception ex){
            ex.getMessage();
        }
        finally {
            out.reset();
        }


    }
}
