package programs;

/*
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class SumIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,11,7,15};
		int target = 9;
		try {
			int[] result = twoSum(nums, target);
			
	//		result.forEach(i -> System.out.println(i));
			
			for(int i : result) {
				System.out.println(i);
			}
		} catch(IllegalArgumentException ex) {
			System.err.println(ex.getMessage());
//			ex.printStackTrace();
		}
		
	}


public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == target - nums[i]) {
                return new int[] { i, j };
            }
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}

}

	
	
