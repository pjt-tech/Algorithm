package max;

import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
		//�߾Ӱ� ���ϱ�
		int a,b,c;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a�� : ");
		a = s.nextInt();
		System.out.print("b�� : ");
		b = s.nextInt();
		System.out.print("c�� : ");
		c = s.nextInt();
		
		System.out.println("�߾Ӱ� = " + middle(a,b,c));
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
