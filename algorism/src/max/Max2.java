package max;

import java.util.Scanner;

public class Max2 {

	public static void main(String[] args) {
		
		int a,b,c,d,max;
		
		Scanner s = new Scanner(System.in);
		System.out.println("4���� ������ �ִ��� ������!");
		System.out.print("a�� �Է� : ");
		a = s.nextInt();
		System.out.print("b�� �Է� : ");
		b = s.nextInt();
		System.out.print("c�� �Է� : ");
		c = s.nextInt();
		System.out.print("d�� �Է� : ");
		d = s.nextInt();
		
		max = a;
		if(b>max)max = b;
		if(c>max)max = c;
		if(d>max)max = d;
		
		System.out.println("�ִ� = " + max);

	}
}
