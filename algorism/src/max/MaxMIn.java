package max;

import java.util.Scanner;

public class MaxMIn {

	public static void main(String[] args) {
		
		int a,b,c;
		//�ִ밪,�ּҰ� ���� �� ����
		int max,min;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a�� : ");
		a = s.nextInt();
		
		System.out.print("b�� : ");
		b = s.nextInt();
		
		System.out.print("c�� : ");
		c = s.nextInt();
		 
		//���ǹ��� ���Ͽ� ���ǿ� �ش��ϸ� �ִ밪�� �ٲ��ش�. ������ ����
		max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		//�ݴ�� �ּҰ��� ���մϴ�.
		min = b;
		if(a<min) min = a;
		if(c<min) min = c;
	
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}
}
