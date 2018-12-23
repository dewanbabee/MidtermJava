package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

            String str = "ABC";
            int n = str.length();
            Permutation pr = new Permutation();
            pr.permute(str, 0, n - 1);


        }

        /**
         * permutation function
         * @param str string to calculate permutation for
         * @param l starting index
         * @param r end index
         */
        public void permute(String str,int l, int r)
        {
            if (l == r) {
                //count++;
                System.out.println(str);
            } else {
                for (int i = l; i <= r; i++) {
                    str = swap(str, l, i);
                    permute(str, l + 1, r);
                    //str= swap(str,l,i);
                }

            }
            //System.out.println(count);
        }
        private String swap (String str ,int i, int j)
        {
            char temp;
            char[] charArray = str.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);

        }



}

