package algorithm;

public class BinarySearch {

	static int BinarySearchIterative(int[] array, int size, int x){
		int start = 0;
		int end = size - 1;
		
		while(start <= end){
			int mid = (start + end)/2;
			if(array[mid] == x)
				return mid;
			else if(x < array[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
	
	static int BinarySearchRecursive(int array[], int low, int high, int x){
		if(low > high)
			return -1;
		
		int mid = (low + high)/2;
		
		if(x == array[mid])
			return mid;
		else if (x < array[mid]){
			return BinarySearchRecursive(array, low, mid-1, x);
		}else{
			return BinarySearchRecursive(array, mid+1, high, x);
		}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,6,13,21,36,47,63,81,97};
		int x = 13;
		
		//Iterative Search
		int index = BinarySearchIterative(array, array.length, x);
		System.out.println("Binary Search Iterative");
		if(index == -1)
			System.out.println("Can't find the value " + x );
		else
			System.out.println("The value " + x + " is found at index " + index);
		
		//Recursive Search
		x = 103;
		index = BinarySearchRecursive(array, 0, array.length-1, x);
		System.out.println("Binary Search Recursive");
		if(index == -1)
			System.out.println("Can't find the value " + x);
		else
			System.out.println("The value " + x + " is found at index " + index);
		
	}

}
