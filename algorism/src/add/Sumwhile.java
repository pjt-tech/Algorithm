package add;

import java.util.Scanner;

public class Sumwhile {

	public static void main(String[] args) {
		//1���� n������ ���� �� ���ϱ� while�� for�� �̿�
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n���� �� while��");
		int i = 1;
		System.out.print("�Է� : ");
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
		System.out.println("��� : " + result);
		System.out.println("----------------");
		System.out.println("1���� n���� �� for��");
		System.out.print("�Է� : ");
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
		System.out.println("��� : " + sum);
	}
}
