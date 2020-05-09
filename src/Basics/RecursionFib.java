package Basics;

public class RecursionFib {

	public static void main(String[] args) {
		//THIS PROGRAM IS TO SHOW THE Nth FIBONACCI NUMBER
		int n=10;
		System.out.println("THE "+n+ "th fibonacci number is " +Fibo(n));
		

	}
public static int Fibo(int n) {
	if(n==0) {
		return 0;
	}
	else if (n==1) {
		return 1;
	}
		return(Fibo(n-1)+Fibo(n-2));
	
}
}

