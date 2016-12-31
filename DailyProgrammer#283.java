import java.util.*;

class anagramChecker
{
	public static boolean anagramCheck(String anagramOne, String anagramTwo){
		char[] firstAnagram = anagramOne.replaceAll("\\s+", "").toLowerCase().toCharArray();
		Arrays.sort(firstAnagram);
		String firstAna = new String(firstAnagram);
		char[] secondAnagram = anagramTwo.replaceAll("\\s+", "").toLowerCase().toCharArray();
		Arrays.sort(secondAnagram);
		String secondAna = new String(secondAnagram);
		return firstAna.equals(secondAna);
	}
	
}

class Application
{
    public static void main(String[] args){
    	Scanner anagrams = new Scanner(System.in);
    	System.out.println("Please enter in a a phrase and we will check if it is a Anagram");
    	String anagramOne = anagrams.nextLine();
    	System.out.println("Please enter in a a phrase and we will check if it is a Anagram");
    	String anagramTwo = anagrams.nextLine();
	System.out.println(anagramChecker.anagramCheck(anagramOne, anagramTwo) : "They are Anagrams" ? "They are NOT Anagrams"); 
    }
}
