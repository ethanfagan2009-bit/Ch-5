public class Fermat {
	public static void main(String[] arg) {
		meth(1, 0, 1 , 3);
	}
	
	public static void meth(int a, int b, int c, int n) {
		if(Math.pow(a, n) + Math.pow(b, n) + Math.pow(c, n)==c && n>2) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn't work"); 
		}
		
	}
}
