public class Triangle {
	public static void main (String[] arg) {
		int a = 5;
		int b = 4;
		int c = 3;
		if(check(a,b,c)) System.out.println("Triangle possible");
		if(!check(a,b,c)) System.out.println("Triangle not possible");
		
	}
	
	public static boolean check(int a, int b, int c) {
		if (a>0 && b>0 && c>0) {
			if (c>=a && c>=b && (a*a)+(b*b)==(c*c)) {
				return true;
			}
			if (a>=b && a>=c && (c*c)+(b*b)==(a*a)) {
				return true;
			}
			if (b>=a && b>=a && (a*a)+(c*c)==(b*b)) {
				return true;
			}
		}
		return false;
	}
}
