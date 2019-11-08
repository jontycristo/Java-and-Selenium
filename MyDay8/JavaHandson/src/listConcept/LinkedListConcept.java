package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Tom");
		ll.add("Jerry");
		ll.add("Steve");

		System.out.println(ll.get(0));

		System.out.println("******************************");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		ll.addFirst("Cris");

		System.out.println("******************************");
		System.out.println(ll.getFirst());

		System.out.println("******************************");
		ll.addLast("Mike");

		System.out.println(ll.getLast());

		System.out.println("***************For Loop***************");
		// For loop
		ll.set(4, "Peter");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("******************************");
		ll.remove(4);
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("******************************");
		System.out.println("Content of LinkList: " + ll);

		System.out.println("***********Advance For Loop*******************");
		// Advance For Loop
		for (String str : ll) {
			System.out.println(str);
		}

		System.out.println("***********Iterator*******************");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("***********While Loop*******************");
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
