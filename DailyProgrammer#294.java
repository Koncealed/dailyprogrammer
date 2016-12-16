import java.util.Scanner;
public class Solution {
	public static boolean checkIfAllTrue(boolean[] testBool) {
		for(boolean b : testBool) 
			if(!b)
				return false;
	    return true;
	}
	public static boolean scrabbleCheck(String word1, String word2) {
		char questionMark = '?';
		boolean[] indexCheck = new boolean[word2.length()];
		for(int i = 0; i < word1.length();++i) {
			for(int j = 0; j < word2.length();++j) {
				if(word1.charAt(i) == word2.charAt(j) && indexCheck[j] == false) {
					indexCheck[j] = true;
					break;
				} else if(word2.charAt(j) == questionMark && indexCheck[j] == false) {
					indexCheck[j] = true;
					break;
				}
			}
		}
		return checkIfAllTrue(indexCheck);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in the word you want to attempt");
		String word1 = scan.nextLine();
		System.out.println("Enter in the word you want to test against");
		String word2 = scan.nextLine();
		System.out.println(scrabbleCheck(word1,word2));
		
	}
}
