package JavaConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectAPI {

	public static void main(String[] args) {
		ArrayList<String> tab= new ArrayList<>();
		tab.add("Cristo");
		tab.add("Jonty");
		tab.add("");
		
		int a=tab.size();
		System.out.println(a);
		
		for(int i=0;i<tab.size();i++)
		{
			System.out.println(tab.get(i));
		}
		System.out.println("=======================================");
		
		HashSet<String> list= new HashSet<String>();
		list.add("Cristo");
		list.add("Jonty");
		list.add("Agnel");
		list.add("Jones");
		list.add("Venista");
		list.add("Jessy");
		list.add("Cristo");
		
		int count=list.size();
		
		System.out.println(count);
		
		
		System.out.println("=======================================");
		
		HashMap<String,String> table= new HashMap<>();
		table.put("Name", "Cristo");
		table.put("Name", "Jonty");
		table.put("Name", "Kannan");
		table.put("Name", "Arun");
		table.put("Name", "Maharaja");
		table.put("Location", "Mumbai");
		table.put("Location", "Pune");
		table.put("Location", "Tamil Nadu");
		table.put("Location", "Sion");
		
		int tabcount=table.size();
		
		System.out.println(table.get("Name"));
		System.out.println(table.get("Location"));
		
		for(int i=0; i<tabcount;i++)
		{
			
		}
		
		
		

	}

}
