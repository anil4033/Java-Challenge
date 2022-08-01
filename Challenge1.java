package javaChallenge;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given a string s consisting of words and spaces, return the length of the last word in the string.
           A word is a maximal substring consisting of non-space characters only.
         Example 1:

         Input: s = "Hello World"
         Output: 5
         Explanation: The last word is "World" with length 5.
         Example 2:

         Input: s = "   fly me   to   the moon  "
         Output: 4
         Explanation: The last word is "moon" with length 4.
         Example 3:

         Input: s = "luffy is still joyboy"
         Output: 6
         Explanation: The last word is "joyboy" with length 6.
		 */
		
		/* Pseudo code
		 * 
		 * Take the input string and Split the input srting
		 * Then read the last word from the String array
		 * Convert that last word to character array.
		 * ue charArray.length to get the length of string.
		 */
		String s = "luffy is still joyboy";
		
		String[] split = s.split("\\s");
		
		char[] charArray = split[split.length-1].toCharArray();
		
		int length = charArray.length;
		
		System.out.println(length);
		
	}

}
