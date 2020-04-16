package programs;

/**
 * 
 * @author devendrankrishnan
 * Program to find all the unique character in a given string
 * 1. Declare a string and store the string as input - String str = "java"
 * 2. Convert the given string into a character array and store it in the same - char[] chararray 
 * 3. Declare a pointer and point it to the 0th index of the given string
 * 4. Declare another pointer and point it to 1st index of the given string
 * 5. Loop throught the pointers and compare the character in 0th index with all the charcaters in the string
 * 6. Declare a character array to store the resultant unique characters.
 * 7. Convert the character array to string
 * 8. Return the string 
 */

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		uniqueString("Java"); 

	}
	
	//Access modifier / return type / function name(String str)
	public static String uniqueString(String str) {
		
		String ipstr = "java";
		char a[] = ipstr.toCharArray();
		char[] b = null;
		
		for(int i=0;i<=ipstr.length(); i++) {
			for(int j=1;j<=ipstr.length(); j++) {
				if(i == j);
			}
		}
		

		
		
		
		return null;
		
	}

}
