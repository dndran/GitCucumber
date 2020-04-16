package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Single_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {2,2,1};
		int result = singlenumber(nums);
		System.out.println(result);

	}
	
	public static int singlenumber(int[] nums) {
		
		int putout = 0;
		HashMap <Integer, Integer> HM = new HashMap<>();
		for(int i=0;i<=nums.length - 1;i++) {
			putout = HM.put(nums[i], i);
			
			if(HM.containsKey(null)) {
				
			}
			System.out.println(putout);
			
			//System.out.println(HM);
		}
		
		return 0;
		
	}

}
