package selection_sort;

public class Selection {

	public static void main(String[] args) {
		
		int[] data = {7,5,6,4,3,2,1};
		
		System.out.print("[");
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println("]");
		
		Selection sel = new Selection();
		sel.sort(data);
		
		System.out.print("[");
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
		}
		System.out.println("]");
	}

	public void sort(int[] data){
		
		int min;
		int temp;
		
		for(int i = 0; i<data.length-1; i++) {
			min = i;
			for(int j=i+1; j<data.length; j++) {
				if(data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}
}
