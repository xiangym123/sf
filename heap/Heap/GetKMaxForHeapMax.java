package xiang.ym.Heap;

public class GetKMaxForHeapMax {

	public static void main(String[] args) {
		  int[] tree = {4,22,34,100,8,62,9,10,7};
		  System.out.println(getKmax(tree,1));;
		  for (int i = 0; i < tree.length; i++) {
			//System.out.println(tree[i]);
		}
	}
	static public int getKmax(int[] tr ,int k){
		HeapMax.buildHeap(tr,tr.length);
		int n= tr.length;
		for (int i = 0; i < k-1; i++) {
			n--;
			HeapMax.swap(tr, 0, n);
			
			HeapMax.heapify(tr, n, 0);
		}
		
		
		return tr[0];
		
	}

}
