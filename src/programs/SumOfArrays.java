package programs;



//Given an array, find the largest product of two consecutive elements.
//if A = {5,1,3,4,2} and B = {8,10,9,7,6} then a possible sum of product is 5*6 + 1*7 + 3*9 + 4*10 + 2*8.



public class SumOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sumArrayElements());
		

	}
	
	public static int sumArrayElements() {
		
		int a[] = {1,3,4,2};
		int b[] = {8,10,9,7};
		int sum = 0;
		int index_2=0;
		int length = a.length-1;
		
		for (int index1=0;index1<=length; index1++) {
			index_2 = length - index1;
			sum = sum + (a[index1]*b[index_2]);
		}
		
		return sum;
		
	}

}
