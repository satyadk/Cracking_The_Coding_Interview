
//Write code to reverse a C-Style String. 
//(C-String means that “abcd” is represented as five characters, 
//including the null character.)

public class Arrays_and_Strings_01_02 {

	
	public static void main(String[] args){ 
		System.out.println(reverseString("jlkajflkjuuimmn"));
		System.out.println(reverseString1("jlkajflkjuuimmn"));
	}
	
	// using the StringBuilder 
	// O(1)
	public static String reverseString( String sWord) {
		StringBuilder sbWord = new StringBuilder(sWord);
		return sbWord.reverse().toString();
	}

	
	public static String reverseString1(String sWord){
		  char[] chArray = sWord.toCharArray();
		  int iLen = chArray.length;
		  int i, j;
		  char tmp;
		  for(i = 0, j = iLen-1; i <j; i++, j--){
		    tmp = chArray[i];
		    chArray[i] = chArray[j];
		    chArray[j] = tmp;
		  }
		return new String(chArray);
	}
}
