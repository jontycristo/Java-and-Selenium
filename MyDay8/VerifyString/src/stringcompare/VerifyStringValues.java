package stringcompare;

import java.util.Arrays;

public class VerifyStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] list = {"1,2,3,d,f,c,a,3,2,f,v,g,s,a"};
		
		int count = list.length;
		
		System.out.println(count);
		
		for(int i = 0; i<list.length; i++)
		{
			int [] conv = Arrays.asList(list[i]).stream().mapToInt(Integer::parseInt).toArray();
			
		System.out.println(conv[i]);
		}

	}

}
