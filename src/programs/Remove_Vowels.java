package programs;

import java.io.UnsupportedEncodingException;

public class Remove_Vowels {
	
/**
 * Remove the vowels from the given string
 * 1. Create a String variable str and store the input
 * 2. Convert the given string into a character array char[] charStr
 * 3. Create a pointer and loop through the character array till the length of the character array
 * 4. Check if the character is a or e or i or o or u and if the vowels are there then ignore the same
 * 5. Save the output in another character array
 * 6. Convert the character array into string
 * 7. Return the String.
 * @throws UnsupportedEncodingException 
 * 
 */

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		System.out.println(removeVowels("leetcodeisacommunityforcoders"));		
		String str = "leetcodeisacommunityforcoders";
//		System.out.println(str.replaceAll("[aeiou]", ""));
		
		}
	
	public static String removeVowels(String str) throws UnsupportedEncodingException {
		
		
		String str1 = str;
		String OPStr = null;
		char chStr[];
		char chOStr[] = new char[str1.length()];
		
		chStr = str1.toCharArray();
		for(int i=0; i<=str1.length()-1; i++) {
			if(chStr[i] == 'a' || chStr[i] == 'e'|| chStr[i] == 'i' || chStr[i] == 'o' || chStr[i] == 'u') {
				continue;				
			}
			else {
				chOStr[i] = chStr[i];
			}
		}
		
	
		OPStr =   new String(chOStr);
		OPStr = OPStr.replaceAll("\\u0000","");
	
		return OPStr;
		
	}

}
