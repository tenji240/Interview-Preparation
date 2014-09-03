package careercup;

public class MicrosoftBigO {
	
	public static void main(String[] args){
		int n = 10;
		
		//this loop should run in O(n^3) time
		//the structure of the suggests so, since there are 
		//three different for-loops
		for(int i = 0; i < n-2; ++i)
			for(int j = i+1;j < n-1; ++j)
				for(int k = 0; k < n; ++k)
					System.out.println(i + " " + j + " " + k);
		
	}
	
}
