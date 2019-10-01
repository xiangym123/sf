package xiang.ym.Heap;

public class HeapMax {

	public static void main(String[] args) {
		
		int[] tree = {4,3,8,9,10,2};
		//buildHeap(tree, tree.length);
		heapifySort(tree, tree.length);
		for(int m : tree) {
			System.out.println(m);
		}
		
		
	}
	
	//排序
	public static void heapifySort(int[] tree,int n) {
		buildHeap(tree,n);
		for(int i = n-1;i>0;i--) {
			swap(tree,i,0);
			heapify(tree,i,0);
		}
	}
	
	//堆化
	public static void heapify(int[] tree,int n,int i) {
		if(i >= n) {
			return ;
		}
		int c1 = 2*i+1;
		int c2 = 2*i+2;
		int max = i;
		if(c1 < n && tree[c1] > tree[max]) {
			max = c1;
		}
		if(c2 < n && tree[c2] > tree[max]) {
			max = c2;
		}
		if(max != i) {
			swap(tree,max,i);
			heapify(tree,n,max);
		}
	}
	//建堆  最大堆
	static void  buildHeap(int tree[],int n) {
		int lastNode =  n-1 ;
		int parent = (lastNode-1)/2;
		for(int i = parent;i>=0;i--) {
			heapify(tree, n, i);
		}
	}
	public static void swap(int[] tree,int max,int i) {
		int temp = tree[max];
		tree[max] = tree[i];
		tree[i] = temp;
	}
}
