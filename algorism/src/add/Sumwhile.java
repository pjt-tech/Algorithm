package add;

import java.util.Scanner;

public class Sumwhile {

	public static void main(String[] args) {
		//1부터 n까지의 정수 합 구하기 while문 for문 이용
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지 합 while문");
		int i = 1;
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int result = 0;
		while(i<=num) {
			result+=i;
			if(i<num) {
				System.out.print(i+ " + ");
			}else {
				System.out.println(i+" = "+result);
			}
			i++;
		}
		System.out.println("결과 : " + result);
		System.out.println("----------------");
		System.out.println("1부터 n까지 합 for문");
		System.out.print("입력 : ");
		num = sc.nextInt();
		int sum = 0;
		for(int j=1; j<=num; j++) {
			sum+= j;
			if(j<num) {
				System.out.print(j+ " + ");
			}else {
				System.out.println(j+" = "+sum);
			}
		}
		System.out.println("결과 : " + sum);
	}
}
