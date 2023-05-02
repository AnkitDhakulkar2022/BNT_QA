package Nilima_23;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment13_DuplicateElementArrayFind {
	public static void main(String[] args) {
		
		int arr[] = {2, 4, 5, 6, 2, 5, 6, 2, 7};

		Map<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		Set<Entry<Integer, Integer>> entry = hm.entrySet();
		
		for (Entry<Integer, Integer> ent : entry) {
			if (ent.getValue() > 1) {
				System.out.println("Duplucate Element of array: " + ent.getKey());
			}
		}
	}
}
