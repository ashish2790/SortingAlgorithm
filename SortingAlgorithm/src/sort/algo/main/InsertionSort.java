package sort.algo.main;

public class InsertionSort {

	/**
	 * @author ashish.bhavsar
	 * Time complexity for bubble sort is O(n^2)
	 * @param Integer array
	 * @return
	 */
	public static void sort(int []a){
		for(int i = 1; i < a.length ; i++){
			int current = a[i]; // get current element from array
			int j = i - 1;
			while(j >= 0 && current < a[j]){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = current;
		}
	}
}
