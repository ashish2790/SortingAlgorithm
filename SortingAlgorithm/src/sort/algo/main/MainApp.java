package sort.algo.main;

public class MainApp {

	public static void main(String args[]){
		int a[] = {2,3,1,34,5};
		//BubbleSort.recurresive(a, a.length);
		//InsertionSort.sort(a);
		SelectionSort.sort(a);
		for(int ar : a){
			System.out.println(ar);
		}
	}
}
