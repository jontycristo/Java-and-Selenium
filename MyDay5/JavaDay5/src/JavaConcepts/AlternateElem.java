package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class AlternateElem {

	public static void main(String[] args) {
		Object table[][] = new Object[3][5];
		table[0][0]="20";
		table[0][1]="30";
		table[0][2]="40";
		
		table[1][0]="John";
		table[1][1]="Steve";
		table[1][2]="Mike";
		
		table[2][0]="85236974";
		table[2][1]="974";
		table[2][2]="85";
		
		int a=table.length;
		int b=table[0].length;
		
		System.out.println(b);
		
		
int[] num = {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,3,11,1};
		
		int len = num.length;
		int count = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<len;i++)
		{
			if(map.containsKey(num[i]))
			{
				map.put(num[i], map.get(num[i])+1);
			}
			else
				map.put(num[i], 1);
		}

		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+" is repeated "+m.getValue()+" times");
		}

	}

}
