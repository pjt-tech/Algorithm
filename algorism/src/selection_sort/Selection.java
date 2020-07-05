package selection_sort;

public class Selection {

	public static void main(String[] args) {
		//���� �迭�� ����ϰ� ���������� �� �� �ٽ� ����Ͽ� Ȯ��
		int[] data = {7,9,5,6,4,3,2,1,8};
		
		print(data);
		
		sort(data);
		
		print(data);
	}

	public static void sort(int[] data){
		
		int min_index; //���� ���� ���� �ε��� 
		
		//ù��° for���� ������ �Ǵ� ���� ���Ѵ�
		for(int i = 0; i<data.length-1; i++) {
			min_index = i;
			//�ι�° for�������� �����̵Ǵ� ���� �׵� �� ���� ���Ͽ� ���� �������� �����̵Ǵ� �ε����� ��ü�ϴ� ���
			for(int j=i+1; j<data.length; j++) {
				if(data[min_index] > data[j]) {
					min_index = j;
				}
			}
			swap(data,min_index,i);
		}
	}
	public static void print(int[] data) {
		//���� �迭�� ������ ������ ���Ͽ� ����Ѵ�.
		System.out.print("[");
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println("]");
	}
	public static void swap(int[]data,int min_index,int i) {
		int temp; //swap�� �̷�� ���� �ӽ÷� ���� ������ ���� ����
		
		//������ �Ǿ��� ���� ���� �������� �ٲ�� ����
		temp = data[min_index];
		data[min_index] = data[i];
		data[i] = temp;
	}
}
