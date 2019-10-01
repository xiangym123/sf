package xiang.ym.Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 347. Top K Frequent Elements
 * 
 * @author xiangym
 *
 */
public abstract class TopKFrequentElements {
	public static void main(String[] args) {

	}

	public List<Integer> topKFrequentB(int[] nums, int k) {
		List<Integer> res = new ArrayList();
		// ʹ���ֵ䣬ͳ��ÿ��Ԫ�س��ֵĴ�����Ԫ��Ϊ����Ԫ�س��ֵĴ���Ϊֵ
		HashMap<Integer, Integer> map = new HashMap();
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}

		// Ͱ����
		// ��Ƶ����Ϊ�����±꣬���ڳ���Ƶ�ʲ�ͬ�����ּ��ϣ������Ӧ�������±�
		List<Integer>[] list = new List[nums.length + 1];
		for (int key : map.keySet()) {
			// ��ȡ���ֵĴ�����Ϊ�±�
			int i = map.get(key);
			if (list[i] == null) {
				list[i] = new ArrayList();
			}
			list[i].add(key);
		}

		// ������������ȡ����˳��Ӵ�С������
		for (int i = list.length - 1; i >= 0 && res.size() < k; i--) {
			if (list[i] == null)
				continue;
			res.addAll(list[i]);
		}
		return res;

	}

	public List<Integer> topKFrequentA(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap();
		for (int num : nums) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return map.get(o1) - map.get(o2);
			}

		});

		for (Integer key : map.keySet()) {
			if (pq.size() < k) {
				pq.add(key);
			} else {
				if (map.get(key) > map.get(pq.peek())) {
					pq.remove();
					pq.add(key);
				}
			}
		}
		List<Integer> res = new ArrayList<>();
		while (!pq.isEmpty()) {
			res.add(pq.remove());
		}
		return res;

	}
}
