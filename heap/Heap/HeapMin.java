package xiang.ym.Heap;

public class HeapMin {

	public static void main(String[] args) {
		int[] tree = {4,8,3,9,10,7};
		//heapify(tree,0);
		heapifySort(tree,tree.length);
		//heapifyMin(tree,tree.length);
		for(int m : tree) {
			System.out.println(m);
		}
	}
	public static void heapifySort(int[] tree,int n) {
		heapifyMin(tree,n);
		for(int i = n-1;i>0;i--) {
			swap(tree,i,0);
			heapify(tree,0,i);
		}
	}
	public static void heapifyMin(int[] tree,int n) {
		int last = (tree.length-1)/2;
		for(int i= last;i>=0;i--) {
			heapify(tree,i,n);
		}
		
	}
	public static void heapify(int[] tree,int i,int n) {
		//int n = tree.length;
		if(i>=n) {
			return;
		}
		int c1 = 2*i+1;
		int c2 = 2*i+2;
		int min = i;
		if(c1 < n && tree[c1] < tree[min]) {
			min = c1;
		}
		if(c2 < n && tree[c2] < tree[min]) {
			min = c2;
		}
		if(min != i) {
			swap(tree,min,i);
			heapify(tree,min,n);
		}
		
		
	}
	public static void swap(int[] tree,int min,int i) {
		int temp = tree[min];
		tree[min] = tree[i];
		tree[i] = temp;
	}
}
