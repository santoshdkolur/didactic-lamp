/*
 * Given a long sentence, reverse each word of the sentence individually in the sentence itself
 * Examples:
 * 
 * Input : Geeks For Geeks is good to learn
 * Output : skeeG roF skeeG si doog ot nrael
 * 
 * Input : Split Reverse Join
 * Output : tilpS esreveR nioJ
 */

//Author:Nisarg Devdhar
public class reverseWords
{
   public void reverseWordInMyString(String str)
   {
	
	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	reverseWords obj = new reverseWords();
	obj.reverseWordInMyString("Java is easy");
	//obj.reverseWordInMyString("");
   }
}