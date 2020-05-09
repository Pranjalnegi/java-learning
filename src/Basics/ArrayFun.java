package Basics;

public class ArrayFun {

	public static void main(String[] args) {
		// TO CREATE 3 FUNCTIONS TO FIND MIN MAX AND AVG OF AN ARRAY
		int [] num= {1,34,576,-4,66,99,543,-335};
		System.out.println("The smallest number is "+Min(num));
		System.out.println("The largest number is "+Max(num));
		System.out.println("The average of numbers is "+Avg(num));
		
		

	}
	public static int Min(int []n) {
		int min= n[0];
		for(int i=0;i<n.length;i++) {
			if( min >n[i]) {
				min=n[i];
			}
		}
		return min;

}
	public static int Max(int [] arr) {
		int max=arr[0];
		for(int x=0;x<arr.length;x++) {
			if(max<arr[x]) {
				max=arr[x];
			}
		}
	return max;
	}
	public static int Avg(int []array){
		int sum=0;
		int avg=0;
		for(int j=0;j<array.length;j++) {
			sum=sum+array[j];
		}
		avg=sum/array.length;
		return avg;
	}
	
}