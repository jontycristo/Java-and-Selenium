package javacode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateValuesConcept {

	public static void main(String[] args) {
		String names[] = { "Java", "C", "Ruby", "UFT", "Java", "Python", "C" };

		for (int i = 0; i <= names.length - 1; i++) {
			for (int j = i + 1; j <= names.length - 1; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Value: " + names[i]);
				}

			}
		}
		System.out.println("************************************");
		Set<String> s = new HashSet<String>();
		for (String name : names) {
			if (s.add(name) == false) {
				System.out.println("Duplicate Value: " + name);
			}
		}

		System.out.println("************************************");

		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = m.get(name);
			if (count == null) {
				m.put(name, 1);
			} else {
				m.put(name, ++count);
			}

		}

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate Value: " + entry.getKey());
			}
		}

	}

}
