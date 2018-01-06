//1.3 Design an algorithm and write code to remove the duplicate characters in a 
//string without using any additional buffer. 
//NOTE: One or two additional variables are fine.
//An extra copy of the array is not.
public class Arrays_and_Strings_01_03 {

	
	public static void main(String[] args){ 
		System.out.println(removeDups("aab"));
		
	}
	
	// O(n^2 )
	public static String removeDups(String sWord)
	{
		if ( sWord == null ) return null;
		char[] charArray = new char[sWord.length()];

		int count = 0;
		boolean present = false;
		for (int i = 0 ; i < sWord.length() ; i++ )
		{
			present = false;
			char c = sWord.charAt(i);
			for (int j = 0 ; j < count ; j++)
			{
				if (charArray[j] == c)
				{
					present = true;
				}
			}
			if (!present)
			{
				charArray[count++] = c;
			}
		}
		return new String(charArray);
	}
	
}
