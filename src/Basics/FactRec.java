package Basics;

public class FactRec {

	public static void main(String[] args) {
		// TO CALCULATE FACTORIAL OF A NUMBER BYRECURSION
		int x=5;
		System.out.println("  The Factorial of numeber"+x+ " is "+(Fact(x)));

	}
public static int Fact(int n) {
	if(n==0) {
		return 1;
	}
	System.out.print(n);
	return(Fact(n-1)*n);
	}}

