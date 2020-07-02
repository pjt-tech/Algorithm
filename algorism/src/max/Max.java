package max;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		
		int a,b,c;
		int max,min;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a값 : ");
		a = s.nextInt();
		
		System.out.print("b값 : ");
		b = s.nextInt();
		
		System.out.print("c값 : ");
		c = s.nextInt();
		
		max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		min = b;
		if(a<min) min = a;
		if(c<min) min = c;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
}
