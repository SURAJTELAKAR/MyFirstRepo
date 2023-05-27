import java.util.Scanner;

public class Calculator {
  public int sum(int a,int b) {
      return a+b;
  }
  public int substract(int a,int b) {
      return a-b;
  }
  public int multiply(int a,int b) {
      return a*b;
  }
  public int devide(int a,int b) {
      return a/b;
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Second first number");
		int b=sc.nextInt();
		
		Calculator calc=new Calculator();
		
		System.out.println(a+" + "+b+" = "+calc.sum(a, b));
		System.out.println(a+" - "+b+" = "+calc.substract(a, b));
		System.out.println(a+" * "+b+" = "+calc.multiply(a, b));
		System.out.println(a+" / "+b+" = "+calc.devide(a, b));
		
		
     
	}

}
