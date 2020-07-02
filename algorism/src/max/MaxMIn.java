package max;

import java.util.Scanner;

public class MaxMIn {

	public static void main(String[] args) {
		
		int a,b,c;
		//최대값,최소값 저장 할 변수
		int max,min;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a값 : ");
		a = s.nextInt();
		
		System.out.print("b값 : ");
		b = s.nextInt();
		
		System.out.print("c값 : ");
		c = s.nextInt();
		 
		//조건문을 통하여 조건에 해당하면 최대값을 바꿔준다. 순차적 구조
		max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		
		//반대로 최소값을 구합니다.
		min = b;
		if(a<min) min = a;
		if(c<min) min = c;
	
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
}
