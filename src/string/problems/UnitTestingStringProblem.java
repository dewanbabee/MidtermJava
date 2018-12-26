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
    static final ByteArrayOutputStream out = new ByteArrayOutputStream();


    public static void main(String[] args) {
        save_out = System.out;
        System.setOut(new PrintStream(out));
        //Apply Unit Test into all the methods in this package.



        RunTestng.testPalindrome();

        RunTestng.testNotPalindrome();
        RunTestng.testPermutation();
        RunTestng.testDuplicateWord();
        RunTestng.testDetermineLargestWord();
        RunTestng.testAnargram();


        System.setOut(save_out);
        System.out.println("Test Passed");


    }

    public static class RunTestng {


        @BeforeTest

        public static void testPalindrome() {

            String st = Palindrome.palindrome("dad");
            assertEquals(out.toString(), "This is a Palindrome\r\n");
            out.reset();

            //System.setOut(save_out);
        }

        @Test
        public static void testNotPalindrome() {
            String st2 = Palindrome.palindrome("add");
            assertEquals(out.toString(), "This is not a Palindrome\r\n");
            out.reset();
        }

        @AfterTest
        public static void testPermutation() {
            Permutation pr = new Permutation();
            pr.permute("ABC", 0, 2);
            assertEquals(out.toString(), "ABC\r\nACB\r\nBAC\r\nBCA\r\nCAB\r\nCBA\r\n");
            out.reset();

            //System.out.println("Test Permutaion Passed");

        }

        @Test
        public static void testDuplicateWord() {

            String[] args = {};
            DuplicateWord.main(args);


            assertEquals(out.toString(), "java-->3\r\nis-->3\r\nlanguage-->2\r\n");
            out.reset();

        }

        @Test
        public static void testDetermineLargestWord() {

            String st = "Human brain is a biological learning machine";
            DetermineLargestWord.findTheLargestWord(st);
            assertEquals(out.toString(), "10 biological\r\n");
            out.reset();
            System.setOut(save_out);
        }

        @Test
        public static void testAnargram() {


            assertEquals(Anagram.isAnagram("ANAGRAM", "MARGANA"), true);
            System.out.println("Test Anagram passed");
        }
    }
}