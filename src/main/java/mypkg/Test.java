package mypkg;
public class Test {
	public static void main(String[] args) {
		
		MyCalculator calc = new MyCalculator();
		System.out.println("Sum is = "+calc.sum(20, 10));
		System.out.println("Diff is "+calc.diff(20, 10));
		System.out.println("Multiplication is "+calc.mul(20, 10));
	}

}
