package listConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable h = new Hashtable();
		h.put(1, "John");
		h.put(2, "Mike");
		h.put(3, "Slade");
		
		Hashtable h1 = new Hashtable();
		h1=(Hashtable)h.clone(); //need to Type Cast Hashtable
		
		System.out.println("Values from H: "+h);
		System.out.println("Values from H1: "+h1);
		
		h.clear();
		System.out.println("Values from H: "+h);
		System.out.println("Values from H1: "+h1);
		
		if(h1.containsValue("Slade")){
			System.out.println("Value found");
		}
		
		Hashtable st = new Hashtable();
		st.put("A", "Selenium");
		st.put("B", "QTP");
		st.put("C", "LoadRunner");
		
		Enumeration e =st.elements();
		System.out.println("Print using Enumeration");
		
		while(e.hasMoreElements()){
			System.out.println("Values of HashTable: "+e.nextElement());
		}
		
		System.out.println("Print using EntrySet");
		Set s = st.entrySet();
		
		System.out.println("Value through set: "+s);
		
		System.out.println("Hashcode: "+st.hashCode());
		
		//Hascode contains only Unique key,Value
		//No Null key and Null Values it will return NullPointerException
			
	}

}
