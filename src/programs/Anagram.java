package programs;

import java.util.Arrays;
import java.util.Scanner;

class Anagrams {

	  static boolean isAnagram(String a, String b) {
	        char c[] = a.toLowerCase().toCharArray();
	        char d[] = b.toLowerCase().toCharArray();
	        Arrays.sort(c);
	        Arrays.sort(d);
	        if(Arrays.equals(c,d)){
	            return true;
	        }
	        return false;
	    }



	  public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	    System.out.println("Enter first String: ");
	    String a = scan.next();
	    System.out.println("Enter seconf jumbled String");
	    String b = scan.next();
	    scan.close();
	    boolean ret = isAnagram(a, b);
	    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}