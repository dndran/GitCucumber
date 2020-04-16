package programs;

public class StepsReducetoZero {
	
/**
 * Number of Steps to Reduce a Number to Zero
 * Given a non-negative integer num, 
 * return the number of steps to reduce it to zero. 
 * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * 
 * Store an integer number in a int num = 123
 * Check if the given number is odd or even. If the number is odd then subtract 1 and increase the counter of the step as 1
 * Now divide the number by 2 and add the counter of step to 2
 * loop through the above steps till the number become 0
 * 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		System.out.println(reduceZero(num));

	}
	
	public static int reduceZero(int num) {
		
		int num1 = num;
		int step = 0;
		
		while (num1 > 1) {
			
			if(num1 % 2 == 0) {
				num1 = num1 / 2;
				step = step + 1;
			}
			else if(num1 % 2 != 0) {
				num1 = num1 - 1;
				step = step + 1;
				num1 = num1 / 2;
				step = step + 1;
			}
			
			if(num1 == 0) {
				step = step + 1;
				break;
			}
			
		}
		
		if(num1 == 1) {
			num1 = num1 - 1;
			step = step + 1;
		}
		
		return step;
	}

}
