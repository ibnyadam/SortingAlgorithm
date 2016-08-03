public class InsertionSort {

	public static void main(String args[]){
		int[] list = {10,34,2,56,7,67,88,42};
		int[] sorted = InsertionSort.sort(list);
		for(int i:sorted){
            System.out.print(i);
            System.out.print(", ");
        }
	}

	public static int[] sort(int[] list){
		int i,j,temp;
		for(i=1;i<list.length;i++){
			for(j=i;j>0;j--){
				if(list[j] < list[j-1]){
					temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}
			}
		}
		return list;
	}
}
