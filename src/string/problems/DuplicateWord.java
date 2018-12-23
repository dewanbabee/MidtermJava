package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] words =st.split(" ");
        String temp;
        //replacing period . from end of the words like Language.
        for(int i=0;i<words.length;i++) {

            temp= words[i].replace(".", "");
            words[i] = temp.toLowerCase();
           // System.out.println(words[i]);
        }

        int wordCount=1;

        for(int i=0;i<words.length;i++)		//Outer loop for Comparison
        {
            for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
            {

                if(words[i].equals(words[j]))
                {
                    wordCount=wordCount+1;
                    words[j]="0";
                }
            }
            if(words[i]!="0" && wordCount !=1 )
                System.out.println(words[i]+"-->"+wordCount);	//Printing the word along with count
            wordCount=1;

        }

    }

}
