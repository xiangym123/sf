package xiang.ym.Heap;

public class GetKMaxForHeapMin {
	
	static private int[] tree = {4,3,1,6,10,7};
	public static void main(String[] args) {
		System.out.println(getKmax(tree,3));;
	}
	static public int getKmax(int[] tr ,int k){
		if( tr==null || tr.length==0 )
			return -1;
		int[] KHeap = new int[k]; //建成一个有K个数的堆
		for (int i = 0; i < k; i++) {
            heapInsert(KHeap, tr[i], i);
        }
		for (int i = k; i < tr.length; i++) {
			if(KHeap[0]<tr[i]) {
				KHeap[0] = tr[i];
				HeapMin.heapify(KHeap, 0, KHeap.length);
			}
			
           
        }
		
		
		
		
		for (int i = 0; i < KHeap.length; i++) {
			System.out.println(KHeap[i]);
		}
		
		return KHeap[0];
		
	}
	public static void heapInsert(int[] KHeap, int num, int i) {
		KHeap[i] = num ;
		HeapMin.heapifyMin(KHeap, i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
