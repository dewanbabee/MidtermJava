package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string you want to test");
        String testString = sc.nextLine();
        System.out.println(palindrome(testString));

    }
    public static String palindrome(String word){
        char[] charArray = word.toLowerCase().toCharArray();
        String newWord = "";
        for (int i = charArray.length-1; i >= 0 ; i--) {
            newWord += charArray[i];
        }
        if(word.equalsIgnoreCase(newWord)){
            System.out.println("This is a Palindrome");
        }else {
            System.out.println("This is not a Palindrome");

        }
        return "";
    }
}
