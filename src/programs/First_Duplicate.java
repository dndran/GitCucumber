package programs;

import java.util.HashMap;
import java.util.Map;

public class First_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(firstDuplicate());
		System.out.println(firstDuplicate1());
	}
	
private static int firstDuplicate1() {
	int[] nums = {1, 2,  4, 3, 7, 5, 4, 5, 1, 5, 2};
		Map<Integer, Integer> hm = new HashMap();
		int dup = -1;
		for(int i: nums) {
			Integer temp = hm.get(nums[i]);
			if(null == temp) {
				hm.put(nums[i], 1);	
			} else {
				hm.put(nums[i], temp++);
			}
			
		}
		return dup;
	}

//	public static int firstDuplicate() {
//		int[] nums = {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
//		int duplicate = 0;
//		for (int i=0; i< nums.length - 1;i++) {
//			for (int j=1; j<nums.length; j++) {
//				if(nums[i] == nums[j]) {
//					duplicate = nums[i];
//					System.out.println(duplicate);
//				}
//			}
//		}
//		return duplicate;
//	}

	
	
	public static int firstDuplicate() {
		int[] nums = {2,  4, 3, 7, 5, 4, 1, 5, 2};
		int duplicate = -1;
		for (int i=0; i< nums.length;i++) {
			for (int j=i+1;j<nums.length ;j++) {
				if(nums[i] == nums[j]) {
					duplicate = nums[i];
					break;
				}
			}	
			if(duplicate > 0) {
				break;
			}
			
		}
		
		return duplicate;
	}
}
