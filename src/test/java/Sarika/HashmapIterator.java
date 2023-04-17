package Sarika;

import java.util.HashMap;

public class HashmapIterator {
	public static void main(String[] args) {
		
	Character[] number = { 'a', 'a', 'b', 'f', 'l', 'n', 'a' };
			HashMap<Character, Integer> map = new HashMap();{

			for (int i = 0; i < number.length; i++) {
				if (map.containsKey(number[i])) {// a
					Integer value = map.get(number[i]);// 1
					map.put(number[i], ++value);
				} else
					map.put(number[i], 1);

			}
			System.out.println(map);
}
}
}