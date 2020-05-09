package Basics;

public class calcfunc {

	public static void main(String[] args) {
		System.out.println("Hey this is a program on functions");
		showfunc();
		int Num1=20;
		int Num2=20;
		addfunc(Num1,Num2);
		System.out.println("The product of "+ Num1 + " and "+ Num2 + " is " +mulfunc(Num1,Num2));
		


	}
	static void showfunc() {
		System.out.println("The function will now be shown");
	}
	static void addfunc(int x,int y) {
		int sum=x+y;
		System.out.println("The sum of numbers "+x+ " and " +y+ " is "  +sum);
	}
	static int mulfunc(int a, int b) {
		int product=a*b;
		return product;
	}
}