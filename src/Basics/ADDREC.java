package Basics;

public class ADDREC {

	public static void main(String[] args) {
		// TO ADD 1 to N numbers
System.out.println("The answer is  "+Ad(5));
	}
public static int Ad(int n) {
	int sum=0;

	for(int i=0;i<=n;i++) {
		System.out.print(sum+" + "+i+"=");
	sum=sum+i;
	System.out.println(sum);
	}
	return sum;
}
}
