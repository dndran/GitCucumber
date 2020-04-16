package programs;

public class DefangingIPAddress {

/**
 * Defanging an IP Address
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "255.100.50.0";
		System.out.println(deFang(str));

	}
	
	public static String deFang(String str) {
		
		String OP = str.replace(".", "[.]");
		
		
		return OP;
	}

}
