
//1.1 Implement an algorithm to determine if a string has all unique characters.
//What if you can not use additional data structures?
public class Arrays_and_Strings_01_01 {

	
	public static void main(String[] args){ 
		System.out.println(checkUnique("aab"));
		System.out.println(checkUnique2("aab"));
		System.out.println(checkUnique3("aab"));		
	}
	
	// O(n^2 )
	public static boolean checkUnique( String sWord) {
		int i = 0;
		for (char c : sWord.toCharArray())  { // loop n times
			if (sWord.lastIndexOf(c)> i ) { // go through all character n times
				return false;
			}
			i++;
		}				
		return true;
	}
	
	// Time O(n) Space O(n)
	// if allowed to use data structure 
	public static boolean checkUnique2(String sWord) {
		boolean[] char_set = new boolean[256];
		for (char c : sWord.toCharArray()) {
			if (char_set[c]) return false;
			char_set[c] = true;
		}
		return true;
	}
	
	// Time O(1)
	//book solution 
	public static boolean checkUnique3(String str) {
	    if (str.length() > 256) { // NOTE: Are you sure this isn't 26?
	        return false;
	    }
	    int checker = 0;
	    for (int i = 0; i < str.length(); i++) {
	        int val = str.charAt(i) - 'a';
	        if ((checker & (1 << val)) > 0) return false;
	        checker |= (1 << val);
	    }
	    return true;
	}
}
