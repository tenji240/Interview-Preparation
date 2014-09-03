package sorting;

public class MergeSort {
	
	public static int[] merge(int[] left, int [] right, int[] array){
		
		//set the counters for the left, right and main
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;
		
		//keep grabbing the smallest element until one is exhausted
		//if smallest exists, overrite in main array and increment
		while((i < leftSize) && (j < rightSize)){
			if(left[i] < right[j]){
				array[k] = left[i];
				i++;
			}
			else{
				array[k] = right[j];
				j++;
			}
			k++;
		}
		
		//check for left if it is exhausted
		while(i < leftSize){
			array[k] = left[i];
			i++; 
			k++;
		}
		
		//check for right if it is exhausted
		while(j < rightSize){
			array[k] = right[j];
			j++;
			k++;
		}
		return array;
	}
	
	//Recursive Implementation of MergeSort
	public static int[] mergeSort(int[] array){
		
		int n = array.length;
		
		if(n < 2)
			return array;
		else{
			int mid = n/2;
			int[] left = new int[mid];
			int[] right = new int[n-mid];
			
			//Split the array into left and right halves
			for(int i = 0; i < mid; i++){
				left[i] = array[i];
			}
			
			for(int j = mid; j < n; j++){
				right[j-mid] = array[j];
			}
			
			//send to split again
			mergeSort(left);
			mergeSort(right);
			
			//merge them back together
			merge(left, right, array);
		}
		
		//return the array
		return array;
		
	}
	
	
	public static void main(String[] args) {
		int[] array = {2,4,1,6,9,8,5,3,7};
		for(int i: array){
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] newArray = mergeSort(array);
		for(int i: newArray){
			System.out.print(i + " ");
		}

	}

}
