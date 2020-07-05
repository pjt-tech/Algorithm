package selection_sort;

public class Selection {

	public static void main(String[] args) {
		//현재 배열을 출력하고 선택정렬을 한 뒤 다시 출력하여 확인
		int[] data = {7,9,5,6,4,3,2,1,8};
		
		print(data);
		
		sort(data);
		
		print(data);
	}

	public static void sort(int[] data){
		
		int min_index; //가장 작은 수의 인덱스 
		
		//첫번째 for문은 기준이 되는 수를 정한다
		for(int i = 0; i<data.length-1; i++) {
			min_index = i;
			//두번째 for문에서는 기준이되는 수와 그뒤 의 수를 비교하여 가장 낮은수를 기준이되는 인덱스로 교체하는 방식
			for(int j=i+1; j<data.length; j++) {
				if(data[min_index] > data[j]) {
					min_index = j;
				}
			}
			swap(data,min_index,i);
		}
	}
	public static void print(int[] data) {
		//현재 배열을 순차적 접근을 통하여 출력한다.
		System.out.print("[");
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println("]");
	}
	public static void swap(int[]data,int min_index,int i) {
		int temp; //swap이 이루어 질때 임시로 값을 저장해 놓을 변수
		
		//기준이 되었던 수와 가장 작은수가 바뀌는 과정
		temp = data[min_index];
		data[min_index] = data[i];
		data[i] = temp;
	}
}
