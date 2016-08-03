public class SelectionSort {

	public static void main(String args[]){
		int[] list = {10,34,2,56,7,67,88,42};
		int[] sorted = SelectionSort.sort(list);
		for(int i:sorted){
		    System.out.print(i);
		    System.out.print(", ");
		  }
	}

	public static int[] sort(int[] list){
		int i,j,temp,minIndex;
		int length = list.length;
		for(i=0;i<length;i++){
			minIndex = i;
			for(j=i+1;j<length;j++){
				if(list[j]<list[minIndex]){
					minIndex = j;
				}
			}
			
			if(minIndex != i){
				temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
		return list;
	}
}
