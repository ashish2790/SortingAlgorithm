package sort.algo.main;

/**
 * 
 * @author ashish.bhavsar
 *
 * Select min element first and swap it with first and so on
 */
public class SelectionSort {
	/**
	 * @author ashish.bhavsar
	 * Time complexity for bubble sort is O(n^2)
	 * @param a
	 * @return
	 */
	public static void sort(int a[]){
		for(int i = 0;i < a.length - 1 ; i++){
			int min = a[i];
			int minInd = i;
			for(int j = i+1 ; j < a.length ;j++){
				if(a[j] < min){
					min  = a[j];
					minInd = j;
				}
			}
			int temp = a[i];
			a[i] = min;
			a[minInd] = temp;	
		}
	}
}
