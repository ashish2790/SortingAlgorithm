package sort.algo.main;

public class BubbleSort {
	/**
	 * @author ashish.bhavsar
	 * Time complexity for bubble sort is O(n^2)
	 * @param a
	 * @return
	 */
	public static int[] sort(int a[]){
		
		boolean sorted = false;
		int temp = 0;
		while(!sorted){
			sorted = true;
			for(int i = 0 ;i < a.length - 1; i++){
				if(a[i] > a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					sorted = false;
				}
			}
		}
		return a;
	}
	
	public static void recurresive(int arr[], int n){
		 if(n==1)
			 return;
		 int temp = 0;
		 for(int i = 0;i<n-1;i++){
			 if(arr[i] > arr[i+1]){
				 temp = arr[i];
				 arr[i] = arr[i+1];
				 arr[i+1] = temp;
			 }
		 }
		 
		 recurresive(arr,n-1);
	}
}
