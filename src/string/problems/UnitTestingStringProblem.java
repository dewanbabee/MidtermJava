package string.problems;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static org.testng.Assert.assertEquals;

public class UnitTestingStringProblem {
    static PrintStream save_out;
    static final ByteArrayOutputStream out= new ByteArrayOutputStream(); ;

  public static void main(String[] args) {
       save_out = System.out;
      System.setOut(new PrintStream(out));
        //Apply Unit Test into all the methods in this package.
        Permutation testPer = new Permutation();


        RunTestng rn = new RunTestng();


        rn.testPalindrome();

        rn.testNotPalindrome();





////            testPer.permute("ABC",0,2);
////            assertEquals("ABC\r\nACB\r\nBAC\r\nBCA\r\nCAB\r\nCBA\r\n", out.toString());
//            @BeforeTest
//            String st = Palindrome.palindrome("dad");
//            assertEquals("This is a Palindrome\r\n",out.toString());
//
//            @Test
//            String st2 = Palindrome.palindrome("add");
//            assertEquals("This is not a Palindrome\r\n",out.toString());

            System.setOut(save_out);
            System.out.println("Test Passed");




    }

    public static class RunTestng
            {


        @BeforeTest

        public static void testPalindrome()
        {

            String st = Palindrome.palindrome("dad");
            assertEquals( out.toString(), "This is a Palindrome\r\n");
            out.reset();

            //System.setOut(save_out);
        }
        @Test
               public static void testNotPalindrome() {
        String st2 = Palindrome.palindrome("add");
      assertEquals( out.toString(),"This is not a Palindrome\r\n");
            out.reset();
    }
    }
    @AfterTest
    public static void testPermutation()
    {
       Permutation pr = new Permutation();
        pr.permute("ABC",0,2);
        assertEquals(out.toString(),"ABC\r\nACB\r\nBAC\r\nBCA\r\nCAB\r\nCBA\r\n");
        out.reset();
        System.setOut(save_out);
        System.out.println("Test Passed");

    }
}
