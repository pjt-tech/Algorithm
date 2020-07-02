package max;

import java.util.Scanner;

public class Max2 {

	public static void main(String[] args) {
		
		int a,b,c,d,max;
		
		Scanner s = new Scanner(System.in);
		System.out.println("4개의 숫자중 최댓값을 구하자!");
		System.out.print("a값 입력 : ");
		a = s.nextInt();
		System.out.print("b값 입력 : ");
		b = s.nextInt();
		System.out.print("c값 입력 : ");
		c = s.nextInt();
		System.out.print("d값 입력 : ");
		d = s.nextInt();
		
		max = a;
		if(b>max)max = b;
		if(c>max)max = c;
		if(d>max)max = d;
		
		System.out.println("최댓값 = " + max);

	}
}
