import java.util.Arrays;

//1.4 Write a method to decide if two strings are anagrams or not.
public class Arrays_and_Strings_01_04 {

	
	public static void main(String[] args){ 
		System.out.println(anagramsCheck("anagram","Nag a ram"));
		
	}
	
	
	public static boolean anagramsCheck(String sWord, String sSecondWord)
	{
		//space complexity O(2n) = O(n)
		char[] oneArray = sWord.toUpperCase().replaceAll("\\s", "").toCharArray();
		char[] twoArray = sSecondWord.toUpperCase().replaceAll("\\s", "").toCharArray();		
		
		//time complexity O(2nlog(n)) = O(nlog(n))
		Arrays.sort(oneArray);
		Arrays.sort(twoArray);

		//time complexity O(n) 
		if (new String(oneArray).equalsIgnoreCase(new String(twoArray))) {
			return true ;
		}  

		//total time complexity O(n + nlog(n)) = O(nlog(n))
		return false;
		
	}
	
	// time O(n ^ 2)
	public boolean checkAnagrams(String inputString1, String inputString2)
	{
		if (inputString1 == null || inputString2 == null || inputString1.length() != inputString2.length())
		{
			return false;
		}

		int[] characters = new int[256];

		for (int i = 0; i < inputString1.length() ; i++)
		{
			characters[inputString1.charAt(i)]++;
		}
		for (int i = 0; i < inputString2.length() ; i++)
		{
			if (characters[inputString2.charAt(i)] <= 0)
				return false;
			characters[inputString2.charAt(i)]--;	
		}
		return true;

	}	

}
