import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		formula(a,b,c);
	}
	
	public static void formula(int a, int b, int c) {
		if(a==0 || (int) Math.pow(b,2) + (-4*a*c)<0) {
			System.out.println("undefined");
		} else {
			double awns1= (-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
			double awns2= (-b - Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
			System.out.println(awns1);
			System.out.println(awns2);
		}
		
	}
}
