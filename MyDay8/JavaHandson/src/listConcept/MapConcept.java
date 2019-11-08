package listConcept;

import java.util.HashMap;
import java.util.Map.Entry;


public class MapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "UFT");
		hm.put(4, "LoadRunner");
		
		for(Entry m: hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());			
		}
		hm.put(5, "SOATest");
		hm.remove(4);
		
		EmployeeClass em1 = new EmployeeClass("John", 25, "Admin");
		EmployeeClass em2 = new EmployeeClass("Steve", 27, "QA");
		EmployeeClass em3 = new EmployeeClass("Drek", 29, "Dev");
		
		HashMap<Integer, EmployeeClass> hsm = new HashMap<Integer, EmployeeClass>();
		
		hsm.put(1, em1);
		hsm.put(2, em2);
		hsm.put(3, em3);
		
		for(Entry<Integer,EmployeeClass> m:hsm.entrySet()){
			int key = m.getKey();
			EmployeeClass e = m.getValue();
			System.out.println("Employee "+key+" Info");
			System.out.println(e.name+" "+e.age+" "+e.dep);
		}
	}

}
