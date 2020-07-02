package max;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
		//醞懈高 掘ж晦
		int a,b,c;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a高 : ");
		a = s.nextInt();
		System.out.print("b高 : ");
		b = s.nextInt();
		System.out.print("c高 : ");
		c = s.nextInt();
		
		System.out.println("醞懈高 = " + middle(a,b,c));
		s.close();
	}
	
	public static int middle(int a,int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			}else if(a<=c) {
				return a;
			}else return c;
		}else if(a>c) {
			return a;
		}else if(b>c) {
			return c;
		}else return b;
	}
}
